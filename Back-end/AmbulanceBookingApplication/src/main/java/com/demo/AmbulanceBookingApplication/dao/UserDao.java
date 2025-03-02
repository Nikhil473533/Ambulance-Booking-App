package com.demo.AmbulanceBookingApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.AmbulanceBookingApplication.beans.User;

public interface UserDao extends JpaRepository<User, Integer>{
	@Query(value="select * from user where Email=:email and Password=:password",nativeQuery = true)
	User loginUser(String email, String password);

}
