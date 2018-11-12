package com.how2java.tmall.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//后台管理页面跳转专用控制器,做前后端分离用的

@Controller //这是一个控制器
public class AdminPageController {

    /*访问地址admin就会跳到客户端admin_category_list上*/
    @GetMapping(value = "/admin")
    public String admin(){
        return "redirect:admin_category_list";
    }
    /*访问地址admin_category_list就会跳到admin/listCategory.HTML文件里*/
    @GetMapping(value = "/admin_category_list")
    public String listCategory(){
        return "admin/listCategory";
    }
}
