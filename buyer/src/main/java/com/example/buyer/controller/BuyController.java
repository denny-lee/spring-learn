package com.example.buyer.controller;

import com.example.petservice.api.StoreApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/5 17:22
 */
@RestController
public class BuyController {

    @Autowired
    private StoreApi storeApi;

    @GetMapping("/buy")
    public Object buy() {
        return storeApi.sell();
    }
}
