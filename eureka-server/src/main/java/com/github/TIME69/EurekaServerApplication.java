package com.github.TIME69;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 描述: 注册中心
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/14
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication  {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.run(EurekaServerApplication.class,args);
    }
}
