package com.bg.springboot05mybatisplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmpController {
    @RequestMapping("/login")
    public String login(){
        return "ook";
    }
}