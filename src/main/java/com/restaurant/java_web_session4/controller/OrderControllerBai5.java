package com.restaurant.java_web_session4.controller;

import com.restaurant.java_web_session4.service.OrderServiceBai5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai5/orders_bai5")
public class OrderControllerBai5 {
    private final OrderServiceBai5 orderServiceBai5;

    @Autowired
    public OrderControllerBai5(OrderServiceBai5 orderServiceBai5) {
        this.orderServiceBai5 = orderServiceBai5;
    }

    //xem đơn
    @GetMapping("/{id}")
    @ResponseBody
    public String getOrder(@PathVariable("id") Long id) {
        return orderServiceBai5.getOrder(id);
    }

    //tạo
    @PostMapping
    @ResponseBody
    public String createOrder() {
        return orderServiceBai5.createOrder();
    }

    //hủy
    @DeleteMapping("/{id}")
    @ResponseBody
    public String deleteOrder(@PathVariable("id") Long id) {
        return orderServiceBai5.deleteOrder(id);
    }
}
