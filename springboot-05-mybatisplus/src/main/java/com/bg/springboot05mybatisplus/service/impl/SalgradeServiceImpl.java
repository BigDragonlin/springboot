package com.bg.springboot05mybatisplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bg.springboot05mybatisplus.domain.Salgrade;
import com.bg.springboot05mybatisplus.service.SalgradeService;
import com.bg.springboot05mybatisplus.mapper.SalgradeMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【salgrade】的数据库操作Service实现
* @createDate 2022-10-16 15:37:35
*/
@Service
public class SalgradeServiceImpl extends ServiceImpl<SalgradeMapper, Salgrade>
    implements SalgradeService{

}




