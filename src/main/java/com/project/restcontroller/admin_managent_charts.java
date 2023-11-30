package com.project.restcontroller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dao.Payment_history_DAO;

@RestController
@RequestMapping("/admin/api/chart")
public class admin_managent_charts {
	@Autowired
	Payment_history_DAO dao;
	
	@GetMapping("/countproductyear")
	public List<Object> getchartcountproductyear(){		
		return dao.get_chart_count_product_year();
	}
	
	@GetMapping("/countproductmonthwhere")
	public List<Object> getcountproductmonthwhere(){		
		Date date = new Date();
		return dao.get_chart_count_product_month_where(date.getYear()+1900);
	}
}
