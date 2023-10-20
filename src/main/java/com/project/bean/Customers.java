package com.project.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
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
	List<Accounts> accounts;
}
