package com.bg.springboot04myems.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.bg.springboot04myems.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {
}
