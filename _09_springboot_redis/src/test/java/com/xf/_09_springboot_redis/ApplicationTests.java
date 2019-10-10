package com.xf._09_springboot_redis;

import com.xf._09_springboot_redis.dao.RedisRepository;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    public static Logger logger= LoggerFactory.getLogger(ApplicationTests.class);

    @Autowired
    private RedisRepository redisRepository;

    /**
     * 测试
     */
    @Test
    public void contextLoads() {
        redisRepository.setKey("11","java");
        redisRepository.setKey("33","python");

        logger.info(redisRepository.getValue("11"));
        logger.info(redisRepository.getValue("22"));
    }

}
