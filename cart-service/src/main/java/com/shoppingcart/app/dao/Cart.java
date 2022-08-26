package com.shoppingcart.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="CART")
@Entity
@Data
public class Cart {
	
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="cart_id")
	Integer cartId;
	
	@Column( name="customer_id", length=5)
	Integer customerId;	
	
	@Column( name="vegetables", length=1000)
	String vegetables;
}
