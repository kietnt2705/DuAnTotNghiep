package com.project.bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Products")
public class Products implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String name;
	Float price;
	Integer quantity;
	String image;
	String contents;
	Boolean deletestatus = false;
	 
	@Temporal(TemporalType.DATE)
	LocalDate datecreate;
	
	
	@ManyToOne
	@JoinColumn(name = "categoryid")
	Categories categories;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<Orderdetail> listOrderDetail;
	
}
