package kr.co.wikibook.gallery.cart.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@AllArgsConstructor
public class CartDeleteReq {
    private int cartId;
    private int memberId;
}
