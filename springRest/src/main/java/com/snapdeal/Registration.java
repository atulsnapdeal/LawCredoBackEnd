package com.snapdeal;

public class Registration {
	public Registration(){
		
	}
	public Registration(String j_password, String j_username) {
		super();
		this.j_password = j_password;
		this.j_username = j_username;
	}
	String j_password;
	public String getJ_password() {
		return j_password;
	}
	public void setJ_password(String j_password) {
		this.j_password = j_password;
	}
	public String getJ_username() {
		return j_username;
	}
	public void setJ_username(String j_username) {
		this.j_username = j_username;
	}
	String j_username;

}
