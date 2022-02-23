package org.demopro.dao.model;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import org.hibernate.dialect.MySQL;
@Entity
@Table(name="user")
public class UserEntity {
	@Id 
	private int id;
	@Column(name="user_id")
	private String user_id;
	@Column(name="username") 
	private String username;
	@Column(name="password") 
	private String password; 
	@Column(name="name") 
	private String name;
	@Column(name="email") 
	private String email;
	@Column(name="phone_no1") 
	private String phone_no1;
	@Column(name="phone_no2") 
	private String phone_no2 ; 
	@Column(name="address") 
	private String address;
	@Column(name="date_of_birth") 
	private Date date_of_birth;   
	@Column(name="organization_id") 
	private int  organization_id;//unsigned
	@Column(name="image_url") 
	private String image_url; 
	@Column(name="gender")
	private String gender; 
	@Column(name="blood_group") 
	private String blood_group ;  
	@Column(name="is_active")
	private int is_active;
	@Column(name="created_on") 
	private Date created_on;
	@Column(name="updated_on") 
	private Date updated_on;  
	@Column(name="created_by") 
	private String created_by; 
	@Column(name="updated_by")
	private String updated_by; 
	@Column(name="cpos_user_id") 
	private int cpos_user_id; //unsigned  
	@Column(name="uuid") 
	private String uuid; 
	@Column(name="user_type") 
	private int user_type; //unsigned   1
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "UserEntity [id=" + id + ", user_id=" + user_id + ", username=" + username + ", password=" + password
				+ ", name=" + name + ", email=" + email + ", phone_no1=" + phone_no1 + ", phone_no2=" + phone_no2
				+ ", address=" + address + ", date_of_birth=" + date_of_birth + ", organization_id=" + organization_id
				+ ", image_url=" + image_url + ", gender=" + gender + ", blood_group=" + blood_group + ", is_active="
				+ is_active + ", created_on=" + created_on + ", updated_on=" + updated_on + ", created_by=" + created_by
				+ ", updated_by=" + updated_by + ", cpos_user_id=" + cpos_user_id + ", uuid=" + uuid + ", user_type="
				+ user_type + "]";
	}
	

	
}
