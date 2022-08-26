package com.shoppingcart.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shoppingcart.app.dto.AdminDto;

@Service
public interface AdminService {

	AdminDto addAdmin(AdminDto admin);
	AdminDto updateAdmin(AdminDto admin);
	AdminDto removeAdmin(AdminDto admin);
	AdminDto viewAdmin(Integer adminId);
	List<AdminDto> listAdmins();
}
