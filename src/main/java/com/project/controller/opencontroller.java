package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.project.dao.OrderdetailDAO;
import com.project.dao.OrdersDAO;


@Controller
@RequestMapping("/trangchu")
public class opencontroller {
	@Autowired
	OrdersDAO ordersdao;
	@Autowired
	OrderdetailDAO orderdetail;
	
//		Trang Admin
	@GetMapping("/admin")
	public String admin() {
		return "Admin/index";
	}
	
	@GetMapping("/detail")
	public String detail() {
		return "Admin/detail";
	}
	
//	 Trang admin thống kê dạng biểu đồ
	@GetMapping("/admin/charts")
	public String admincharts() {
		return "Admin/charts";
	}

//	Trang admin quản lý người dùng
	@GetMapping("/admin/user")
	public String adminuser() {
		return "Admin/user";
	}

//	trang admin quản lý sản phẩm
	@GetMapping("/admin/product")
	public String adminproduct() {
		return "Admin/product";
	}
	
// Trang quản lý đơn hàng
	@GetMapping("/admin/order")
	public String adminorder() {
		return "Admin/order";
	}
	
	// Trang khuyến mãi
		@GetMapping("/admin/voucher")
		public String voucher() {
			return "Admin/voucher";
		}


		
// Trang User
	@GetMapping("/user")
	public String user() {
		return "/User/index";
	}
	
	

}
