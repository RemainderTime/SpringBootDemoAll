package com.xf._03_springboot_jdbc.service;

import com.xf._03_springboot_jdbc.bean.Account;

import java.util.List;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:13 2019/10/9
 * @description :
 */
public interface AccountService {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
