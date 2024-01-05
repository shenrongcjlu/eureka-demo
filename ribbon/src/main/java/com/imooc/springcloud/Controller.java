package com.imooc.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 说明:
 *
 * @author 沈荣
 * @date 2024/1/5 23:03
 */
@RestController
public class Controller {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/sayHi")
    public String sayHi() {
        return restTemplate.getForObject("http://eureka-client/sayHi", String.class);
    }

}
