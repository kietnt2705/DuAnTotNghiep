package com.project.restcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Accounts;
import com.project.dao.Account_DAO;
import com.project.dao.Payment_history_DAO;
import com.project.dao.Products_DAO;

@RestController
public class admin_managent_statistical {
	@Autowired
	Payment_history_DAO payment;
	@Autowired
	Products_DAO product;
	@Autowired
	Account_DAO account;
	
	@GetMapping("/admin/api/count_statistical")
	public Map<String, Integer> getcountnumber(){
		Map<String, Integer> map = new HashMap<>();
		map.put("count_product", product.get_count_products());
		map.put("count_account", account.get_count_accounts());
		map.put("count_order", payment.get_count_order());
		return map;
	}
	
}
