package com.project.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.bean.Orderdetail;

public interface OrderdetailDAO extends JpaRepository<Orderdetail, Integer>{
	@Query(value = "select OrderDetail.*\r\n"
			+ "FROM            OrderDetail INNER JOIN\r\n"
			+ "                         Orders ON OrderDetail.OrderId = Orders.Id \r\n"
			+ "						 where Orders.id=?1",nativeQuery = true)
	public List<Orderdetail> get_orderdetail_by_idorder(Integer idorder);
}
