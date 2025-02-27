package edu.kh.ploy.ex5.model.dto;

public class Person {
	
	protected String id;
	protected String name;
	protected int age;
	
	public Person() {}

	public Person(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	
	public String getInfo() {
		return String.format("ID : %s / Name : %s / Age : %d",id,name,age);
	}
}
