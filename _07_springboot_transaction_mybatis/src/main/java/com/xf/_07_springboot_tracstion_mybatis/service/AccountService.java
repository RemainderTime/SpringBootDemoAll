package com.xf._07_springboot_tracstion_mybatis.service;

import com.xf._07_springboot_tracstion_mybatis.dao.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 17:20 2019/10/9
 * @description : AccountService类中主要使用 @Transactional 注解
 */
@Service
public class AccountService {

    @Autowired
    AccountMapper accountMapper;

    @Transactional
    public void transfer() throws RuntimeException{
        accountMapper.update(90,1);//用户1减10块 用户2加10块
        int i=1/0;
        accountMapper.update(110,2);
    }
}
