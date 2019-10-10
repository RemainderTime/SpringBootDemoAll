package com.xf._04_springboot_jpa.dao;

import com.xf._04_springboot_jpa.bean.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:44 2019/10/9
 * @description :AccountDao接口
 */
@Repository
public interface AccountDao extends JpaRepository<Account,Integer> {
}
