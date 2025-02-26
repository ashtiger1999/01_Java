package edu.kh.ploy.ex1.model.dto;

public class Tesla extends Car { // 전기차
	
	// 필드
	private int batteryCapacity; // 배터리 용량
	
	// 생성자
	public Tesla() {}

	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	// 메서드
	public int getBatteryCapacity() {return batteryCapacity;}
	public void setBatteryCapacity(int batteryCapacity) {this.batteryCapacity = batteryCapacity;}
	
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
	}
	// 참조변수 : 어떤 객체의 주소값을 지닌 변수, 참조를 위한 변수, 참조==주소값 전달
	// super. 참조변수 : 부모 클래스의 주소값을 받아온다.
	// Car.toString();
}
