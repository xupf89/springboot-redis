package com.demo.test;

import com.demo.dao.RedisDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
@Component
public class TestRedis {

    @Autowired
    private RedisDao redisDao;

    @Test
    public void setEx() {
        redisDao.setEx("name", "coder", 20);
    }
}