package org.demopro.common.model;

import java.util.Date;

public class Module {
	 private  int id ;
	 private int  application_id ;
	 private String name;
	private String Key;
	 private int  is_active;
	 private  Date start_date ;
	 private Date created_on ;
	 private Date updated_on ;
	 private String created_by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getApplication_id() {
		return application_id;
	}
	public void setApplication_id(int application_id) {
		this.application_id = application_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIs_active() {
		return is_active;
	}
	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
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
	
	
	 public String getKey() { return Key; } 
	 public void setKey(String key) {
	  this.Key = key; }
	 
	@Override
	public String toString() {
		return "Module [id=" + id + ", application_id=" + application_id + ", name=" + name + ", is_active=" + is_active
				+ ", start_date=" + start_date + ", created_on=" + created_on + ", updated_on=" + updated_on
				+ ", created_by=" + created_by + "]";
	}
	
}
