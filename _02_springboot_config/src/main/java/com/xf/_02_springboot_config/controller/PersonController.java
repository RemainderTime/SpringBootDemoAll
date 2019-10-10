package com.xf._02_springboot_config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:50 2019/10/9
 * @description :01  基本的配置文件使用控制类
 */
@RestController
public class PersonController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private int age;

    @RequestMapping("per")
    public String getPerson(){
        return name+":"+age;
    }

}
