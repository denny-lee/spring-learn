package com.example.disconf.config;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/7 17:26
 */
@Service
@Scope("singleton")
@DisconfFile(filename = "application.properties")
public class AppConf {
    private String appName;

    @DisconfFileItem(name = "spring.application.name", associateField = "appName")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }
}
