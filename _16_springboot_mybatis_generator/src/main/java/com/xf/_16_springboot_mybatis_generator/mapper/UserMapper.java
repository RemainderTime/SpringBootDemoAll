package com.xf._16_springboot_mybatis_generator.mapper;

import com.xf._16_springboot_mybatis_generator.pojo.User;
import java.util.List;

public interface UserMapper {
    /**
     * 
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 
     */
    int insert(User record);

    /**
     * 
     */
    User selectByPrimaryKey(Integer id);

    /**
     * 
     */
    List<User> selectAll();

    /**
     * 
     */
    int updateByPrimaryKey(User record);
}