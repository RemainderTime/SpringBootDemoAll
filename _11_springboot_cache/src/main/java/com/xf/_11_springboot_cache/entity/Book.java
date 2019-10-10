package com.xf._11_springboot_cache.entity;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:23 2019/10/10
 * @description :实体类
 */
public class Book {

    private String isbn;
    private String title;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
