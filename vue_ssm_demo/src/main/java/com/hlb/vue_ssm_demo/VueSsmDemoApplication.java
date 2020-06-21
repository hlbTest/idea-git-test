package com.hlb.vue_ssm_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hlb.vue_ssm_demo.dao")
public class VueSsmDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VueSsmDemoApplication.class, args);
    }

}
