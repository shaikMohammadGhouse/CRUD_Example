package com.shoppingcart.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="VEGETABLE")
@Entity
public class Vegetable {
	
	@Id
	@GeneratedValue(strategy =GenerationType.SEQUENCE)
	@Column(name="veg_id")
	int vegId;
	
	@Column(name="name", length=22)
	String name;
	
	@Column(name="type", length=22)
	String type;
	
	@Column(name="price")
	double price;
	
	@Column(name="quantity", length=22)
	int quantity;

}
