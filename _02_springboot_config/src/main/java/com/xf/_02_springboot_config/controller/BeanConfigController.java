package com.xf._02_springboot_config.controller;

import com.xf._02_springboot_config.bean.BeanConfig;
import com.xf._02_springboot_config.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:03 2019/10/9
 * @description : 特殊改变的配置文件使用控制类 02 03
 */
@RestController
@EnableConfigurationProperties({BeanConfig.class,User.class})  //配置文件对应得实体类
public class BeanConfigController {

    @Autowired
    BeanConfig beanConfig;

    @RequestMapping("/bean")
    public String beanConfig(){
        return beanConfig.getSex()+"//"+beanConfig.getMax()+"//"+beanConfig.getMin()+"//"+beanConfig.getUuid();
    }

    @Autowired
    User user;

    @RequestMapping("/user")
    public String getUser(){
        return user.getName()+"/"+user.getAge();
    }
}
