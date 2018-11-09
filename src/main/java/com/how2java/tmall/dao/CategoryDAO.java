package com.how2java.tmall.dao;
//提供分页和CURD功能
import org.springframework.data.jpa.repository.JpaRepository;
import com.how2java.tmall.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category,Integer>{

}
