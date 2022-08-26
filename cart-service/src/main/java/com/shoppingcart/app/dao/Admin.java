package com.shoppingcart.app.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table(name="ADMIN")
@Entity
@Data
public class Admin {
	
	@Id
	@Column(name="admin_id")
	Integer adminId;
	
	@Column(name="name", length=50)
	String name;
	
	@Column(name="contact_number", length=10)
	Long contactNumber;
	
	@Column(name="email_id", length=50)
	String emailId;
}
