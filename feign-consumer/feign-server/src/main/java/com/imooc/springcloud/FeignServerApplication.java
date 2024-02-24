package com.imooc.springcloud;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 16:17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class FeignServerApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(FeignServerApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
