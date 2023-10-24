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

@RestController
@RequestMapping("/index")
public class productcontroller {
	@Autowired
	Producttype_DAO dao;
	@ResponseBody
	@GetMapping("/a")
	public List<Producttype> index() {
		return dao.findAll();
	}
}
