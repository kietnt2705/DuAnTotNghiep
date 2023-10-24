package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.Payment_history;

public interface Payment_history_DAO extends JpaRepository<Payment_history, Integer>{

}
