package tk.mybatis.xml_config.model;

/**
 * 用户角色关联表
 * 
 * @author dell
 *
 */
public class SysUserRole {

	private Long userId; // 用户ID
	private Long roleId; // 角色ID

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
