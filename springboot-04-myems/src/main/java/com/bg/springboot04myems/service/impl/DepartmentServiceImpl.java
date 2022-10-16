package com.bg.springboot04myems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.bg.springboot04myems.mapper.DepartmentMapper;
import com.bg.springboot04myems.pojo.Department;
import com.bg.springboot04myems.service.DepartmentService;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements DepartmentService {
}
