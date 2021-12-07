package com.evoke.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Person {

	@Id
	private long pid;
	private String pname;
	private String dept;
	public Person(long pid, String pname, String dept) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.dept = dept;
	}
	public Person() {
		super();
	}
	public long getPid() {
		return pid;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", dept=" + dept + "]";
	}
	

}
