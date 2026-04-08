package com.restaurant.java_web_session4.repository;

import org.springframework.stereotype.Repository;

@Repository  //quản lí bean
public class OrderRepository {
    public String getAllOrders() {
        return "Danh sach toan bo don hang";
    }

    public String getOrderById(Long id) {
        return "Thong tin don hang voi ID: " + id;
    }


}
