package com.project.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Payment_history;
import com.project.dao.Payment_history_DAO;

@RestController
public class admin_managent_order {
	@Autowired
	Payment_history_DAO paymentdao;
	
	@GetMapping("/admin/api/getorders")
	public List<Payment_history> getorders(){
		return paymentdao.findAll();
	}
}
