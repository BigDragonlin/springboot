package com.bg.springboot05mybatisplus;

import cn.hutool.core.util.RandomUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bg.springboot05mybatisplus.domain.Emp;
import com.bg.springboot05mybatisplus.service.impl.EmpServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;


@SpringBootTest
class Springboot05MybatisplusApplicationTests {

    @Autowired
    private EmpServiceImpl empService;

    //添加操作
    @Test
    void contextLoads() {
        Emp emp = new Emp("张三", "MANAGER");
        empService.save(emp);
    }

    //修改操作
    @Test
    void test1() {
        Emp emp = new Emp(8001,"李四", "MANAGER");
        empService.updateById(emp);
    }
    //test update and insert
    @Test
    void test3() {
        Emp emp = new Emp(8009,"王二牛", "CLERK");
        empService.updateById(emp);
    }

    //测试条件构造器
    @Test
    void test4() {
        final QueryWrapper<Emp> empQueryWrapper = new QueryWrapper<>();
        empQueryWrapper.getSqlSelect();
        final List<Emp> list = empService.list(empQueryWrapper);
        list.forEach(System.out::println);
    }

    //测试lambda条件构造器
    @Test
    void test5(){
        final LambdaQueryWrapper<Emp> empLambdaQueryWrapper = new LambdaQueryWrapper<>();
        empLambdaQueryWrapper.isNotNull(Emp::getCOMM);
        final List<Emp> list = empService.list(empLambdaQueryWrapper);
        list.forEach(System.out::println);

    }

    @Autowired
    private JavaMailSenderImpl mailSender;
    //测试mail发送
    @Test
    void Test6(){
        final SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("叫醒服务");
        simpleMailMessage.setText("起床工作了");
        simpleMailMessage.setTo("bigdragonlin@qq.com");
        simpleMailMessage.setFrom("bgdragon@163.com");
        for (int i = 0; i < 10; i++) {
            mailSender.send(simpleMailMessage);
        }
    }

    //复杂邮件发送

    @Test
    void Test7() throws MessagingException {
        final MimeMessage mimeMessage = mailSender.createMimeMessage();
        final MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage,true);
        mimeMessageHelper.setSubject("复杂文件发送");
        mimeMessageHelper.setText("\"<b style='color:red'>今天 7:30来开会</b>\"",true);
        mimeMessageHelper.addAttachment("2.pptx",new File("C:\\Users\\Administrator\\Desktop\\2.pptx"));
        mimeMessageHelper.setTo("bigdragonlin@qq.com");
        mimeMessageHelper.setFrom("bgdragon@163.com");
        mailSender.send(mimeMessage);

    }

    @Test
    void Test8(){
        final int i = RandomUtil.randomInt(99999);
        System.out.println("随机数"+i);
    }
}
