package com.project.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
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
	Integer idProduct;
	String name;
	Float price;
	Integer quantity;
	String image;
	String contents;
	Boolean deletestatus = true;
	 
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-MM-yyyy")
	Date datecreate = new Date();
	
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	Product_type Product_type;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product2")
	List<Shopping_cart> list_Shopping_cart2;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	List<Payment_history> list_Payment_history;
	
	@ManyToOne
	@JoinColumn(name = "voucher_id")
	Voucher voucher;
	
}
