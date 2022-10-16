package com.bg.springboot03ems.controller;

import com.bg.springboot03ems.mapper.EmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class CustomerList {

    @Autowired
    EmpMapper empMapper;

    @RequestMapping("/emps")
   public String getAllCus(Model model){
        return "/emp/list.html";
   }
}
