package drug.entity;

import java.util.List;
import java.util.Map;

public class UserSession {

	private String user_id;
	private String user_name;
	private String user_passwd;
	private String user_sex;
	private String user_phone;
	private String user_email;
	private List<String> roles;
	private String numLim;//数值权限
	private Map<Function, Map> funcs;
	public UserSession() {
		
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getNumLim() {
		return numLim;
	}

	public void setNumLim(String numLim) {
		this.numLim = numLim;
	}

	public Map<Function, Map> getFuncs() {
		return funcs;
	}

	public void setFuncs(Map<Function, Map> funcs) {
		this.funcs = funcs;
	}

	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_passwd() {
		return user_passwd;
	}
	public void setUser_passwd(String user_passwd) {
		this.user_passwd = user_passwd;
	}
	public String getUser_sex() {
		return user_sex;
	}
	public void setUser_sex(String user_sex) {
		this.user_sex = user_sex;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	
}
