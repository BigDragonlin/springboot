package com.bg.springboot03ems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot03ems.domain.Emp;
import com.bg.springboot03ems.service.EmpService;
import com.bg.springboot03ems.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2022-10-16 16:40:54
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




