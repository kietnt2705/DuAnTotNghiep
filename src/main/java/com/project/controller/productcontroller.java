package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.bean.Producttype;
import com.project.dao.ProducttypeDAO;

@Controller
@RequestMapping("/index")
public class productcontroller {
	@Autowired
	ProducttypeDAO dao;
	@GetMapping("/1")
	public List<Producttype> index() {
		return dao.findAll();
	}
}
