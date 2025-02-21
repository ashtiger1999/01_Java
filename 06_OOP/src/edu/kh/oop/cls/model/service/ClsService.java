package edu.kh.oop.cls.model.service;

import edu.kh.oop.cls.model.vo.Student;
import edu.kh.oop.cls.model.vo.User;

// ClsService와 Student/TestVo는 패키지가 다름
public class ClsService /*extends Student*/ {
	
	public void ex1() {
		// **클래스 접근자 확인하기** //
		Student student = new Student();
		// public class인 Student는 import 가능(어디서든 접근 가능)
		
		// TestVo testVo = new TestVo();
		// (default) class인 TestVo는 import 불가능(다른 패키지라 불가능)
		
		// **필드 접근제한자 확인하기** //
		System.out.println( student.v1 );
		// -> 전체에서 직접 접근 가능한 public인 v1만 에러가 발생하지 않음
		// System.out.println( student.v2 );
		// System.out.println( student.v3 );
		// System.out.println( student.v4 );
		
		// **상속 관계에서 직접 접근 가능 범위 테스트** //
		// * 상속받으면 부모의 것도 내것처럼 코드 사용
		// System.out.println( v1 );
		// System.out.println( v2 );
		// Student 클래스를 ClsService가 상속받았으므로
		// Student의 protected 변수인 v2는 직접 접근 가능
		
		// System.out.println( v3 ); // (default)다른패키지 x
		// System.out.println( v4 ); // 해당 클래스 내부가 아닌 다른 클래스 x
	}
	
	public void ex2() {
		// static 필드 확인 예제
		
		// 학생 객체 2개 생성
		Student std1 = new Student();
		Student std2 = new Student();
		
		// static 변수 == 기울어진 폰트
		System.out.println(std1.schoolName);
		System.out.println(std2.schoolName);
		// schoolName에 경고가 발생하는 이유 : 작성법에 오류가 있어서
		
		// * static이 붙은 변수(필드)는 '클래스명.변수명'으로 사용해야함.
		System.out.println(Student.schoolName);
		
		Student.schoolName="정보교육원";
		System.out.println(Student.schoolName);
		
		/*
		 * static
		 * 
		 * 공유 메모리 영역(정적 메모리 영역)
		 * 
		 * -> 프로그램 시작 시 static 영역에 생성되고, 프로그램이 종료될 때까지 계속 존재
		 *  
		 * 
		 * */
	}
	
	public void ex3() {
		// 생성자 확인 테스트
		
		// User 기본 생성자를 이용해서 u1 객체 생성
		User u1 = new User();
		System.out.println();
		System.out.println(u1.getUserId());
		System.out.println(u1.getUserPw());
		System.out.println(u1.getUserName());
		System.out.println(u1.getUserAge());
		System.out.println(u1.getUserGender());
		
		// 문제점 :
		// u1이 참조하고 있는 User 객체와 u2가 참조하고 있는 User 객체의 필드값이 모두 동일함
		// -> 같은 기본 생성자로 User 객체를 생성했기 때문에		
		
		System.out.println();
		System.out.println("-----------------------------");
		
		// 해결방법 1: setter를 이용해서 새로운 값 재대입
		User u2 = new User();
		
		u2.setUserId("user02");
		u2.setUserPw("pass02");
		u2.setUserName("김영희");
		u2.setUserAge(30);
		u2.setUserGender('여');
		
		System.out.println();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
		
		System.out.println();
		System.out.println("-----------------------------");
		
		// 해결방법 2: 매개변수 생성자를 이용해서
		// 객체가 생성될 때부터 다른 값으로 필드를 초기화
		
		User u3 = new User("user03","pass03","김철수",40,'남');
		
		System.out.println();
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserPw());
		System.out.println(u3.getUserName());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
		
		System.out.println();
		System.out.println(u2.getUserId());
		System.out.println(u2.getUserPw());
		System.out.println(u2.getUserName());
		System.out.println(u2.getUserAge());
		System.out.println(u2.getUserGender());
	}

	public void ex4() {
		
		// 매개변수 생성자 예제
		User u1 = new User(); // 기본생성자
		User u2 = new User("user02","pass02"); // 매개변수 생성자
		User u3 = new User("user03","pass03","김철수",40,'남'); // 매개변수 생성자
		
		System.out.printf(
				"u1 : %s / %s / %s / %d / %c\n",
				u1.getUserId(),u1.getUserPw(),u1.getUserName(),u1.getUserAge(),u1.getUserGender());
		
		System.out.printf(
				"u2 : %s / %s / %s / %d / %c\n",
				u2.getUserId(),u2.getUserPw(),u2.getUserName(),u2.getUserAge(),u2.getUserGender());
		
		System.out.printf(
				"u3 : %s / %s / %s / %d / %c\n",
				u3.getUserId(),u3.getUserPw(),u3.getUserName(),u3.getUserAge(),u3.getUserGender());
		
		System.out.println(u1);
		System.out.println(u1.toString());
		
	}
}
