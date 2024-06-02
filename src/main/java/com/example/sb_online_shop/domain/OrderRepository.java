package main.java.com.example.sb_online_shop.domain;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository {

    default void saveAll(Order... orders) {
        saveAll(Arrays.asList(orders));
    }
}
