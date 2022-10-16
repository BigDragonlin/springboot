package com.bg.hello_springboot;

import com.bg.hello_springboot.entity.Dog;
import com.bg.hello_springboot.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloSpringbootApplicationTests {
    @Autowired
    Dog mydog;

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(mydog.getDog());
    }



    @Test
    void test(){
        final String s = person.toString();
        System.out.println(s);
    }
}
