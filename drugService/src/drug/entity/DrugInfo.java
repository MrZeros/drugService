package drug.entity;

public class DrugInfo {

	private String drg_no;
	private String repo_no;
	private String drg_name;
	private String drg_unit;
	private String drg_type;
	private String p_name;
	private String p_id;
	private String p_address;
	private Integer drg_num;
	private Integer sale_num;
	private String repo_local;
	private Double drg_price;
	private Double drg_value;
	public DrugInfo(){
		
	}
	public String getDrg_no() {
		return drg_no;
	}
	public void setDrg_no(String drg_no) {
		this.drg_no = drg_no;
	}
	public String getRepo_no() {
		return repo_no;
	}
	public void setRepo_no(String repo_no) {
		this.repo_no = repo_no;
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
	public Integer getDrg_num() {
		return drg_num;
	}
	public void setDrg_num(Integer drg_num) {
		this.drg_num = drg_num;
	}
	public Integer getSale_num() {
		return sale_num;
	}
	public void setSale_num(Integer sale_num) {
		this.sale_num = sale_num;
	}
	public String getRepo_local() {
		return repo_local;
	}
	public void setRepo_local(String repo_local) {
		this.repo_local = repo_local;
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
		return "DrugInfo [drg_no=" + drg_no + ", repo_no=" + repo_no
				+ ", drg_name=" + drg_name + ", drg_unit=" + drg_unit
				+ ", drg_type=" + drg_type + ", p_name=" + p_name + ", p_id="
				+ p_id + ", p_address=" + p_address + ", drg_num=" + drg_num
				+ ", sale_num=" + sale_num + ", repo_local=" + repo_local
				+ ", drg_price=" + drg_price + ", drg_value=" + drg_value + "]";
	}
}
