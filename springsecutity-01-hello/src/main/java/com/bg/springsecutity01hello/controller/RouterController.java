package com.bg.springsecutity01hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouterController {
    @RequestMapping({"/","/index"})
    public String index(){
        return "/index";
    }
    @RequestMapping("/login")
    public String login(){
        return "/login";
    }
    @RequestMapping("/logout")
    public void logout(){

    }

    @RequestMapping("/level1/{id}")
    public String level1(@PathVariable Integer id){
        return "/views/level1/"+id;
    }

    @RequestMapping("/level2/{id}")
    public String level2(@PathVariable Integer id){
        return "/views/level1/"+id;

    }@RequestMapping("/level3/{id}")
    public String level3(@PathVariable Integer id){
        return "/views/level1/"+id;
    }



}
