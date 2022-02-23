package org.demopro.dao.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "role")
public class RoleEntity {
	 @Id
	 private  int id ;
	 @Column(name="application_id") 
	 private int  application_id ;
	 @Column(name="name")
	 private String name;
	 @Column(name="description")
	 private String description ;
	 @Column(name="organization_id")
	 private int organization_id ;
	 @Column(name="is_active")
	 private int  is_active;
	 @Column(name="start_date")
	 private  Date start_date ;
	 @Column(name="created_on")
	 private Date created_on ;
	 @Column(name="updated_on")
	 private Date updated_on ;
	 @Column(name="created_by")
	 private String created_by;
	 @Column(name="updated_by") 
	 private String updated_by ;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getOrganization_id() {
		return organization_id;
	}
	public void setOrganization_id(int organization_id) {
		this.organization_id = organization_id;
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
	public String getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}
	@Override
	public String toString() {
		return "RoleEntity [id=" + id + ", application_id=" + application_id + ", name=" + name + ", description="
				+ description + ", organization_id=" + organization_id + ", is_active=" + is_active + ", start_date="
				+ start_date + ", created_on=" + created_on + ", updated_on=" + updated_on + ", created_by="
				+ created_by + ", updated_by=" + updated_by + "]";
	} 
	 
}
