package com.project.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Customers")
public class Customers {
	@Id
	Integer idCustomer;
	String fullname;
	String address;
	String phonenumber;
	Boolean gender;
	String avatar;
}
