package edu.kh.io.pack3.model.dto;

import java.io.Serializable;

// Serializable 인터페이스
// - 추상메서드가 하나도 없는 인터페이스
// - 상속만 받아도 입출력시 직렬화가 가능하다는 의미만 제골
// -> 마커 인터페이스

// 직렬화 방법 : implements Serializable만 작성하면 됌

//The serializable class Member does not declare a static final serialVersionUID field of type long
public class Member implements Serializable{
	
	// 필드
	private String id;
	private String pw;
	private String name;
	private int age;
	
	// 메서드
	public Member() {}

	public Member(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Member [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
}
