package com.xf._05_springboot_beatlsql.dao;

import com.xf._05_springboot_beatlsql.bean.Account;
import org.beetl.sql.core.annotatoin.SqlStatement;
import org.beetl.sql.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:19 2019/10/9
 * @description :
 */
@Repository
public interface AccountDao extends BaseMapper<Account> {

    @SqlStatement(params = "name")
    Account selectAccountByName(String name);
}
