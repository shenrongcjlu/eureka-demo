package com.imooc.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/12 20:57
 */
@FeignClient("eureka-client")
public interface IService {

    @GetMapping("/sayHi")
    String sayHi();

}
