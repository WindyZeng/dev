package com.mod.user.beans;

import javax.persistence.*;

@Entity(name="users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="uid")
	private long uid;
	
	@Column(name="loginname",length=32)
	private String loginname;
	
	@Column(name="loginpass")
	private String loginpass;
	
	@Column(name="email")
	private String email;
	
//	@Column(name="status")
//	private boolean status;
//	
//	@Column(name="activationCode")
//	private String activationCode;
	
	
	public long getUid() {
		return uid;
	}
	public void setUid(long uid) {
		this.uid = uid;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getLoginpass() {
		return loginpass;
	}
	public void setLoginpass(String loginpass) {
		this.loginpass = loginpass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
//	public boolean isStatus() {
//		return status;
//	}
//	public void setStatus(boolean status) {
//		this.status = status;
//	}
//	public String getActivationCode() {
//		return activationCode;
//	}
//	public void setActivationCode(String activationCode) {
//		this.activationCode = activationCode;
//	}
	
	
}
