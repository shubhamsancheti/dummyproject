package org.demopro.common.model;

import java.util.Date;

public class UserRole {
	 int id; 
	  int user_id; 
	  int role_id; 
	  int is_active; 
	  Date created_on;
	  Date updated_on;
	  String created_by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public Date getUpdated_on() {
		return updated_on;
	}
	public void setUpdated_on(Date updated_on) {
		this.updated_on = updated_on;
	}
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	@Override
	public String toString() {
		return "UserRole [id=" + id + ", user_id=" + user_id + ", role_id=" + role_id + ", is_active=" + is_active
				+ ", created_on=" + created_on + ", updated_on=" + updated_on + ", created_by=" + created_by + "]";
	}
	
	

}


 