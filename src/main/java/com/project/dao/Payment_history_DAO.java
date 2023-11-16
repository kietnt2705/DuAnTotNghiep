package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Payment_history;

public interface Payment_history_DAO extends JpaRepository<Payment_history, Integer>{
	@Query(value = "SELECT COUNT(Id_product_account) as count_orders\r\n"
			+ "FROM Payment_history",nativeQuery = true )
	public Integer get_count_order();
}
