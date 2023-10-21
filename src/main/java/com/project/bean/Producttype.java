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
@Table(name = "Product_type")
public class Producttype implements Serializable{
	@Id
	Integer idType;
	String name;
	@JsonIgnore
	@OneToMany(mappedBy = "product_type")
	List<Products> list_product;
}
