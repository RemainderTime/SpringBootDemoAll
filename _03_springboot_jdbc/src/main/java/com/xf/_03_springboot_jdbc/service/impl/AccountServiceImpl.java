package com.xf._03_springboot_jdbc.service.impl;

import com.xf._03_springboot_jdbc.bean.Account;
import com.xf._03_springboot_jdbc.dao.AccountDao;
import com.xf._03_springboot_jdbc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:14 2019/10/9
 * @description : AccountService实现类
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public int add(Account account) {
        return 0;
    }

    @Override
    public int update(Account account) {
        return 0;
    }

    @Override
    public int delete(int id) {
        return 0;
    }

    @Override
    public Account findAccountById(int id) {
        return null;
    }

    @Override
    public List<Account> findAccountList() {
        return null;
    }
}
