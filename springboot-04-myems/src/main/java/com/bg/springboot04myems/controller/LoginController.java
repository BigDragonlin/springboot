package com.bg.springboot04myems.controller;

import com.bg.springboot04myems.pojo.Department;
import com.bg.springboot04myems.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller

public class LoginController {
    @Autowired
    DepartmentService departmentService;

    @RequestMapping("/userList")
    @ResponseBody
    public String userList(){
        final List<Department> list = departmentService.list();
        return list.toString();
    }
}
