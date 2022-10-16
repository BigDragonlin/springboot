package com.bg.springboot03ems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot03ems.domain.Dept;
import com.bg.springboot03ems.service.DeptService;
import com.bg.springboot03ems.mapper.DeptMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【dept】的数据库操作Service实现
* @createDate 2022-10-16 00:01:13
*/
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept>
implements DeptService{

}
