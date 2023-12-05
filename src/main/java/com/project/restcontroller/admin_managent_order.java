package com.project.restcontroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.project.bean.Orders;
import com.project.dao.OrderdetailDAO;
import com.project.dao.OrdersDAO;

@RestController
public class admin_managent_order {
	@Autowired
	OrdersDAO ordersdao;
	@Autowired
	OrderdetailDAO orderdetail;
	
	@GetMapping("/admin/api/getorders")
	public List<Orders> getorders(){
		return ordersdao.getAllorders();
	}
	
	@PostMapping("/admin/api/setorderstatus")
	public void setorderstatus(@RequestBody List<Orders> list) {
		for (Orders pay : list) {
			try {
				ordersdao.set_status_orders(pay.getStatusorder(), pay.getId());
			} catch (Exception e) {
				continue;
			}
		}
	}
	
	@PostMapping("/admin/api/getorderdetail")
	public ResponseEntity<?> getdetailorder(@RequestBody Integer idorder){
		Map<String, Object> map = new HashMap<>();
		map.put("order", ordersdao.findById(idorder));
		map.put("orderdetail", orderdetail.get_orderdetail_by_idorder(idorder));
        return ResponseEntity.ok(map);
	}
	
}
