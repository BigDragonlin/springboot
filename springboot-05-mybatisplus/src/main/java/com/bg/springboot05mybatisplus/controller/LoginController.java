package com.bg.springboot05mybatisplus.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
@Slf4j
public class LoginController {
    @RequestMapping("/user/login")
    public String login(HttpServletRequest request, @RequestParam("userName") String userName, @RequestParam("passWord") String passWord, Model model) {
        if ((userName != null) && ("123456".equals(passWord))) {

            log.info("/user/login 登录成功");
            model.addAttribute("userInfo",userName.toString());
            request.getSession().setAttribute("userSession", UUID.randomUUID());
            return "redirect:/main.html";

        }
        model.addAttribute("msg", "请检查账号和密码");
        return "/index";
    }
}
