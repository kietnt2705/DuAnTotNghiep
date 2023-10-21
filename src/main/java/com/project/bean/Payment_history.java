package com.project.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Payment_history")
@Entity
public class Payment_history implements Serializable{
	@Id
	Integer idProductAccount;
	Integer count;
	@Temporal(TemporalType.DATE)
	Date timePayment;
	@ManyToOne
	@JoinColumn(name = "Detail_account")
	Accounts account;
	
	@ManyToOne
	@JoinColumn(name = "Detail_product")
	Products product;
}
