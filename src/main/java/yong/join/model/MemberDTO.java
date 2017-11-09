package yong.join.model;

import java.sql.Timestamp;

public class MemberDTO {
	private int idx;
	private String id;
	private String name;
	private String pwd;
	private String addr;
	private String tel;
	private Timestamp joindate;
	public MemberDTO() {
		super();
	}
	public MemberDTO(int idx, String id, String name, String pwd, String addr, String tel, Timestamp joindate) {
		super();
		this.idx = idx;
		this.id = id;
		this.name = name;
		this.pwd = pwd;
		this.addr = addr;
		this.tel = tel;
		this.joindate = joindate;
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public Timestamp getJoindate() {
		return joindate;
	}
	public void setJoindate(Timestamp joindate) {
		this.joindate = joindate;
	}
	
	
}
