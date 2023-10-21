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
@Table(name = "Products")
public class Products implements Serializable{
	@Id
	Integer idProduct;
	String name;
	Float price;
	Integer quantity;
	String image;
	String contents;
	Boolean status;
	@ManyToOne
	@JoinColumn(name = "Type")
	Producttype product_type;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<Payment_history> list_pay_history2;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product3")
	List<Cart> list_cart2;
}
