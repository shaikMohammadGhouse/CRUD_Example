package com.shoppingcart.app.dto;

import java.util.List;

import lombok.Data;
@Data
public class OrderDto {

	int orderNo;
	int customerId;
	List<VegetableDto> vegetableList;
	double totalAmount;
	String status;
}
