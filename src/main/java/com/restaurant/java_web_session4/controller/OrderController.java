package com.restaurant.java_web_session4.controller;

//bài 3

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai3/orders")
public class OrderController {

    @GetMapping("/{id}")
    @ResponseBody
    public String getOrderDetail(@PathVariable("id") Long id) {
        return "Chi tiet don hang so " + id;
    }
}

//Cách A: Dùng URL /bai3/orders/5 kết hợp với @PathVariable.
//Số 5 nằm ở: URI Path (đường dẫn)
//-> Đây là một phần của resource path
//Cách B: Dùng URL /bai3/orders?id=5 kết hợp với @RequestParam.
//Số 5 nằm ở: chuỗi truy vấn
//-> Dạng: key=value

//chọn cách A
// khi muốn truy xuất 1 đối tượng cụ thể theo id -> ưu tiên dùng Path Variable
// Request Param: sử dụng khi lọc, tìm kiếm
