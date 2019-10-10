package com.xf._07_springboot_tracstion_mybatis.entity;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 17:10 2019/10/9
 * @description :实体类
 */
public class Account {

    private int id;
    private String name;
    private double money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
