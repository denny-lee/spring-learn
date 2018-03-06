package com.example.buyer.impl;

import com.example.petservice.api.StoreApi;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/6 13:18
 */
@Service
public class BuyService {
    private static final Logger logger = LoggerFactory.getLogger(BuyService.class);

    @Autowired
    private StoreApi storeApi;
//    @Autowired
//    private StoreApiFallback storeApiFallback;

//    @HystrixCommand(fallbackMethod = "buyFail")
    public Object buy() {
        return storeApi.sell();
    }

//    public Object buyFail() {
//        logger.info("buyFail buyFail -------------------------");
//        return storeApiFallback.sell();
//    }
}
