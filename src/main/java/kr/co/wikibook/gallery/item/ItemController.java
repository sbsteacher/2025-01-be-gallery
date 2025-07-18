package kr.co.wikibook.gallery.item;

import kr.co.wikibook.gallery.item.model.ItemGetRes;
import kr.co.wikibook.gallery.item.model.ItemPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestPart MultipartFile img
                                      , @RequestPart ItemPostReq data) {
        log.info("img: {}", img);
        log.info("data: {}", data);
        int result = itemService.save(img, data);
        return ResponseEntity.ok(result);
    }

    @GetMapping
    public ResponseEntity<?> readAll(@RequestParam(name = "id", required = false) ArrayList<Integer> ids) {
        log.info("ids: {}", ids);
        List<ItemGetRes> items = itemService.findAll(ids);
        return ResponseEntity.ok(items);
    }
}
