package com.shoppingcart.app.dto;

import lombok.Data;

@Data
public class CustomerDto {
	int customerId;
	String name;
	String mobileNumber;
	AddressDto address;
	String emailId;
	String password;
	String confirmPassword;
}
