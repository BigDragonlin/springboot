package com.bg.springboot05mybatisplus.cofig;

import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyResolverLocal implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        //获取参数
        String l = request.getParameter("l");
        //获取默认local参数
        Locale locale = Locale.getDefault();
        //如果l是不为空
        if (l != null){
            String[] split = l.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }
}
