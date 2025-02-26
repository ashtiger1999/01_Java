package edu.kh.ploy.ex1.model.dto;

public class Car {
	
	// 속성
	// 필드
	// 멤버변수
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴개수
	
	// 기능
	// 생성자
	// 기본 생성자
	public Car() {}

	// 매개변수 생성자
	public Car(String engine, String fuel, int wheel) {
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}
	
	// 매서드
	// 게터/세터
	public String getEngine() {return engine;}
	public void setEngine(String engine) {this.engine = engine;}
	
	public String getFuel() {return fuel;}
	public void setFuel(String fuel) {this.fuel = fuel;}
	
	public int getWheel() {return wheel;}
	public void setWheel(int wheel) {this.wheel = wheel;}

	@Override // 오버라이딩 : 부모 클래스에 정의된 메서드를 자식 클래스에서 재정의하는 것
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
}
