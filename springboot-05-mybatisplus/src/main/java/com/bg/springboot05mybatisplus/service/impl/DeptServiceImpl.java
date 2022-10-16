package com.bg.springboot05mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot05mybatisplus.domain.Dept;
import com.bg.springboot05mybatisplus.service.DeptService;
import com.bg.springboot05mybatisplus.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【dept】的数据库操作Service实现
* @createDate 2022-10-16 15:37:35
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




