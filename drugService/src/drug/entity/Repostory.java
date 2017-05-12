package drug.entity;

import java.sql.Timestamp;

public class Repostory {

	private String repo_id;
	private String repo_status;
	private Integer repo_capacity;
	private Integer repo_position;
	private Integer repo_avai;
	private Timestamp repo_time;
	public Repostory() {

	}
	public String getRepo_id() {
		return repo_id;
	}
	public void setRepo_id(String repo_id) {
		this.repo_id = repo_id;
	}
	public String getRepo_status() {
		return repo_status;
	}
	public void setRepo_status(String repo_status) {
		this.repo_status = repo_status;
	}
	public Integer getRepo_capacity() {
		return repo_capacity;
	}
	public void setRepo_capacity(Integer repo_capacity) {
		this.repo_capacity = repo_capacity;
	}
	public Integer getRepo_position() {
		return repo_position;
	}
	public void setRepo_position(Integer repo_position) {
		this.repo_position = repo_position;
	}
	public Integer getRepo_avai() {
		return repo_avai;
	}
	public void setRepo_avai(Integer repo_avai) {
		this.repo_avai = repo_avai;
	}
	public Timestamp getRepo_time() {
		return repo_time;
	}
	public void setRepo_time(Timestamp repo_time) {
		this.repo_time = repo_time;
	}
	@Override
	public String toString() {
		return "Repostory [repo_id=" + repo_id + ", repo_status=" + repo_status
				+ ", repo_capacity=" + repo_capacity + ", repo_position="
				+ repo_position + ", repo_avai=" + repo_avai + ", repo_time="
				+ repo_time + "]";
	}
}
