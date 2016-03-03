package com.mod.user.dao;

import com.mod.user.beans.User;

public interface UserDao {
	//ajax �û���У���Ƿ�ע��
	public boolean ajaxValidateLoginname(String loginname);
	
	//ajax emailУ���Ƿ�ע��
	public boolean ajaxValidateEmail(String email);
	
	 // ��loginname��password��ѯ
	public User findByLoginnameAndPassword(String loginname, String password);
	
	//����û�
	public void add(User user);
	
	//�޸�����
	public void UpdataPassword(User user);
		
	
	
	
}