package com.shoppingcart.app.dto;

import java.util.List;

import lombok.Data;
@Data
public class CartDto {

	int cartId;
	int customerId;	
	List<VegetableDto> vegetables;
}
