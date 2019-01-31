package tk.mybatis.xml_config.model;

public class SysRolePrivilege {

	Long roleId; // 角色ID
	Long privilegeId; // 权限ID

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long getPrivilegeId() {
		return privilegeId;
	}

	public void setPrivilegeId(Long privilegeId) {
		this.privilegeId = privilegeId;
	}

}
