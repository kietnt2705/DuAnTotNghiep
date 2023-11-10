package com.project.bean;

import java.io.Serializable;
import java.util.Date;

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
@Table(name = "Payment_history")
public class Payment_history implements Serializable{
@Id
Integer idProductAccount;
Integer quantity;
Date timepayment;
String address;

@ManyToOne
@JoinColumn(name = "Detail_account")
Accounts account;


@ManyToOne
@JoinColumn(name = "Detail_product")
Products product;
}
