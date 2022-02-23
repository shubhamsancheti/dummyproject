package org.demopro.common.model;

import java.util.List;

public class ResponseUserRole {
	private int roleId;
	private String roleName;
	private String roleDescription;
    List<ResponseRoleModule> roleModule;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public List<ResponseRoleModule> getRoleModule() {
		return roleModule;
	}
	public void setRoleModule(List<ResponseRoleModule> roleModule) {
		this.roleModule = roleModule;
	}
	@Override
	public String toString() {
		return "ResponseUserRole [roleId=" + roleId + ", roleName=" + roleName + ", roleDescription=" + roleDescription
				+ ", roleModule=" + roleModule + "]";
	}
    
}

