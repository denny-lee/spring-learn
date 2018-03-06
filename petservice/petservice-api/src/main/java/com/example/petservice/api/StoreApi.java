package com.example.petservice.api;

import com.example.petservice.entity.Girl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/5 15:53
 */
@FeignClient(value = "store", fallback = StoreApiFallback.class)
public interface StoreApi {

    /**
     * sell
     * @return
     */
    @GetMapping("/sell")
    Girl sell();
}