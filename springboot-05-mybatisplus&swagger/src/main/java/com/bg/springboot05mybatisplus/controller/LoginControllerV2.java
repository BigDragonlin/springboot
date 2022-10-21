package com.bg.springboot05mybatisplus.controller;

import cn.hutool.captcha.generator.RandomGenerator;
import cn.hutool.core.util.RandomUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

@Controller
@Slf4j
@Api("登录控制器")
public class LoginControllerV2 {
    private String email;
    private Integer randomCode ;

    @ApiOperation("验证账号，传session")
    @RequestMapping("/user/loginV2")
    public String login(HttpServletRequest request, @RequestParam("email") String myEmail, @RequestParam("loginCode") String loginCode, Model model) {
        if ((myEmail == this.email) && (loginCode.equals(this.randomCode.toString()))) {
            log.info("/user/login 登录成功");
            model.addAttribute("userInfo",myEmail.toString());
            request.getSession().setAttribute("userSession", UUID.randomUUID());
            return "redirect:/main.html";

        }
        model.addAttribute("msg", "请检查账号和密码");
        return "/index";
    }

    @ApiOperation("接受前端的发送验证码请求，并且返回验证码给前端")
    @RequestMapping("/login/code")
    public void loginCode(@RequestParam String email, Model model){
        final int i = RandomUtil.randomInt( 99999);
        this.randomCode = i;
        this.email = email;
        //把验证码发送给email
    }

}
