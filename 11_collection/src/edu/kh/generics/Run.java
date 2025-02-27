package edu.kh.generics;

public class Run {
	
	public static void main(String[] args) {

		// String 타입으로 Box 객체 생성
		Box<String> stringBox = new Box<>();
		// T가 String으로 대체됨
		// -> 필드도 String 타입,
		// getter/setter에서 사용되는 타입도 String
		stringBox.setItem("Hello, Generics");
		System.out.println(stringBox.getItem());
		
		Box<Integer> integerBox = new Box<>();
		// Java 7 이상에서는 우변 타입 생략 가능
		// 다이아몬드 연산자 : 컴파일러가 좌변을 보고 타입을 추론
		integerBox.setItem(3000);
		System.out.println(integerBox.getItem());
		
		// 제네릭은 객체(Reference Type)만 허용
		// -> 제네릭은 기본 자료형(primitive type)인 int, double, char 등을 사용할 수 없다.
		// => 대신 Wrapper 클래스를 사용
		
		/*
		 * <기본형>   <Wrapper>
		 * byte    	  Byte
		 * short      Short
		 * int        Integer
		 * long       Long
		 * float      Float
		 * double     Double
		 * char       Character
		 * boolean    Boolean
		 * 
		 * */
		
		int num = 10;
		Integer num1 = num; // 오토박싱(Auto-boxing)
							// 기본형 -> 래퍼클래스 자동변환
		
		int num2 = num1; // 오토언박싱(Auto-unBoxing)
						 // 래퍼클래스 -> 기본형 자동변환
		
		int number = Integer.parseInt("100");
		System.out.println(number);
		
	}

}
