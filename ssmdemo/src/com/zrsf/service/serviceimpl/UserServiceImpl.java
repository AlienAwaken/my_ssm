package com.zrsf.service.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zrsf.dao.UserMapper;
import com.zrsf.entity.User;
import com.zrsf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		User user = userMapper.getUserById(id);
		return user;
	}
	@Override
	public List<User> getUserByName(String username) {
		// TODO Auto-generated method stub
		List<User> user = userMapper.getUserByName(username);
		return user;
	}
	@Override
	public Boolean addUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.addUser(user)>1;
	}

}
