package com.example.demo.dao;

import com.example.demo.pojo.User;

public interface LoginMapper {
	
	User getPasswordByUsername(String userName);
	
}
