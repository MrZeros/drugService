package drug.entity;

import java.sql.Timestamp;

public class SaleVo {

	private String sale_no;
	private String drg_no;
	private String repo_no;
	private String repo_local;
	private String drg_name;
	private Integer sale_num;
	private Double sale_money;
	private Double drg_price;
	private String sale_operator;
	private Timestamp sale_date;
	private String user_name;
	private String user_addr;
	public SaleVo() {

	}
	public String getSale_no() {
		return sale_no;
	}
	public void setSale_no(String sale_no) {
		this.sale_no = sale_no;
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
	public String getRepo_local() {
		return repo_local;
	}
	public void setRepo_local(String repo_local) {
		this.repo_local = repo_local;
	}
	public String getDrg_name() {
		return drg_name;
	}
	public void setDrg_name(String drg_name) {
		this.drg_name = drg_name;
	}
	public Integer getSale_num() {
		return sale_num;
	}
	public void setSale_num(Integer sale_num) {
		this.sale_num = sale_num;
	}
	public Double getSale_money() {
		return sale_money;
	}
	public void setSale_money(Double sale_money) {
		this.sale_money = sale_money;
	}
	public Double getDrg_price() {
		return drg_price;
	}
	public void setDrg_price(Double drg_price) {
		this.drg_price = drg_price;
	}
	public String getSale_operator() {
		return sale_operator;
	}
	public void setSale_operator(String sale_operator) {
		this.sale_operator = sale_operator;
	}
	public Timestamp getSale_date() {
		return sale_date;
	}
	public void setSale_date(Timestamp sale_date) {
		this.sale_date = sale_date;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_addr() {
		return user_addr;
	}
	public void setUser_addr(String user_addr) {
		this.user_addr = user_addr;
	}
	@Override
	public String toString() {
		return "SaleVo [drg_no=" + drg_no + ", repo_no=" + repo_no
				+ ", repo_local=" + repo_local + ", drg_name=" + drg_name
				+ ", sale_num=" + sale_num + ", sale_money=" + sale_money
				+ ", drg_price=" + drg_price + ", sale_operator="
				+ sale_operator + ", sale_date=" + sale_date + ", user_name="
				+ user_name + ", user_addr=" + user_addr + "]";
	}
	
}
