package com.shoppingcart.app.facade;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingcart.app.dto.CartDto;
import com.shoppingcart.app.dto.VegetableDto;

@Service
public interface CustomerFacade {
	//all DTO layer
	VegetableDto addToCart(VegetableDto input);
	
	CartDto increaseVegQuantity(int vegId, int quantity);
	
	CartDto decreaseVegQuantity(int vegId, int quantity);
	
	CartDto removeVegietable(int id);
	
	List<VegetableDto> listAllItems();
}
