package com.imooc.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 16:18
 */
@RestController
@Slf4j
public class FeignServerController implements IService {

    @Value("${server.port}")
    private String port;


    @Override
    public String sayHi() {
        return "This is" + port;
    }

    @Override
    public Friend sayHi(Friend friend) {
        log.info("You are" + friend.getName());
        friend.setPort(port);
        return friend;
    }

    @Override
    public String error() {
        throw new RuntimeException("back sheep");
    }

    @Override
    public String retry(Integer timeout) {
        while (timeout > 0) {
            try {
                Thread.sleep(1000);
                timeout--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "not retry";
    }

}
