package com.example.buyer.conf;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/7 19:53
 */
@Configuration
public class BarConf {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
