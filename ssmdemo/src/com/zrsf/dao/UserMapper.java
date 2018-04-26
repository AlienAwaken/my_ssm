package com.zrsf.dao;

import java.util.List;

import com.zrsf.entity.User;

public interface UserMapper {

	User getUserById(Integer id);
	List<User> getUserByName(String username);
	Integer addUser(User user);
}
