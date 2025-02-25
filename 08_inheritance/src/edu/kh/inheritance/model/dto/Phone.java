package edu.kh.inheritance.model.dto;

public class Phone {
	
	// 필드
	private String brand; // 브랜드
	private String model; // 모델
	private int year; // 출시년도
	private int price; // 가격
	
	// 생성자
	public Phone() {}

	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}	
	
	// 메서드
	public void printInfo() {
		
		String str = "Brand: " + brand;
		str += "\nModel: " + model;
		str += "\nYear: " + year;
		str += "\nPrice: " + price + "원";
		
		System.out.println(str);
	}

	public String getBrand() {return brand;}
	public void setBrand(String brand) {this.brand = brand;}

	public String getModel() {return model;}
	public void setModel(String model) {this.model = model;}

	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	
}
