package com.restaurant.java_web_session4.controller;

//bài 4

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/bai4")
public class ProductController {

    @GetMapping("/products")
    public String getProducts(
            //không ghi tên
            //@RequestParam không chỉ định tên tham số, compiler không lưu tên biến.
            //Spring không biết lấy param nào từ URL
            @RequestParam("category") String category,  //bắt hai biến từ URL
            @RequestParam("limit") Integer limit,
            ModelMap model) {   //ModelMap đẩy 3 biến ra View
        model.addAttribute("category", category)
                .addAttribute("limit", limit)
                .addAttribute("message", "Tim kiem thanh cong");

        return "productList";
    }
}

//Thiết kế I/O
//1. URL: .../bai4/products?category=chay&limit=10
//2. @RequestParam
// category → "chay"
// limit → 10
//3. Controller: sử dụng model.addAttribute
//4. View Resolver: productList.jsp
//5. JSP hiển thị: ${category}, ${limit}, ${message}

//Khi gõ sai URL thành ?category=chay&limit=abc (chữ cái thay vì số)
//-> HTTP Status 400 – Bad Request -> Failed to convert value of type 'java.lang.String' to required type 'java.lang.Integer'