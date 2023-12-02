package com.project.restcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/admin/api/setorderstatus")
	public void setorderstatus(@RequestBody List<Payment_history> list) {
		for (Payment_history pay : list) {
			try {
				paymentdao.set_payment_history_statusPayment(pay.getStatuspayment(), pay.getIdProductAccount());
			} catch (Exception e) {
				continue;
			}
		}
	}
}
