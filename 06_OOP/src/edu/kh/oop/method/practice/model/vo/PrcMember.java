package edu.kh.oop.method.practice.model.vo;

public class PrcMember {
	
	private String memId;
	private String memPw;
	private String memName;
	private int age;
	
	public PrcMember() {}

	public PrcMember(String memId, String memPw, String memName, int age) {
		super();
		this.memId = memId;
		this.memPw = memPw;
		this.memName = memName;
		this.age = age;
	}

	public String getMemId() {
		return memId;
	}

	public void setMemId(String memId) {
		this.memId = memId;
	}

	public String getMemPw() {
		return memPw;
	}

	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}

	public String getMemName() {
		return memName;
	}

	public void setMemName(String memName) {
		this.memName = memName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	

}
