package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//后台管理页面跳转专用控制器

@Controller
public class AdminPageController {
    @GetMapping(value = "/admin") //这是一个控制器
    public String admin(){
        return "redirect:admin_category_list";
    }
    @GetMapping(value = "/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
}
