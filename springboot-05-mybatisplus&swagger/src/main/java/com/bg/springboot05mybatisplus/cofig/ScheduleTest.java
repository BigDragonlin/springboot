package com.bg.springboot05mybatisplus.cofig;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleTest {
    //swagger 具体配置
    @Scheduled(cron = "0/2 * * * * ?")
    public void scheduledTest(){
        System.out.println("hello,word!!");
    }
}
