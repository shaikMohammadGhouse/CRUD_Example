package com.shoppingcart.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.app.dto.AdminDto;
import com.shoppingcart.app.service.AdminService;

@RestController("adminController")
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	AdminService adminService;
	
	@PostMapping("/addAdmin")
	public AdminDto addtoCart(@RequestBody AdminDto adminReq){
		
		return adminService.addAdmin(adminReq);
		
	}
	
	@GetMapping("/getAdmin{id}")
	public AdminDto getAdmin(@RequestParam("id") Integer adminId ){
		
		return adminService.viewAdmin(adminId);
		
	}
	
	@GetMapping("/listAdmins")
	public List<AdminDto> listAdmins(){
		return adminService.listAdmins();
	}
}
