package com.xf._02_springboot_config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:13 2019/10/9
 * @description :03:自定义配置文件
 */
@Configuration
@PropertySource(value = "classpath:test.properties")  //配置文件的名字
@ConfigurationProperties(prefix = "my.test")  //参数前缀配置
public class User {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
