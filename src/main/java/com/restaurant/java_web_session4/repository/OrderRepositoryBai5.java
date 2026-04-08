package com.restaurant.java_web_session4.repository;

import org.springframework.stereotype.Repository;

@Repository
public class OrderRepositoryBai5 {
    public String find(Long id) {
        return "Don hang ma " + id;
    }

    public String save() {
        return "Tạo đơn hàng mới thành công";
    }

    public String delete(Long id) {
        return "Đã hủy đơn hàng " + id;
    }
}
