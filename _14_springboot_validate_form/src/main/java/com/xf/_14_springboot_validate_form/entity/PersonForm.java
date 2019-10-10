package com.xf._14_springboot_validate_form.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 15:53 2019/10/10
 * @description :实体类
 */
public class PersonForm {

    @NotNull
    @Size(min = 2,max = 18)
    private String name;

    @NotNull
    @Min(18)
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
