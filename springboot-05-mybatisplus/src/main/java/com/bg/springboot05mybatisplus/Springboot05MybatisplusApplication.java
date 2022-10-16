package com.bg.springboot05mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//都是细节呀
@MapperScan(basePackages = {"com.bg.springboot05mybatisplus.mapper"})
public class Springboot05MybatisplusApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot05MybatisplusApplication.class, args);
    }

}
