package kr.co.wikibook.gallery.item;

import kr.co.wikibook.gallery.item.model.ItemGetRes;
import kr.co.wikibook.gallery.item.model.ItemPostReq;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface ItemMapper {
    int save(ItemPostReq req);
    List<ItemGetRes> findAllByIdIn(List<Integer> ids);
}
