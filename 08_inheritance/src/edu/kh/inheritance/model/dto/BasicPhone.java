package edu.kh.inheritance.model.dto;

public class BasicPhone extends Phone {

	// 필드
	private boolean hasPhysicalKeyboard; // 물리적 키보드 유무
	
	// 생성자
	public BasicPhone() {}

	public BasicPhone(String brand, String model, int year, int price, boolean hasPhysicalKeyboard) {
		super(brand, model, year, price);
		this.hasPhysicalKeyboard = hasPhysicalKeyboard;
	}

	// 메서드
	public void checkKeyboard() {
		
		super.printInfo();
		
		if(hasPhysicalKeyboard) System.out.println("이 휴대폰은 물리적 키보드가 있습니다.");
	}

	// 게터/세터
	public boolean isHasPhysicalKeyboard() {return hasPhysicalKeyboard;}
	public void setHasPhysicalKeyboard(boolean hasPhysicalKeyboard) {this.hasPhysicalKeyboard = hasPhysicalKeyboard;}	
}
