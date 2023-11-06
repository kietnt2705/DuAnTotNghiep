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
	String status;
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "TypeId")
	Product_type Product_type;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product2")
	List<Shopping_cart> list_Shopping_cart2;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<Payment_history> list_Payment_history;
}
