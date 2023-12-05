package com.project.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.AccountDAO;
import com.project.dao.OrdersDAO;
import com.project.dao.ProductsDAO;

@RestController
@RequestMapping("/admin/api/chart")
public class admin_managent_charts {
	@Autowired
	OrdersDAO order;
	@Autowired
	ProductsDAO product;
	@Autowired
	AccountDAO account;
	
	@GetMapping("/productpricemonth")
	public List<Object> get_chart_product_price_month(){
		return order.get_chart_total_price_month_where(2023);
	}
	
	@GetMapping("/productcountmonth")
	public List<Object> get_chart_count_product_month(){
		return order.get_chart_count_product_month_where(2023);
	}
	
	@GetMapping("/admin/api/count_statistical")
	public Map<String, Integer> getcountnumber(){
		Map<String, Integer> map = new HashMap<>();
		map.put("count_product", product.get_count_products());
		map.put("count_account", account.get_count_accounts());
		map.put("count_order",order.get_count_order());
		return map;
	}
}
