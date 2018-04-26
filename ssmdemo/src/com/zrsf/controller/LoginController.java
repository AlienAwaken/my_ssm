package com.zrsf.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.zrsf.entity.User;
import com.zrsf.service.UserService;

@Controller
@RequestMapping("/sys")
public class LoginController {

	@Resource
	private UserService userService;
	@RequestMapping("/login")
	public String login(User u, Map<String,Object> map,HttpServletRequest request,HttpServletResponse resp) throws IOException {
		userService.addUser(u);
		List<User> user = userService.getUserByName(u.getUserName());
		String mapJson = JSON.toJSONString(user);
		if(user==null) {
			return "sys/login";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("user",u.getUserName());
			map.put("u",mapJson);
			return "main/hello";
		}
	}
	
	@RequestMapping("/loginout")
	public String loginout(HttpServletRequest request,HttpServletResponse resp) throws IOException {
			HttpSession session = request.getSession();
			session.invalidate();
			return "sys/login";
	}
}
