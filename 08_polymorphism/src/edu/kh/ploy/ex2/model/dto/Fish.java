package edu.kh.ploy.ex2.model.dto;

public class Fish extends Animal{
	
	public Fish() {}

	public Fish(String type, String eatType) {
		super(type, eatType);
	}

	@Override
	public void eat() {System.out.println("입으로 물과 함께 먹이를 삼킨다.");}

	@Override
	public void breath() {System.out.println("아가미로 호흡한다.");}

	@Override
	public void move() {System.out.println("지느러미를 움직여서 이동한다.");}	
	
	@Override
	public String toString() {return "Fish : " + super.toString();}
}
