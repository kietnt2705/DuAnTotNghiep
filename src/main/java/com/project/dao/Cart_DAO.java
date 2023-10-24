package com.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bean.Cart;
import com.project.bean.Payment_history;

public interface Cart_DAO extends JpaRepository<Cart, Integer>{

}
