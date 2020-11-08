package com.yomyom.yocial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.yomyom")
@SpringBootApplication
public class YocialApplication {

    public static void main(String[] args) {
        SpringApplication.run(YocialApplication.class, args);
    }

}
