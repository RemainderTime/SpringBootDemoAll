package com.xf._09_springboot_redis.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 11:09 2019/10/10
 * @description :CustomRepository的dao层类
 */
@Repository
public class RedisRepository {

    @Autowired
    private RedisTemplate redisTemplate;

    public void setKey(String key,String value){
        ValueOperations<String,String> ops=redisTemplate.opsForValue();
        //设置过期时间
        ops.set(key,value,5, TimeUnit.MINUTES);
    }

    public String getValue(String key){
        ValueOperations<String,String> valueOperations = this.redisTemplate.opsForValue();
        return valueOperations.get(key);
    }
}
