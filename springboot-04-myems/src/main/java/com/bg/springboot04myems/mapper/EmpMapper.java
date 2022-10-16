package com.bg.springboot04myems.mapper;

import com.bg.springboot04myems.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Administrator
* @description 针对表【emp】的数据库操作Mapper
* @createDate 2022-10-16 01:09:44
* @Entity com.bg.springboot04myems.Emp
*/
@Mapper
public interface EmpMapper extends BaseMapper<Emp> {

}




