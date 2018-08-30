package com.github.TIME69.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述~
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/14
 */
@FeignClient(value = "service-hi",fallback = HelloServiceHystrix.class)
public interface HelloService {
    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}