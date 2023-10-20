package com.project.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
}
