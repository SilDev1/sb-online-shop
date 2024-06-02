package main.java.com.example.sb_online_shop.domain;

import java.util.Arrays;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer,Long> {

    default void saveAll(Customer... customers) {
        saveAll(Arrays.asList(customers));
    }
}
