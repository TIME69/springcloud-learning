package com.github.TIME69.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述~
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/14
 */

@RestController
public class HelloController {
    @Value("${foo}")
    String name;

    @RequestMapping(value = "/hi")
    public String hi(){
        return name;
    }
}
