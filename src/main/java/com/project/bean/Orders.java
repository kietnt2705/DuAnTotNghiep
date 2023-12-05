package com.project.bean;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "Orders")
public class Orders implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	String address;
	@Temporal(TemporalType.DATE)
	Date timeorder;
	String statusorder;
	Float totalprice;
	
	@JsonIgnore
	@OneToMany(mappedBy = "order")
	List<Orderdetail> listOrderDetail;
	
	@ManyToOne
	@JoinColumn(name = "voucherid")
	Voucher voucher;
	
	@ManyToOne
	@JoinColumn(name = "accountid")
	Accounts account;
}
