package com.zrsf.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class User {

	private Integer userId;
	private String userName;
	private String passWord;
	@JSONField (format="yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date userBirthday;
	private Double userSalary;
	public Integer getId() {
		return userId;
	}
	public void setId(Integer id) {
		this.userId = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Date getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(Date userBirthday) {
		this.userBirthday = userBirthday;
	}
	public Double getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(Double userSalary) {
		this.userSalary = userSalary;
	}
	
	
	
}
