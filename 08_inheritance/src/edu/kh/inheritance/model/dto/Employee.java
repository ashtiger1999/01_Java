package edu.kh.inheritance.model.dto;

/*
 * Object
 *    ㄴ Person
 *         ㄴ employee
 * 
 * */

public class Employee extends Person{
	
	// 필드
	private String company; // 회사명
	
	// 생성자
	public Employee() {}
	
	public Employee(String name, int age, String nationality, String company) {
		super(name, age, nationality); // Person의 매개변수 생성자
		this.company = company;
	}
	
	// Person으로부터 상속받은 메서드 중 move() 메서드를 Employee에 맞게 재정의(==오버라이딩)
	
	// @Overridie 어노테이션 : 해당 메서드가 오버라이딩 되었음을 컴파일러에게 알려주는 역할
	// -> 컴파일러에게 문법체크를 하도록 알린다.
	// -> 부모에게 해당 메서드가 있는지 체크
	// -> 메서드의 이름, 매개변수 타입과 개수, 순서가 일치하는 여부 검사
	
	@Override
	public void move() {
		System.out.println("오버라이딩 된 move()");
		System.out.println("집에가고 싶다.");
	}
	
	@Override
	public void move(String str, int num) {
		// super 참조변수 : 상속관계에서 부모 객체를 가리키는 참조변수
		super.move(str,num);
	}
	
	@Override
	public String toString() {
		return super.toString()+" / comapny : "+company;
	}
	
	/*
	 * final 메서드 -> 오버라이딩 불가
	 * - 메서드의 기능이 변하면 안되는 경우
	 * 
	 * */
	
	public final void onlyEmployee() {
		System.out.println("final 메서드 입니다.");
	}
	
	
	// 게터/세터
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
}
