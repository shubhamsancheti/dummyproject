package org.demopro.dao.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="RoleModule")
public class RoleModuleEntity {
	@Id
	private int id;
    @Column(name="module_id") 
    private int moduleid;
    @Column(name="role_id") 
    private int roleid;
    @Column(name="is_active") 
    private  int  is_active;
    @Column(name="created_on") 
    private  Date created_on;
	@Column(name="updated_on") 
	private Date updated_on;
   	@Column(name="created_by") 
   	private String created_by;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
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
		return "RoleModuleEntity [id=" + id + ", moduleid=" + moduleid + ", roleid=" + roleid + ", is_active="
				+ is_active + ", created_on=" + created_on + ", updated_on=" + updated_on + ", created_by=" + created_by
				+ "]";
	}
   	
   	

}
