package com.example.petservice.impl;

import com.example.petservice.entity.Girl;
import com.example.petservice.api.StoreApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/5 16:23
 */
@RestController
public class StoreImpl implements StoreApi {
    Logger logger = LoggerFactory.getLogger(StoreImpl.class);

    @Override
    public Girl sell() {
        logger.info("aaaa---------");
        return new Girl("japaness girl");
    }
}
