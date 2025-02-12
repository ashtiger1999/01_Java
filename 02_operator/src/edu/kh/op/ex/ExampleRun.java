package edu.kh.op.ex;

// 예제 코드 실행용 클래스 (메인메서드 존재)
public class ExampleRun {

	// 메인메서드 필수 작성
	public static void main(String[] args) {

		// OpExample 생성
		// -> OpExample이라는 클래스(설계도)를 이용해서
		//    객체를 생성하는데, 그 객체 이름이 opEx이다.
		// -> 같은 패키지 (edu.kh.op.ex) 안에 있는 클래스는
		//    import 하지 않아도 자유롭게 불러다 쓸 수 있다.
		OpExample opEx=new OpExample();
		
		// opEx가 가지고 있는 기능(메서드) 중
		// ex1이라는 이름의 메서드를 호출(실행)한다
//		opEx.ex1();

//		opEx.ex2();
		
//		opEx.ex3();
		
//		opEx.ex4();
		
		opEx.ex5();
		
	}

}
