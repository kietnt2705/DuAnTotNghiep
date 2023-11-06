package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/trangchu")
public class opencontroller {

//		Trang Admin
	@GetMapping("/admin")
	public String admin() {
		return "Admin/index";
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
// Trang User
	@GetMapping("/user")
	public String user() {
		return "/User/index";
	}
}
