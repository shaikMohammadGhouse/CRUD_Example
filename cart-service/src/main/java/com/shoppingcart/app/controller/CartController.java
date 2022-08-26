package com.shoppingcart.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.app.dto.VegetableDto;
import com.shoppingcart.app.service.CartService;

@RestController("cartController")
@RequestMapping("/mycart")
public class CartController {

	@Autowired
	CartService cartService;
	
	@PostMapping("/addToCart")
	public VegetableDto addtoCart(@RequestBody VegetableDto vegTableReq){
		
		return cartService.addToCart(vegTableReq);
		
	}
	
	@GetMapping("/shopping")
	public String getEmployee(){
		
		return "confirmed";
		
	}
	
}
