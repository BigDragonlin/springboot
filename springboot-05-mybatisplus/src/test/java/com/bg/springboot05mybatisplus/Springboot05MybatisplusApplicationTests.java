package com.bg.springboot05mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bg.springboot05mybatisplus.domain.Emp;
import com.bg.springboot05mybatisplus.service.impl.EmpServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class Springboot05MybatisplusApplicationTests {

    @Autowired
    private EmpServiceImpl empService;

    //添加操作
    @Test
    void contextLoads() {
        Emp emp = new Emp("张三", "MANAGER");
        empService.save(emp);
    }

    //修改操作
    @Test
    void test1() {
        Emp emp = new Emp(8001,"李四", "MANAGER");
        empService.updateById(emp);
    }
    //test update and insert
    @Test
    void test3() {
        Emp emp = new Emp(8009,"王二牛", "CLERK");
        empService.updateById(emp);
    }

    //测试条件构造器
    @Test
    void test4() {
        final QueryWrapper<Emp> empQueryWrapper = new QueryWrapper<>();
        empQueryWrapper.getSqlSelect();
        final List<Emp> list = empService.list(empQueryWrapper);
        list.forEach(System.out::println);
    }

    //测试lambda条件构造器
    @Test
    void test5(){
        final LambdaQueryWrapper<Emp> empLambdaQueryWrapper = new LambdaQueryWrapper<>();
        empLambdaQueryWrapper.isNotNull(Emp::getCOMM);
        final List<Emp> list = empService.list(empLambdaQueryWrapper);
        list.forEach(System.out::println);

    }

}
