package com.zrsf.service;

import java.util.List;

import com.zrsf.entity.User;

public interface UserService {

	User getUserById(Integer id);
	List<User> getUserByName(String username);
	Boolean addUser(User user);
}
