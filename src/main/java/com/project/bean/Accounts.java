package com.project.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
	Integer	idAccount;
	@Column(nullable = false)
	String username;
	@Column(nullable = false)
	String email;
	@Column(nullable = false)
	String passwordhashed;
	@Column(nullable = false)
	String passwordsalt;
	String fullname;
	String address;
	String phonenumber;
	Boolean gender;
	Boolean role;
	String profilepicture;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Payment_history> list_payment_history;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account2")
	List<Shopping_cart> list_Shopping_cart;
}
