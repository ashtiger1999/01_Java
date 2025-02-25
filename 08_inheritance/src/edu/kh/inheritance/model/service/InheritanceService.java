package edu.kh.inheritance.model.service;

import edu.kh.inheritance.model.dto.Employee;
import edu.kh.inheritance.model.dto.Person;
import edu.kh.inheritance.model.dto.Student;

public class InheritanceService {
	
	// 상속 확인 예제
	public void ex1() {
		
		Person p = new Person();
		
		p.setName("홍길동");
		p.setAge(20);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		p.breath();
		p.move();
		
		System.out.println();
		
		// Person을 상속받은 Student가 Person의 필드, 메서드를 사용할 수 있는가?
		Student std = new Student();
		
		// Student만의 고유한 멤버
		std.setGrade(3);
		std.setClassRoom(5);
		
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		// Person에게 상속받은 멤버
		std.setName("곽두팔");
		std.setAge(35);
		std.setNationality("조선민주주의인민공화국");
		
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());	
		
		std.breath();
		std.move();
		
		System.out.println();
		
		Employee emp = new Employee();
		
		emp.setCompany("KH");
		
		emp.setName("조미현");
		emp.setAge(30);
		emp.setNationality("한국");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
		emp.breath();
		emp.move();
		
		// 상속의 특징
		// 코드 길이 감소와 중복 요소 제거
		
	}

	// super() 생성자 이용해보기
	public void ex2() {
		
		// Student 객체 생성
		Student std = new Student("홍길동", 17, "한국", 1, 3);
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println();
		
		Employee emp = new Employee("곽두팔", 35, "한국", "KH");
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
	}
	
	// 오버라이딩 확인 예제
	public void ex3() {
		Student std = new Student();
		Employee emp = new Employee();
		std.move();
		emp.move();
		
		System.out.println(std);
	}
	
	// toString Override 예제
	public void ex4() {
		
		Person p = new Person("김철수", 5, "한국");
		
		System.out.println(p.toString());
		System.out.println(p);
		// 프린트 구문 수행시 참조변수 명을 작성하면 자동으로 toString() 메서드를 호출해서 출력해준다.
		
		System.out.println();
		
		Student std = new Student(p.getName(),p.getAge(),p.getNationality(),5,6);
		
		System.out.println(std.toString());
		System.out.println(std);
		
		System.out.println();
		
		Employee emp = new Employee(p.getName(),p.getAge(),p.getNationality(),"KH");
		
		System.out.println(emp.toString());
		System.out.println(emp);
	}
}
