package com.shoppingcart.app.service;

import java.util.List;

import com.shoppingcart.app.dto.VegetableDto;

public interface VegetableMgmtService {

	VegetableDto addVegetable(VegetableDto vegetable);
	VegetableDto updateVegetable(VegetableDto vegetable);
	VegetableDto removeVegetable(VegetableDto vegetable);
	VegetableDto viewVegetable(VegetableDto vegetable);
	List<VegetableDto> viewAllVegetable();
	
}
