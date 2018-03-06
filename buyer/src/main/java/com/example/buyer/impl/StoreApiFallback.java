package com.example.buyer.impl;

import com.example.petservice.api.StoreApi;
import com.example.petservice.entity.Girl;
import org.springframework.stereotype.Component;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/5 16:17
 */
@Component
public class StoreApiFallback implements StoreApi {
    @Override
    public Girl sell() {
        return new Girl("beautiful girl age 18");
    }
}