package com.xf._11_springboot_cache.dao.impl;

import com.xf._11_springboot_cache.dao.BookRepository;
import com.xf._11_springboot_cache.entity.Book;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:25 2019/10/10
 * @description :实现类
 */
@Component
public class BookRepositoryImpl implements BookRepository {
    @Override

    @Cacheable("books")
    public Book getByIsbn(String isbn) {
        //模仿访问数据库 延迟方法
        simulateSlowService();
        return new Book(isbn, "Some book");
    }

    // Don't do this at home
    private void simulateSlowService() {
        try {
            long time = 3000L;
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}
