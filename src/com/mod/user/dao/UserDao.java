package com.mod.user.dao;

import com.mod.user.beans.User;

public interface UserDao {
	//ajax 用户名校验是否注册
	public boolean ajaxValidateLoginname(String loginname);
	
	//ajax email校验是否注册
	public boolean ajaxValidateEmail(String email);
	
	 // 按loginname和password查询
	public User findByLoginnameAndPassword(String loginname, String password);
	
	//添加用户
	public void add(User user);
	
	//修改密码
	public void UpdataPassword(User user);
		
	
	
	
}