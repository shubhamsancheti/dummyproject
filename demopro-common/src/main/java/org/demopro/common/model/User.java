package org.demopro.common.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Id;

public class User {
private int id;
private String user_id; 
	private String username;
	private String password; 
	private String name;
	private String email;
	private String phone_no1;
	private String phone_no2 ; 
	private String address;
	private Date date_of_birth;   
	private int  organization_id;//unsigned
	private String image_url; 
	private String gender; 
	private String blood_group ;  
	private int is_active;
	private Date created_on;
	private Date updated_on;  
	private String created_by; 
	private String updated_by; 
	private int cpos_user_id; //unsigned  
	private String uuid; 
	private int user_type; //unsigned   1
	private List<Role> UserRole;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhone_no1() {
		return phone_no1;
	}

	public void setPhone_no1(String phone_no1) {
		this.phone_no1 = phone_no1;
	}

	public String getPhone_no2() {
		return phone_no2;
	}

	public void setPhone_no2(String phone_no2) {
		this.phone_no2 = phone_no2;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public int getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
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

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public int getCpos_user_id() {
		return cpos_user_id;
	}

	public void setCpos_user_id(int cpos_user_id) {
		this.cpos_user_id = cpos_user_id;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public int getUser_type() {
		return user_type;
	}

	public void setUser_type(int user_type) {
		this.user_type = user_type;
	}

	public List<Role> getUserRole() {
		return UserRole;
	}

	public void setUserRole(List<Role> userRole) {
		UserRole = userRole;
	}


	
	
}
