package com.examplestore.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
      ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
      // autowire with "beans"
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
