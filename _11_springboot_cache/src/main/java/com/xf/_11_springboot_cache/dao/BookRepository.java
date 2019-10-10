package com.xf._11_springboot_cache.dao;

import com.xf._11_springboot_cache.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 14:24 2019/10/10
 * @description :BookRepository接口
 */
@Repository
public interface BookRepository {

    Book getByIsbn(String isbn);
}
