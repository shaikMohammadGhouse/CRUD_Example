package com.shoppingcart.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="ADDRESS")
@Entity
@Data
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	 
	@Column(name="flat_no", length=5)
	String flatNo;
	
	@Column(name="building_name", length=50)
	String buildingName;
	
	@Column(name="area", length=150)
	String area;
	
	@Column(name="city", length=10)
	String city;
	
	@Column(name="pinCode", length=5)
	int pinCode;
}
