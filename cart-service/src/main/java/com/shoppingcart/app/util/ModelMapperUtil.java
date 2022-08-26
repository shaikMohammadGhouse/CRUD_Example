package com.shoppingcart.app.util;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ModelMapperUtil extends ModelMapper{

	
	        public ModelMapperUtil() {       
	        this.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE);
	        }   
	    
}
