package com.bg.springboot05mybatisplus.cofig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@Slf4j
public class MVCConfig implements WebMvcConfigurer {
    /**
     * 视图控制器
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        log.info("进入到addViewControllers ");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("").setViewName("index");
        registry.addViewController("index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    /**
     * 拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns(
                "/**"
        ).excludePathPatterns(
                "/index.html",
                "/index",
                "/main.html",
                "/user/login",
                "/css/**",
                "/img/**",
                "/js/**",
                "/epms/**"
        );
    }

    /**
     * 本地化解决器
     * @return
     */
    @Bean
    public LocaleResolver localeResolver(){
        return new MyResolverLocal();
    }
}
