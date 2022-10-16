package com.bg.springboot04myems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot04myems.Emp;
import com.bg.springboot04myems.service.EmpService;
import com.bg.springboot04myems.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2022-10-16 01:09:44
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




