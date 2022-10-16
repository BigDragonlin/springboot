package com.bg.springboot04myems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.bg.springboot04myems.mapper.EmployeeMapper;
import com.bg.springboot04myems.pojo.Employee;
import com.bg.springboot04myems.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
