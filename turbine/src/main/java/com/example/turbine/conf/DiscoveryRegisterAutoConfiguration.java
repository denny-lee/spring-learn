package com.example.turbine.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.zookeeper.serviceregistry.ServiceInstanceRegistration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.net.InetAddress;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/6 11:32
 */
@Configuration
public class DiscoveryRegisterAutoConfiguration {

    @Value("${spring.application.name}")
    private String appName;

    @Value("${server.port:8080}")
    private int port;

    @Bean
    @Primary
    public ServiceInstanceRegistration zookeeperRegistration() throws Exception {
        String address = InetAddress.getLocalHost().getHostAddress();

        ServiceInstanceRegistration serviceInstanceRegistration = ServiceInstanceRegistration.builder()
                .defaultUriSpec()
                .address(address)
                .port(port)
                .name(appName)
                .build();

        serviceInstanceRegistration.getServiceInstance();

        return serviceInstanceRegistration;
    }
}
