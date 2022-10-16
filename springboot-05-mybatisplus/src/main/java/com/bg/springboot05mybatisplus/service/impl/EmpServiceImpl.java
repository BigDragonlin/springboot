package com.bg.springboot05mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot05mybatisplus.domain.Emp;
import com.bg.springboot05mybatisplus.service.EmpService;
import com.bg.springboot05mybatisplus.mapper.EmpMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【emp】的数据库操作Service实现
* @createDate 2022-10-16 15:37:35
*/
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp>
    implements EmpService{

}




