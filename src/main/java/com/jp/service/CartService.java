package com.jp.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
@Slf4j
public class CartService {

    @Autowired
    private RestTemplate restTemplate;

    public String getCart(String cartId) {
        log.info("getting cart {}",cartId);
        return restTemplate.getForObject("http://localhost:8080/carts/shipping-options?itemIds={}",String.class, Collections.singleton("1"));
    }
}
