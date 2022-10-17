package com.bg.springboot05mybatisplus.controller;

import com.bg.springboot05mybatisplus.domain.Dept;
import com.bg.springboot05mybatisplus.domain.Emp;
import com.bg.springboot05mybatisplus.service.DeptService;
import com.bg.springboot05mybatisplus.service.impl.DeptServiceImpl;
import com.bg.springboot05mybatisplus.service.impl.EmpServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.websocket.server.PathParam;
import java.util.List;

@Slf4j
@Controller
public class EmpController {
    @Autowired
    EmpServiceImpl empService;

    @Autowired
    DeptServiceImpl deptService;

    /**
     * 把emps给前端
     * @param model
     * @return
     */
    @RequestMapping("/temps")
    public String showEmp(Model model){
        final List<Emp> list = empService.list(null);
        model.addAttribute("temps",list);
        return "/emp/list";
    }

    /**
     * 添加emp中获取dept
     * @param model
     * @return
     */
    @RequestMapping("/emp/addEmp")
    public String add(Model model){
        log.info("添加emp");
        final List<Dept> list = deptService.list(null);
        model.addAttribute("depts",list);
        return "/emp/addEmp";
    }

    /**
     * 添加emp
     * @param emp
     * @param model
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(Emp emp,Model model){
        final boolean save = empService.save(emp);
        if (save){
            model.addAttribute("addMsg","添加成功");
            return  "/emp/addEmp";
        }
        model.addAttribute("addMsg","添加失败，请重试");
        return "/emp/addEmp";
    }

    /**
     * 修改emp,获取要修改的信息
     * @param EMPNO
     * @param model
     * @return
     */
    @RequestMapping("/emp/updateEmp/{EMPNO}")
    public String updateEmp(@PathVariable("EMPNO") Integer EMPNO,Model model){
        log.info("修改emp,id={}",EMPNO);
        final Emp emp = empService.getById(EMPNO);
        log.info("修改emp==>",emp.toString());
        final List<Dept> list = deptService.list(null);
        model.addAttribute("depts",list);
        model.addAttribute("updateEmp",emp);
        return "/emp/updateEmp";
    }

    /**
     * 修改emp
     * @param emp
     * @param model
     * @return
     */
    @PostMapping("/emp/updateEmp")
    public String updateByid(Emp emp,Model model){
        log.info("现在要更新emp==>{}",emp);
        empService.updateById(emp);
        model.addAttribute("msg","更新成功");
        return "redirect:/temps";
    }
    @RequestMapping("/emp/del/{EMPNO}")
    public String delEmp(@PathVariable("EMPNO") Integer EMPNO,Model model){
        log.info("删除emp,id={}",EMPNO);
        final boolean b = empService.removeById(EMPNO);
        model.addAttribute("msg",b ? "删除成功":"删除失败");
        return "redirect:/temps";
    }
}
