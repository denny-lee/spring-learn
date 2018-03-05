package com.example.petservice.impl;

import com.example.petservice.entity.Girl;
import com.example.petservice.api.StoreApi;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/5 16:23
 */
@RestController
public class StoreImpl implements StoreApi {
    @Override
    public Girl sell() {
        return new Girl("japaness girl");
    }
}
