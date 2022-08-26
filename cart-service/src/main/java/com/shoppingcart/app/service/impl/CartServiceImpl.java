package com.shoppingcart.app.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingcart.app.dto.CartDto;
import com.shoppingcart.app.dto.VegetableDto;
import com.shoppingcart.app.service.CartService;

@Service
public class CartServiceImpl implements CartService{

	@Override
	public VegetableDto addToCart(VegetableDto input) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartDto increaseVegQuantity(int vegId, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartDto decreaseVegQuantity(int vegId, int quantity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CartDto removeVegietable(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<VegetableDto> listAllItems() {
		// TODO Auto-generated method stub
		return null;
	}

}
