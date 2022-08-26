package com.shoppingcart.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingcart.app.dto.CustomerDto;

@Service
public interface CustomerService {

	CustomerDto addCustomer(CustomerDto customer);
	CustomerDto updateCustomer(CustomerDto customer);
	CustomerDto removeCustomer(CustomerDto customer);
	CustomerDto viewCustomer(CustomerDto customer);
	List<CustomerDto> listCustomers();
}
