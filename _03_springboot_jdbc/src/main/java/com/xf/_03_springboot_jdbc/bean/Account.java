package com.xf._03_springboot_jdbc.bean;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:58 2019/10/9
 * @description : 实体类
 */
public class Account {
    private int id ;
    private String name ;
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
