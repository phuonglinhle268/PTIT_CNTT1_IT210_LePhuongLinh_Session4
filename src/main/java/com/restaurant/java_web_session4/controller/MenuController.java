package com.restaurant.java_web_session4.controller;

//bài 2

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/bai2")
public class MenuController {

    @GetMapping("/menu")
    @ResponseBody
    public String getMenu(
            @RequestParam(value = "category", required = false, defaultValue = "chay") String category) {

        return "Menu loai: " + category;
    }
}

//code ban đầu
//@GetMapping("/bai2/menu")
//@ResponseBody
//public String getMenu(@RequestParam("category") String category) {
//    return "Menu loai: " + category;
//}
//Mặc định: @RequestParam -> required = true
// Thiếu param -> spring ném ngoại lệ