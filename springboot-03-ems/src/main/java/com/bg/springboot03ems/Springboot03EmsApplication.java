package com.bg.springboot03ems;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.bg.springboot03ems.mapper"})
public class Springboot03EmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot03EmsApplication.class, args);
    }

}
