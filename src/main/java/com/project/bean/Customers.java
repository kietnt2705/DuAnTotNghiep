package com.project.bean;

import java.io.Serializable;
import java.util.List;

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
@Table(name = "Customers")
public class Customers implements Serializable{
	@Id
	Integer idCustomer;
	String fullname;
	String address;
	String phonenumber;
	Boolean gender;
	String avatar;
	@JsonIgnore
	@OneToMany(mappedBy = "cumtomer")
	List<Accounts> listtaccounts;
}
