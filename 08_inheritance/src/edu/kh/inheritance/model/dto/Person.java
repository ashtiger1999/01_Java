package edu.kh.inheritance.model.dto;

// DTO(Data Transform Object) : 비즈니스 계층과 데이터 교환을 위해 사용하는 객체
// VO (Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지
public class Person /*extends Object*/{
	// Object 클래스
	// : 모든 클래스의 최상위 부모
	// - class 선언부에 상속 구문이 하나도 작성되어있지 않다면 컴파일러가 extends Object 구문을 자동으로 추가해준다.
	
	// 속성(필드)
	private String name; // 이름
	private int age; // 나이
	private String nationality; // 국적
	
	// 기능
	
	// 생성자
	// 생성자의 역할 : 객체 생성 기능
	// 자식 객체를 생성하면 내부에 부모 객체가 먼저 생성된다.
	// -> 부모 생성자 호출 -> 부모객체 먼저 생성
	// -> 자식 생성자 호출 -> 자식 객체 생성 
	// => 이때 자식 객체 안쪽에 부모 객체 포함
	
	// 기본 생성자
	public Person() {} // super(); 컴파일러가 자동으로 추가해줌

	// 매개변수 생성자
	public Person(String name, int age, String nationality) {
		super(); // 부모의 생성자 (Object 클래스의 기본 생성자)
		this.name = name;
		this.age = age;
		this.nationality = nationality;
	}

	// getter/setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}

	public String getNationality() {return nationality;}
	public void setNationality(String nationality) {this.nationality = nationality;}
	
	public void breath() {
		System.out.println("사람은 숨쉰다.");
	}
	
	public void move() {
		System.out.println("사람은 움직인다.");
	}
	
	public void move(String str, int num) {}

	@Override
	public String toString() {
		return "name : " + name + " / age : " + age + " / nationality : " + nationality;
	}
}
