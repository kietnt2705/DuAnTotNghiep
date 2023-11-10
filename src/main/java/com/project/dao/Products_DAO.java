package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Products;

public interface Products_DAO extends JpaRepository<Products, Integer>{
	@Modifying
	@Query(value = "select * from Products",nativeQuery = true)
	public List<Products> getallproduct();
}
