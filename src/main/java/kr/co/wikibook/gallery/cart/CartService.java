package kr.co.wikibook.gallery.cart;

import kr.co.wikibook.gallery.cart.model.CartPostReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class CartService {
    private final CartMapper cartMapper;

    public int save(CartPostReq req) {
        return cartMapper.save(req);
    }
}
