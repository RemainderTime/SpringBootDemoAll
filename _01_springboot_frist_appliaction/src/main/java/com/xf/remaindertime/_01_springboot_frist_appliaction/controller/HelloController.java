package com.xf.remaindertime._01_springboot_frist_appliaction.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 11:26 2019/10/9
 * @description :
 */
@RestController
public class HelloController {

    @RequestMapping("/my")
    public String hello(){
        return "hello";
    }
}
