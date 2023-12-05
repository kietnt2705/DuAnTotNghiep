package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.Categories;

public interface CategoriesDAO extends JpaRepository<Categories, Integer>{

}
