package com.hp.simple.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hp
 * @version 1.0
 * @date 2022/5/19 20:35
 */
@SpringBootApplication(
        scanBasePackages = {
                "com.hp.simple.demo"
        }
)
@MapperScan(basePackages = {
        "com.hp.simple.demo.dao.mapper"
})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
