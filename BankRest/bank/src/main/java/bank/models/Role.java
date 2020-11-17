package bank.models;

//The Role model keeps track of user permissions. Can be expanded for more features later. Could be Admin, Employee, Standard, or Premium

public class Role {
	
	private int roleId;
	private String role;
	
	public Role() {
	}
	
	public Role( int roleId, String role ) {
		this.roleId = roleId;
		this.role = role;
	}
	
	public int getRoleId() {
		return roleId;
	}
	
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
}
