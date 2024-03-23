package com.imooc.springcloud.hystrix;

import com.imooc.springcloud.Friend;
import com.imooc.springcloud.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 23:23
 */
@Slf4j
@Component
public class Fallback implements MyService {
    @Override
    public String sayHi() {
        return null;
    }

    @Override
    public Friend sayHi(Friend friend) {
        return null;
    }

    @Override
    public String error() {
        log.info("enter fallback");
        return "I am not a black sheep anymore";
    }

    @Override
    public String retry(Integer timeout) {
        return "you are late";
    }
}
