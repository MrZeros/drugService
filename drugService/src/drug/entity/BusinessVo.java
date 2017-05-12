package drug.entity;

import java.sql.Timestamp;

public class BusinessVo {
	
	private String bus_id;
	private String drg_no;
	private String drg_name;
	private String drg_unit;
	private String drg_type;
	private String p_name;
	private String p_id;
	private String p_address;
	private Integer repo_store;
	private Integer buy_num;
	private String repo_operator;
	private String status;
	private String inspector;
	private String buyer;
	private String auditor;
	private Timestamp repo_time;
	private Timestamp purchase_time;
	private Timestamp insp_time;
	private Timestamp audit_time;
	private Double drg_price;
	private Double drg_value;
	public BusinessVo() {
		
	}
	public String getBus_id() {
		return bus_id;
	}

	public void setBus_id(String bus_id) {
		this.bus_id = bus_id;
	}

	public String getDrg_no() {
		return drg_no;
	}

	public void setDrg_no(String drg_no) {
		this.drg_no = drg_no;
	}

	public String getDrg_name() {
		return drg_name;
	}

	public void setDrg_name(String drg_name) {
		this.drg_name = drg_name;
	}

	public String getDrg_unit() {
		return drg_unit;
	}

	public void setDrg_unit(String drg_unit) {
		this.drg_unit = drg_unit;
	}

	public String getDrg_type() {
		return drg_type;
	}

	public void setDrg_type(String drg_type) {
		this.drg_type = drg_type;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getP_address() {
		return p_address;
	}

	public void setP_address(String p_address) {
		this.p_address = p_address;
	}

	public Integer getRepo_store() {
		return repo_store;
	}

	public void setRepo_store(Integer repo_store) {
		this.repo_store = repo_store;
	}

	public Integer getBuy_num() {
		return buy_num;
	}

	public void setBuy_num(Integer buy_num) {
		this.buy_num = buy_num;
	}

	public String getRepo_operator() {
		return repo_operator;
	}

	public void setRepo_operator(String repo_operator) {
		this.repo_operator = repo_operator;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getInspector() {
		return inspector;
	}

	public void setInspector(String inspector) {
		this.inspector = inspector;
	}

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getAuditor() {
		return auditor;
	}

	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}

	public Timestamp getRepo_time() {
		return repo_time;
	}

	public void setRepo_time(Timestamp repo_time) {
		this.repo_time = repo_time;
	}

	public Timestamp getPurchase_time() {
		return purchase_time;
	}

	public void setPurchase_time(Timestamp purchase_time) {
		this.purchase_time = purchase_time;
	}

	public Timestamp getInsp_time() {
		return insp_time;
	}

	public void setInsp_time(Timestamp insp_time) {
		this.insp_time = insp_time;
	}

	public Timestamp getAudit_time() {
		return audit_time;
	}

	public void setAudit_time(Timestamp audit_time) {
		this.audit_time = audit_time;
	}

	public Double getDrg_price() {
		return drg_price;
	}

	public void setDrg_price(Double drg_price) {
		this.drg_price = drg_price;
	}

	public Double getDrg_value() {
		return drg_value;
	}

	public void setDrg_value(Double drg_value) {
		this.drg_value = drg_value;
	}

	@Override
	public String toString() {
		return "BusinessVo [bus_id=" + bus_id + ", drg_no=" + drg_no
				+ ", drg_name=" + drg_name + ", drg_unit=" + drg_unit
				+ ", drg_type=" + drg_type + ", p_name=" + p_name + ", p_id="
				+ p_id + ", p_address=" + p_address + ", repo_store="
				+ repo_store + ", buy_num=" + buy_num + ", repo_operator="
				+ repo_operator + ", status=" + status + ", inspector="
				+ inspector + ", buyer=" + buyer + ", auditor=" + auditor
				+ ", repo_time=" + repo_time + ", purchase_time="
				+ purchase_time + ", insp_time=" + insp_time + ", audit_time="
				+ audit_time + ", drg_price=" + drg_price + ", drg_value="
				+ drg_value + "]";
	}
}
