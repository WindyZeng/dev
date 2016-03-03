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
	
	//ajax �û���У���Ƿ�ע��
	public boolean ajaxValidateLoginname(String loginname){
		return userdao.ajaxValidateLoginname(loginname);
	}
	
	//ajax emailУ���Ƿ�ע��
	public boolean ajaxValidateEmail(String email){
		return userdao.ajaxValidateEmail(email);
	}
	
	//ע��
	public void regist(User user){
		//���뵽���ݿ���
		userdao.add(user);	
	}
	
	//ͨ���û���������ȥѰ��
	public User findByLoginnameAndPassword(String loginname, String password){
		return userdao.findByLoginnameAndPassword(loginname, password);
	}
	
	//�޸�����
	public void UpdataPassword(User user,String newLoginPassWord){
		user.setLoginpass(newLoginPassWord);
		userdao.UpdataPassword(user);
	}
}
