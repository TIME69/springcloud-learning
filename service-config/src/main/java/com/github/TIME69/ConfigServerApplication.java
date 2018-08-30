package com.github.TIME69;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 描述: config模块
 * <pre>
 *  1.配置如下内容
 *      spring.application.name=config-server
 *      server.port=8888
 *      spring.cloud.config.server.git.uri=https://github.com/forezp/SpringcloudConfig/
 *      spring.cloud.config.server.git.searchPaths=
 *      spring.cloud.config.label=master
 *      spring.cloud.config.profile=dev
 *      spring.cloud.config.server.git.username=
 *      spring.cloud.config.server.git.password=
 *
 *  2.在githubhttps://github.com/forezp/SpringcloudConfig/目录下新建${application-name}-${profile}.properties文件
 *
 *  3.访问url: http://${ip}:${port}/${application-name}/${profile}/
 *
 * </pre>
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/14
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}

