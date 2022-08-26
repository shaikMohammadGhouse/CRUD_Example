package com.shoppingcart.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingcart.app.dao.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
