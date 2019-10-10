package com.xf._08_springboot_mongodb.dao;

import com.xf._08_springboot_mongodb.entity.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 10:22 2019/10/10
 * @description :CustomerRepository接口 继承MongoRepository
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer,String> {

    Customer findByFirstName(String firstName);

    List<Customer> findByLastName(String lastName);
}
