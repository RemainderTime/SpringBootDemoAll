package com.xf._07_springboot_tracstion_mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 17:11 2019/10/9
 * @description :
 */
@Mapper
@Repository
public interface AccountMapper {

    int update(@Param("money") double money, @Param("id") int  id);
}
