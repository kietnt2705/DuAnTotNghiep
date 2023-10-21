package com.project.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Accounts")
public class Accounts implements Serializable{
	@Id
	Integer idAccount;
	String username;
	String password;
	String email;
	@ManyToOne
	@JoinColumn(name = "Detail_customer")
	Customers cumtomer;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Payment_history> List_pay_history;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account3")
	List<Cart> list_cart;
}
