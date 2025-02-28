package edu.kh.collection.pack3.prc.model.dto;

import java.util.Set;
import java.util.TreeSet;

public class Toy {
	
	private String name;
	private int price;
	private String color;
	private int userAge;
	private int year;
	private Set<String> material = new TreeSet<>();
	//
	public Toy() {}
	
	public Toy(String name, int price, String color, int userAge, int year, Set<String> material) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
		this.userAge = userAge;
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

	public int getUserAge() {return userAge;}
	public void setUserAge(int userAge) {this.userAge = userAge;}

	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}

	public Set<String> getMaterial() {return material;}
	public void setMaterial(Set<String> material) {this.material = material;}
	//
	public void toyInfo() {
		
	}

	@Override
	public String toString() {
		return "Toy [name=" + name + ", price=" + price + ", color=" + color + ", userAge=" + userAge + ", year=" + year
				+ ", material=" + material + "]";
	}

}
