package com.bg.springboot06redis;

import cn.hutool.json.JSONUtil;
import com.bg.springboot06redis.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.hash.ObjectHashMapper;

@SpringBootTest
class Springboot06RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;
    @Test
    void contextLoads() {
        final User user = new User("曹梦", 27);
//        final String s = JSONUtil.toJsonStr(user);
        redisTemplate.opsForValue().set("user",user);
        System.out.println(redisTemplate.opsForValue().get("user"));
    }

}
