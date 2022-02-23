package org.demopro.common.model;

import java.util.List;

public class ResponseUserData {
	private String username;
	private String name;
	private String email;
	private String address;
	List<ResponseUserRole> userRole;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<ResponseUserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(List<ResponseUserRole> userRole) {
		this.userRole = userRole;
	}
	@Override
	public String toString() {
		return "ResponseUserData [username=" + username + ", name=" + name + ", email=" + email + ", address=" + address
				+ ", userRole=" + userRole + "]";
	}
	
}
