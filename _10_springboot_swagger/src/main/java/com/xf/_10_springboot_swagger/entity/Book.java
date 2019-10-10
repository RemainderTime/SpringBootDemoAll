package com.xf._10_springboot_swagger.entity;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:41 2019/10/10
 * @description :实体类
 */
public class Book {

    private Long id;

    private String name;

    private double price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
