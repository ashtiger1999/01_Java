package edu.kh.collection.pack3.prc.model.dto;

import java.util.Set;

public class Toy{
	
	private String name;
	private int price;
	private String color;
	private int age;
	private String year;
	private Set<String> material;
	//
	public Toy() {}
	
	public Toy(String name, int price, String color, int age, String year, Set<String> material) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.age = age;
		this.year = year;
		this.material = material;
	}
	//
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public String getColor() {return color;}
	public void setColor(String color) {this.color = color;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public String getYear() {return year;}
	public void setYear(String year) {this.year = year;}

	public Set<String> getMaterial() {return material;}
	public void setMaterial(Set<String> material) {this.material = material;}
	//
	public void toyInfo() {
		
	}

	@Override
	public String toString() {
		return "name : " + name + " / price : " + price + " / color : " + color + " / age : " + age + " / year : " + year
				+ " / material : " + material + "";
	}
}
