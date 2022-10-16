package com.bg.springboot02thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class TheymeleafTemplates {
    @RequestMapping("/t1")
    public String hello(Model model){
        model.addAttribute("msg","hello,theymeleaf");
        model.addAttribute("users", Arrays.asList("张三","李四","王五"));
        model.addAttribute("cars",Arrays.asList("toyato","benz","五菱"));
        return "hello";
    }
}
