package com.project.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
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
	Integer	id;
	String email;
	byte[] passwordhashed;
	String fullname;
	String address;
	String phonenumber;
	@Temporal(TemporalType.DATE)
	LocalDate birthday;
	Boolean gender;
	Boolean role;
	Boolean deletestatus = false;
	
	@JsonIgnore
	@OneToMany(mappedBy = "account")
	List<Orders> list_orders;

}
