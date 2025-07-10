package kr.co.wikibook.gallery.cart.model;

import lombok.Getter;

@Getter
public class CartGetRes {
    private int id;
    private int itemId;
    private String name;
    private int price;
    private String imgPath;
    private int discountPer;
}
