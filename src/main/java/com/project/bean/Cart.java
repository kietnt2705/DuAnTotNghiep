package com.project.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Cart")
public class Cart implements Serializable{
	@Id
	Integer idCart;
	Integer count;
	@ManyToOne
	@JoinColumn(name = "Detail_account")
	Accounts account3;
	
	@ManyToOne
	@JoinColumn(name = "Detail_product")
	Products product3;
}
