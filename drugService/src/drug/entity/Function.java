package drug.entity;


public class Function {
	private String func_id;
	private String func_name;
	private String action;
	private String icon;
	private String parent_func_id;
	public Function() {
		
	}
	public String getParent_func_id() {
		return parent_func_id;
	}
	public void setParent_func_id(String parent_func_id) {
		this.parent_func_id = parent_func_id;
	}
	public String getFunc_id() {
		return func_id;
	}
	public void setFunc_id(String func_id) {
		this.func_id = func_id;
	}
	public String getFunc_name() {
		return func_name;
	}
	public void setFunc_name(String func_name) {
		this.func_name = func_name;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	@Override
	public String toString() {
		return "Function [func_id=" + func_id + ", func_name=" + func_name
				+ ", request=" + action + ", icon=" + icon + "]";
	}
	@Override
	public int hashCode() {
		return func_id.hashCode();
	}
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null) {
			result = false;
		} else if (this == obj) {
			result = true;
		} else {
			if (obj instanceof Function) {
				Function target = (Function) obj;
				String syn = target.getFunc_id();
				if (syn != null && syn.equals(getFunc_id())) {
					result = true;
				}
			}
		}
		return result;
	}
	
}
