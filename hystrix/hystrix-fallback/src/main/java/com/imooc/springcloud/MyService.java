package com.imooc.springcloud;

import com.imooc.springcloud.hystrix.Fallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 说明：
 *
 * @author: shenrong
 * @date: 2024/2/24 23:22
 */
@FeignClient(name = "feign-server", fallback = Fallback.class)
public interface MyService extends IService {
}
