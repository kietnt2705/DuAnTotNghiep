package com.project.bean;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Shopping_cart")
public class Shopping_cart implements Serializable{
@Id
Integer idCart;
Integer quantity;
Date timeorder;

@ManyToOne
@JoinColumn(name = "AccountId")
Accounts account2;

@ManyToOne
@JoinColumn(name = "ProductId")
Products product2;
}
