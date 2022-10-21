package com.bg.springboot05mybatisplus.cofig;

import com.bg.springboot05mybatisplus.controller.EmpController;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.Scheduled;
import org.w3c.dom.DocumentType;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConf {

    @Value("${swagger.enable}")
    private Boolean flag;

    //swagger的bean实例
    @Bean
    public Docket docket1() {
        System.out.println("在Docker内部，flag===》" + flag);
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("docket1")
                .apiInfo(myApiInfo())
                .enable(flag)
                .select()
                //any,扫面任意全部接口
                //basePackage(),扫描指定包接口
                //withClassAnnotation()扫描类注释接口
                //withMethodAnnotation()扫描方法注释的接口
                .apis(RequestHandlerSelectors.basePackage("com.bg.springboot05mybatisplus.controller"))
                .build();
    }

    @Bean
    public Docket docket2() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("docket2");
    }

    ApiInfo myApiInfo() {
        return new ApiInfo("bg的swagger", "api swagger", "v1.0", "baidu.com", "bigdragon", "license", "baidu.com");
    }


}
