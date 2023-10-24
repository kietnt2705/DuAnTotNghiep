package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.Accounts;
import com.project.bean.Payment_history;

public interface Account_DAO extends JpaRepository<Accounts, Integer>{

}
