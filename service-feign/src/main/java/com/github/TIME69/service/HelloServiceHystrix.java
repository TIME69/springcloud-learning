package com.github.TIME69.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * 描述: 熔断器
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/14
 */
@Component
public class HelloServiceHystrix implements HelloService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry can not service!";
    }
}
