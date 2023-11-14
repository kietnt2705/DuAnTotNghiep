package com.project.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer	idAccount;
	String username;
	String email;
	String passwordhashed;
	String fullname;
	String address;
	String phonenumber;
	Boolean gender;
	Boolean role;
	String profilepicture;
	Boolean deletestatus = true;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Payment_history> list_payment_history;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account2")
	List<Shopping_cart> list_Shopping_cart;
}
