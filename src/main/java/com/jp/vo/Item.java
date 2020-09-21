package com.jp.vo;

import lombok.Data;

@Data
public class Item {

    private String id;
    private String productId;
    private int qty;
    private Sku sku;
}
