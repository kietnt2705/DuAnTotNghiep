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
	@GetMapping("/admin")
	public String admin() {
		return "Admin/index";
	}
	
	@GetMapping("/user")
	public String user() {
		return "/User/index";
	}
}
