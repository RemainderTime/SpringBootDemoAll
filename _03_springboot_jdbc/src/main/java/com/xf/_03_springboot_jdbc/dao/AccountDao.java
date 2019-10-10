package com.xf._03_springboot_jdbc.dao;

import com.xf._03_springboot_jdbc.bean.Account;

import java.util.List;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:58 2019/10/9
 * @description :AccountDao接口
 */

public interface AccountDao {

    int add(Account account);

    int update(Account account);

    int delete(int id);

    Account findAccountById(int id);

    List<Account> findAccountList();

}
