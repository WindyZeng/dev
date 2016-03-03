package com.mod.user.service;

import java.io.IOException;
import java.util.Properties;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.mod.user.beans.User;
import com.mod.user.dao.UserDao;

@Service @Transactional
public class UserService {
	@Resource UserDao userdao;
	
	//ajax 用户名校验是否注册
	public boolean ajaxValidateLoginname(String loginname){
		return userdao.ajaxValidateLoginname(loginname);
	}
	
	//ajax email校验是否注册
	public boolean ajaxValidateEmail(String email){
		return userdao.ajaxValidateEmail(email);
	}
	
	//注册
	public void regist(User user){
		//插入到数据库中
		userdao.add(user);	
	}
	
	//通过用户名和密码去寻找
	public User findByLoginnameAndPassword(String loginname, String password){
		return userdao.findByLoginnameAndPassword(loginname, password);
	}
	
	//修改密码
	public void UpdataPassword(User user,String newLoginPassWord){
		user.setLoginpass(newLoginPassWord);
		userdao.UpdataPassword(user);
	}
}
