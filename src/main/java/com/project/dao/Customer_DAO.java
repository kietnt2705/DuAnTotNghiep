package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.Customers;
import com.project.bean.Payment_history;

public interface Customer_DAO extends JpaRepository<Customers, Integer>{

}
