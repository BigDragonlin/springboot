package com.bg.springboot05mybatisplus.controller;

import com.bg.springboot05mybatisplus.domain.Emp;
import com.bg.springboot05mybatisplus.service.impl.EmpServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Slf4j
@Controller
public class EmpController {
    @Autowired
    EmpServiceImpl empService;

    @RequestMapping("/emps")
    public String showEmp(Model model){
        final List<Emp> list = empService.list(null);
        model.addAttribute("emps",list);
        return "/emp/list";
    }
}
