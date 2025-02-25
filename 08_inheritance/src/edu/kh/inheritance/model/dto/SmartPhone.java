package edu.kh.inheritance.model.dto;

public class SmartPhone extends Phone{
	
	// 필드
	private String operatingSystem; // OS
	private int storageCapacity;
	
	// 생성자
	public SmartPhone() {}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int storageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.storageCapacity = storageCapacity;
	}
	
	// 메서드
	@Override
	public void printInfo() {
		
		String str = "Operating System: " + operatingSystem;
		str += "\nStorage Capacity " + storageCapacity + "GB";
		
		super.printInfo();
		System.out.println(str);
	}

	// 게터/세터
	public String getOperatingSystem() {return operatingSystem;}
	public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}

	public int getStorageCapacity() {return storageCapacity;}
	public void setStorageCapacity(int storageCapacity) {this.storageCapacity = storageCapacity;}
}
