package com.bg.springboot04myems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot04myems.Dept;
import com.bg.springboot04myems.service.DeptService;
import com.bg.springboot04myems.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【dept】的数据库操作Service实现
* @createDate 2022-10-16 01:09:44
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
    implements DeptService{

}




