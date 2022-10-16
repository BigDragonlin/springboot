package com.bg.springboot04myems;

import com.bg.springboot04myems.mapper.EmpMapper;
import com.bg.springboot04myems.service.impl.EmpServiceImpl;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Dictionary;
import java.util.List;

@SpringBootTest
class Springboot04MyemsApplicationTests {

    @Autowired(required = true)
    private EmpServiceImpl empService;

    @Test
    void contextLoads() {
        final List<Emp> list = empService.list();
        System.out.println(list);
    }

}
