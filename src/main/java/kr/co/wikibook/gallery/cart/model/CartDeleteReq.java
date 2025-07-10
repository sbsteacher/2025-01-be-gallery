package kr.co.wikibook.gallery.cart.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.BindParam;

@Getter
@Setter
public class CartDeleteReq {
    private int cartId;
    private int memberId;

    public CartDeleteReq(@BindParam("cart_id") int cartId) {
        this.cartId = cartId;
    }
}
