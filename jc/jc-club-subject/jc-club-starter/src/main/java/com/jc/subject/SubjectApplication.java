package com.jc.subject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 刷图微服务启动类
 *
 * @author wxc
 * @date 2024/4/11 16:44
 */
@SpringBootApplication
@ComponentScan("com.jc")
public class SubjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SubjectApplication.class);
    }

}
