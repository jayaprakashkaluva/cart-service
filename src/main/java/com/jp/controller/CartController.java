package com.jp.controller;

import com.jp.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    private CartService cartService;

    public CartController(CartService cartService) {
        this.cartService=cartService;
    }

    @GetMapping("/carts/{cartId}")
    public String getCart(@PathVariable String cartId) {
        return cartService.getCart(cartId);
    }
}
