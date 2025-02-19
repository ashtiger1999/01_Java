package edu.kh.oop.abstraction.model.service;

import edu.kh.oop.abstraction.model.vo.People;

// Service : 특정 기능(비즈니스 로직)을 제공하는 패키지 or 서비스
// (비밀번호 -> 암호화, 파일 -> 유요한 파일 걸러내는 작업)

public class AbstractionService {

	// 속성
	// 기능
	public void ex1() {
		// People 클래스를 이용해서 국민 객체 만들기
		People p1 = new People();
		// People p1 : People 객체의 주소를 저장하여 참조하는 변수 p1(== 참조변수)
		// new People() : 새로운 People 객체를 Heap 영역에 생성
		
		// * 클래스 이름이 자료형처럼 사용된다. *
		// -> 클래스 == 사용자 정의 자료형
		
		// int[] arr = new int[5];
		
		/* [직접 접근 제한]
		
		System.out.println("p1의 name : "+p1.name);
		System.out.println("p1의 gender : "+(int)p1.gender);
		// char타입 jvm 기본값은 0
		// 유니코드 문자체계에서 0은 공백을 나타냄
		// -> int형으로 강제 형변환 하면 0인것을 확인할 수 있음
		
		System.out.println("p1의 pNo : "+p1.pNo);
		System.out.println("p1의 address : "+p1.address);
		System.out.println("p1의 phone : "+p1.phone);
		System.out.println("p1의 age : "+p1.age);
		System.out.println("");
		
		// p.필드명 == 직접접근
		p1.tax();
		p1.vote();
		
		p1.name="홍길동";
		p1.gender='남';
		p1.pNo="990011-1234567";
		p1.address="서울시 중구 남내문로 120";
		p1.phone="010-1234-5678";
		p1.age=99;
		
		System.out.println("\np1의 name : "+p1.name);
		System.out.println("p1의 gender : "+p1.gender);
		System.out.println("p1의 pNo : "+p1.pNo);
		System.out.println("p1의 address : "+p1.address);
		System.out.println("p1의 phone : "+p1.phone);
		System.out.println("p1의 age : "+p1.age);
		
		*/
		// 전달하는 값(인자) : 전달인자
		p1.setName("홍길동");
		System.out.println(p1.getName());
		
		p1.setGender('남');
		System.out.println(p1.getGender());
		
		p1.setpNo("990011-1234567");
		System.out.println(p1.getpNo());
		
		p1.setAddress("서울시 중구 남내문로 120");
		System.out.println(p1.getAddress());
		
		p1.setPhone("010-1234-5678");
		System.out.println(p1.getPhone());
		
		p1.setAge(27);
		System.out.println(p1.getAge());
	}
}
