package com.xf._08_springboot_mongodb.entity;

import org.springframework.data.annotation.Id;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 10:20 2019/10/10
 * @description :实体类
 */
public class Customer {

    @Id
    private String id;

    private String firstName;

    private String lastName;

    public Customer( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
