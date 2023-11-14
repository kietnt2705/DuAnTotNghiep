package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Products;

public interface Products_DAO extends JpaRepository<Products, Integer>{
	
	@Query(value = "SELECT       Products.*\r\n"
			+ "FROM            Products\r\n"
			+ "WHERE        (DeleteStatus = 1)",nativeQuery = true)
	public List<Products> getAllProduct();
	
	@Query(value = "SELECT       Products.*\r\n"
			+ "FROM            Products\r\n"
			+ "WHERE        (DeleteStatus = 0)",nativeQuery = true)
	public List<Products> getAllProduct_delete();
	
	@Query(value = "UPDATE      Products\r\n"
			+ "SET                DeleteStatus =0\r\n"
			+ "WHERE        (Id_product = ?1)",nativeQuery = true)
	public void delete_Product(Integer idProduct);
	
	@Query(value = "UPDATE      Products\r\n"
			+ "SET                DeleteStatus =1\r\n"
			+ "WHERE        (Id_product = ?1)",nativeQuery = true)
	public void restore_Product(Integer idProduct);
}
