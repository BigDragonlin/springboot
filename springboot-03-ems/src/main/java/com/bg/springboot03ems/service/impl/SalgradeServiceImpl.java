package com.bg.springboot03ems.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot03ems.domain.Salgrade;
import com.bg.springboot03ems.service.SalgradeService;
import com.bg.springboot03ems.mapper.SalgradeMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【salgrade】的数据库操作Service实现
* @createDate 2022-10-16 16:40:54
*/
@Service
public class SalgradeServiceImpl extends ServiceImpl<SalgradeMapper, Salgrade>
    implements SalgradeService{

}




