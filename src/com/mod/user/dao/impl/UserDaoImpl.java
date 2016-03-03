package com.mod.user.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.mod.user.beans.User;
import com.mod.user.dao.UserDao;

@Repository
public class UserDaoImpl implements UserDao {
	@Resource SessionFactory factory;
	
	@Override
	public User findByLoginnameAndPassword(String loginname, String password) {
		String hql = "from User as user where user.loginname=:loginname and user.loginpass=:password";
		Query query=factory.getCurrentSession().createQuery(hql);
		query.setString("loginname", loginname);
		query.setString("password", password);
		List<User> list=query.list();
		User user=null;
		for(User u:list){
		   user=u;
		   }
		return user;
		
	}

	@Override
	public boolean ajaxValidateLoginname(String loginname) {
		String sql = "select count(*) from user where loginname=?";
		Number number =(Number) factory.getCurrentSession()
				.createSQLQuery(sql)
				.setParameter(0, loginname).uniqueResult();
		return number.intValue()==0;
	}

	@Override
	public boolean ajaxValidateEmail(String email) {
		String sql = "select count(*) from user where email=?";
		Number number =(Number) factory.getCurrentSession()
				.createSQLQuery(sql)
				.setParameter(0, email).uniqueResult();
		return number.intValue()==0;
		
	}

	@Override
	public void add(User user) {
		factory.getCurrentSession().persist(user);
	}

	@Override
	public void UpdataPassword(User user) {
		factory.getCurrentSession().update(user);
	}


	
	

}