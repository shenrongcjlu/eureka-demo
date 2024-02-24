package com.imooc.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 16:18
 */
@RestController
@Slf4j
public class FeignConsumerAdvancedController {

    @Autowired
    private IService service;

    @GetMapping("sayHi")
    public String sayHi() {
        return service.sayHi() + "consumer";
    }

    @PostMapping("sayHi")
    public Friend sayHi(Friend friend) {
        return service.sayHi(friend);
    }

}
