package com.imooc.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/12 20:57
 */
@FeignClient("feign-client")
public interface IService {

    @GetMapping("/sayHi")
    String sayHi();

    @PostMapping("/sayHi")
    Friend sayHi(@RequestBody Friend friend);

}
