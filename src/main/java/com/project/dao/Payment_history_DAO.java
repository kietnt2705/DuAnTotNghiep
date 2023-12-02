package com.project.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Payment_history;

public interface Payment_history_DAO extends JpaRepository<Payment_history, Integer>{
	@Query(value = "SELECT COUNT(Id_product_account) as count_orders\r\n"
			+ "FROM Payment_history",nativeQuery = true )
	public Integer get_count_order();
	
	@Query(value = "select SUM(Payment_history.Quantity) as paymentyear,YEAR(Payment_history.TimePayment) as year\r\n"
			+ "from Payment_history\r\n"
			+ "group by YEAR(Payment_history.TimePayment)\r\n"
			+ "order by YEAR(Payment_history.TimePayment) asc",nativeQuery = true )
	public List<Object> get_chart_count_product_year();
	
	@Query(value = "select SUM(Payment_history.Quantity) as paymentyear,MONTH(Payment_history.TimePayment) as month2\r\n"
			+ "from Payment_history\r\n"
			+ "where YEAR(Payment_history.TimePayment) = ?1\r\n"
			+ "group by MONTH(Payment_history.TimePayment)\r\n"
			+ "order by MONTH(Payment_history.TimePayment) asc",nativeQuery = true )
	public List<Object> get_chart_count_product_month_where(Integer year);
	
	@Query(value = "UPDATE      Payment_history\r\n"
			+ "SET                StatusPayment = ?1\r\n"
			+ "WHERE        (Id_product_account = ?2)",nativeQuery = true)
	public void set_payment_history_statusPayment(String trangthai,Integer idpayment);
}
