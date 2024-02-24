package com.imooc.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 16:17
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class FeignConsumerAdvancedApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignConsumerAdvancedApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
