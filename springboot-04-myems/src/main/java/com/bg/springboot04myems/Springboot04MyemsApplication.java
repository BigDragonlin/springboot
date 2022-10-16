package com.bg.springboot04myems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.bg.springboot04myems.mapper")
public class Springboot04MyemsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04MyemsApplication.class, args);
    }

}
