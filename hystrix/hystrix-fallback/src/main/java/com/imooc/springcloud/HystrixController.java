package com.imooc.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 23:25
 */
@RestController
public class HystrixController {

    @Autowired
    private MyService service;

    @GetMapping("fallback")
    public String fallback() {
        return service.error();
    }

    @GetMapping("timeout")
    public String timeout(Integer timeout) {
        return service.retry(timeout);
    }
}
