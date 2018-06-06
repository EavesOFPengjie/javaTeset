package com.pj.mybatis.pojo;

public class User {
 private String userid;
 private String username;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Override
public String toString() {
	return "User info is [userid=" + userid + ", username=" + username + "]";
}
 
}
