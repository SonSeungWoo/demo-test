package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTemplateTests {

    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    public void REDIS조회() {
        System.out.println("============");
        String key = "HO_HOTEL_CODE_MAPPING:300005:OISWUBSH:HOTEL_CODE";
        String value = redisTemplate.opsForValue().get(key);
        System.out.println("value = " + value);
        System.out.println("============");
    }

    @Test
    public void REDIS등록() {
        String key = "key:springboot";
        redisTemplate.opsForValue().set(key, "Hello");
        String value = redisTemplate.opsForValue().get(key);

        Assert.assertEquals("Hello", value);
    }
}
