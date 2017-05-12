package drug.entity;

import java.sql.Timestamp;

public class RoleVo {

	private String role_id;
	private String role_name;
	private String is_used;
	private Timestamp last_time;
	public RoleVo() {
		
	}
	public String getRole_id() {
		return role_id;
	}
	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}
	public String getRole_name() {
		return role_name;
	}
	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}
	public String getIs_used() {
		return is_used;
	}
	public void setIs_used(String is_used) {
		this.is_used = is_used;
	}
	public Timestamp getLast_time() {
		return last_time;
	}
	public void setLast_time(Timestamp last_time) {
		this.last_time = last_time;
	}
	
}
