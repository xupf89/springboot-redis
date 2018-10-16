package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

public class RedisDao {


    @Autowired
    private RedisTemplate redisTemplate;

    public void set(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void setEx(String key, String value, long seconds) {
        redisTemplate.opsForValue().set(key, value,seconds, TimeUnit.SECONDS);
    }

}
