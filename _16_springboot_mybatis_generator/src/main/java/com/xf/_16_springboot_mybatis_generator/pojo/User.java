package com.xf._16_springboot_mybatis_generator.pojo;

import java.io.Serializable;

/**
 * @author remaindertime(xiongfeng)
 * @date 2019/10/17 15:27
 * @description :
 */
public class User implements Serializable {
    /**
     * 
     */
    private Integer id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 图片地址
     */
    private String imgurl;

    /**
     * 
     */
    private Integer roleId;

    private static final long serialVersionUID = 1L;

    /**
     * @return 获取
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置
     * @id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return 获取用户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户名称
     * @name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return 获取密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     * @password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return 获取图片地址
     */
    public String getImgurl() {
        return imgurl;
    }

    /**
     * 设置图片地址
     * @imgurl
     */
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    /**
     * @return 获取
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * 设置
     * @roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}