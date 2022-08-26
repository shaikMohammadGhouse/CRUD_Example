package com.shoppingcart.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="CUSTOMER")
@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="customer_id")
	Integer customerId;
	
	@Column(name="name", length=20)
	String name;
	
	@Column(name="mobile_number", length=10)
	String mobileNumber;
	
    @Column(name = "customer_address", length=1000)
	String address;
	
	@Column(name="email_id", length=55)
	String emailId;
	
	@Column(name="password", length=20)
	String password;
	
	@Column(name="confirm_password", length=20)
	String confirmPassword;
}
