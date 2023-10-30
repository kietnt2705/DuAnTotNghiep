package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.Producttype;
import com.project.dao.Producttype_DAO;

@Controller
@RequestMapping("/trangchu")
public class opencontroller {

//		Trang Admin
	@GetMapping("/admin")
	public String admin() {
		return "Admin/index";
	}

	@GetMapping("/admin/charts")
	public String admincharts() {
		return "Admin/charts";
	}

	@GetMapping("/admin/user")
	public String adminuser() {
		return "Admin/user";
	}

	@GetMapping("/admin/product")
	public String adminproduct() {
		return "Admin/product";
	}
	
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
