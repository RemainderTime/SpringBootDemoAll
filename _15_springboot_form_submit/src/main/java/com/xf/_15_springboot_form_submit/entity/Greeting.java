package com.xf._15_springboot_form_submit.entity;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 16:24 2019/10/10
 * @description :实体类
 */
public class Greeting {

    private long id;

    private String content;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}