package com.example.buyer.controller;

import com.example.buyer.impl.BuyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/5 17:22
 */
@RestController
public class BuyController {
    Logger logger = LoggerFactory.getLogger(BuyController.class);

    @Autowired
    private BuyService buyService;

    @GetMapping("/buy")
    public Object buy(@RequestParam("token") String token) {
        logger.info("token : {}", token);
        return buyService.buy();
    }
}
