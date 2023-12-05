package com.project.dao;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Orders;

public interface OrdersDAO extends JpaRepository<Orders, Integer>{
	@Query(value = "SELECT       count(Orders.id)\r\n"
			+ "FROM            Orders\r\n"
			+ "where Orders.id in (SELECT       Orders.id\r\n"
			+ "					FROM            Orders INNER JOIN\r\n"
			+ "                         OrderDetail ON Orders.Id = OrderDetail.OrderId\r\n"
			+ "					group by Orders.id)",nativeQuery = true)
	public Integer get_count_order();
	
	@Query(value = "SELECT       Orders.*\r\n"
			+ "			FROM            OrderDetail INNER JOIN\r\n"
			+ "			                         Orders ON OrderDetail.OrderId = Orders.Id INNER JOIN\r\n"
			+ "			                         Products ON OrderDetail.ProductId = Products.Id\r\n"
			+ "			group by       Orders.id,Orders.AccountId,Orders.Address,Orders.TimeOrder,Orders.VoucherId,Orders.StatusOrder,Orders.TotalPrice",nativeQuery = true)
	public List<Orders> getAllorders();
	
	@Query(value = "SELECT       MONTH(Orders.TimeOrder) as month,SUM(Products.Price*OrderDetail.Quantity) \r\n"
			+ "FROM            OrderDetail INNER JOIN\r\n"
			+ "                         Orders ON OrderDetail.OrderId = Orders.Id INNER JOIN\r\n"
			+ "                         Products ON OrderDetail.ProductId = Products.Id\r\n"
			+ "where year(Orders.TimeOrder)=?1\r\n"
			+ "group by Orders.TimeOrder",nativeQuery = true)
	public List<Object> get_chart_total_price_month_where(Integer year);
	
	@Query(value = "SELECT       month(Orders.TimeOrder),SUM(OrderDetail.Quantity) \r\n"
			+ "FROM            OrderDetail INNER JOIN\r\n"
			+ "                         Orders ON OrderDetail.OrderId = Orders.Id INNER JOIN\r\n"
			+ "                         Products ON OrderDetail.ProductId = Products.Id\r\n"
			+ "where year(Orders.TimeOrder)=?1\r\n"
			+ "group by month(Orders.TimeOrder)",nativeQuery = true)
	public List<Object> get_chart_count_product_month_where(Integer year);
	
	@Query(value = "UPDATE      Orders\r\n"
			+ "SET                StatusOrder = ?1\r\n"
			+ "WHERE        (Id = ?2)",nativeQuery = true)
	public void set_status_orders(String status, Integer idorder);
}
