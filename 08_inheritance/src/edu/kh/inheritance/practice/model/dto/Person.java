package edu.kh.inheritance.practice.model.dto;

public class Person {
	
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String information() {
		
		String str = "이름 : " + name;
		str += " / 나이 : " + age;
		str += " / 신장 : " + height;
		str += " / 몸무게 : " + weight;
		
		str = String.format("이름 : %s / 나이 : %d / 신장 : %f / 몸무게 : %f", name,age,height,weight);

		return str;
		
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public double getHeight() {return height;}
	public void setHeight(double height) {this.height = height;}

	public double getWeight() {return weight;}
	public void setWeight(double weight) {this.weight = weight;}	
}
