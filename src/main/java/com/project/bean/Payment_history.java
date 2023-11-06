package com.project.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

@JsonIgnore
@ManyToOne
@JoinColumn(name = "Detail_account")
Accounts account;

@JsonIgnore
@ManyToOne
@JoinColumn(name = "Detail_product")
Products product;
}
