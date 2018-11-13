package com.how2java.tmall.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.how2java.tmall.dao.CategoryDAO;
import com.how2java.tmall.pojo.Category;

@Service //标志这个类为service类
//创建一个sort对象，然后通过id排序，然后用DAO查询
public class CategoryService {
    @Autowired CategoryDAO categoryDAO; //自动装配上个DAO对象的
    //创建sort对象，通过id排序，实现DAO查询
    public List<Category> list(){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        return categoryDAO.findAll(sort);
    }
}
