package com.restaurant.java_web_session4.service;

import com.restaurant.java_web_session4.repository.OrderRepositoryBai5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceBai5 {
    private final OrderRepositoryBai5 orderRepositoryBai5;

    @Autowired
    public OrderServiceBai5(OrderRepositoryBai5 orderRepositoryBai5) {
        this.orderRepositoryBai5 = orderRepositoryBai5;
    }

    public String getOrder(Long id) {
        return orderRepositoryBai5.find(id);
    }

    public String createOrder() {
        return orderRepositoryBai5.save();
    }

    public String deleteOrder(Long id) {
        return orderRepositoryBai5.delete(id);
    }
}
