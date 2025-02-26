package edu.kh.ploy.ex2.model.dto;

public class Person extends Animal{
	// The type Person must implement the inherited abstract method Animal.move()
	
	private String name;
	
	public Person() {}

	public Person(String type, String eatType, String name) {
		super(type, eatType);
		this.name = name;
	}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	// 상속받은 추상 메서드 오버라이딩 구문 자동완성 단축키
	// alt + shift + s > Override/implement method..
	@Override
	public void eat() {System.out.println("도구를 이용하여 먹는다.");}

	@Override
	public void breath() {System.out.println("코와 입으로 숨을 쉰다.");}

	@Override
	public void move() {System.out.println("두 발로 걷는다.");}
	
	@Override
	public String toString() {return "Person : " + super.toString() + " / " + name;}
}
