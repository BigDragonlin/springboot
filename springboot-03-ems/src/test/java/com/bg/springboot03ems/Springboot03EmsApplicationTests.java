package com.bg.springboot03ems;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.bg.springboot03ems.domain.Emp;
import com.bg.springboot03ems.mapper.EmpMapper;
import com.bg.springboot03ems.service.EmpService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot03EmsApplicationTests {

    @Autowired
    EmpMapper empMapper;
    @Test
    void contextLoads() {
        final List<Emp> emps = empMapper.selectList(null);
        System.out.println(emps.toString());
    }

}
