package com.bg.springboot03ems.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.Thymeleaf;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Controller
public class Login {

    /**
     * Annotation that indicates a method return value should be bound to the web
     * 这个注解标志着方法返回值应该绑在返回体当中。
     * response body. Supported for annotated handler methods.
     *支持注释处理方法
     * <p>As of version 4.0 this annotation can also be added on the type level in
     * which case it is inherited and does not need to be added on the method level.
     * 对于4.0 ，这个注释也能过被添加道这种级别，它包含他是继承的而且不必需要添加道方法的程度
     * @author Arjen Poutsma
     * @since 3.0
     * @see RequestBody
     * @see RestController
     */
    @RequestMapping("/user/login")
    public String userLogin(HttpServletRequest request, @RequestParam("passWord") String passWord, @RequestParam("userName") String userName , Model model){
        if ((userName !=null) && (passWord.equals("123456"))){
            request.getSession().setAttribute("userSession", UUID.randomUUID());
            return "redirect:/main.html";
        }

        model.addAttribute("msg","登录失败");
        return "index";
    }
}
