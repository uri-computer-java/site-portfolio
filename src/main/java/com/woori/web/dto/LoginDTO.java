package com.woori.web.dto;

public class LoginDTO {
	private int lno, count;
	private String lname, lid, lpw;
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLid() {
		return lid;
	}
	public void setLid(String lid) {
		this.lid = lid;
	}
	public String getLpw() {
		return lpw;
	}
	public void setLpw(String lpw) {
		this.lpw = lpw;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
