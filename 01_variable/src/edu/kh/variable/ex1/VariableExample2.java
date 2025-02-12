package edu.kh.variable.ex1;

public class VariableExample2 {
	
	public static void main(String[] args) {
		
		/*
		 * 자바 기본 자료형 8가지
		 * 
		 * 논리형 : boolean(1byte)
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float(4byte), double(8byte)
		 * 문자형 : char(2byte, 유니코드)
		 * 
		 * 참조형 - 문자열 String(4byte)
		*/
		
		/*
		 * 변수 선언 : 메모리(RAM)에 값을 저장할 공간을 할당하는 것.
		 * 변수 값 대입 : 변수에 값을 집어 넣는 것.
		*/
		
		boolean isTrue;
		//메모리에 논리값(T/F)을 저장할 공간을 1byte 할당하고 해당 공간의 명칭을 isTrue로 지정
		
		int num=1;
		int access=1;
		
		if(num!=access) {
			isTrue = false;
			
			System.out.println( isTrue );
		}else {
			isTrue=true;
			
			System.out.println( isTrue );
		}
		
		//byte byteNumber=127;
		//메모리에 정수형 숫자를 저장할 공간 1byte를 할당하고 해당 공간의 명칭을 byteNumber로 지정
		//변수명을 byteNumber로 지정 후, 값을 127로 초기화
		//값의 범위는 -127~127에 한정
		
		//int intNumber=123456789;
		//메모리에 정수형 숫자를 저장할 공간 4byte를 할당하고 해당 공간의 명칭을 intNumber로 지정
		//byte, short는 현재 쓰이지 않는 과거의 코드(너무 작은 범위)
		
		
		//대입 연산자 뒤에 할당되는 데이터 값을 리터럴이라고 표현
		//자료형에 따라 리터럴 표기법이 다름
		
		//long lNum = 10,000,000,000;
		//100억 이상의 숫자는 리터럴 뒤에 l을 추가해야함
		//long longNumber = 10000000000l;
		
		//float fNum = 10.0;
		//자료형 float의 변수에 할당되는 리터럴 뒤에는 f를 추가해야함
		//float floatNumber = 10.0f;
		//double doubleNumber = 10.0f;
		//double은 d를 쓸 수 있지만, 강제성을 가지지 않음
		//double에 f를 쓰면 float값인 10.0f를 double값인 10.0으로 자동형변환함
		
		//char charWord ='C';
		//char charNum = 66;
		//System.out.println(charNum);
		//char 타입은 홑따옴표를 표기해야함
		//char 타입은 문자 하나만 할당 가능
		//char 타입에 숫자를 입력하는 경우, 유니코드에 해당되는 문자가 할당됨, 65='A', 49=1, 12593=ㄱ
		//String strWord="String";
		//String 타입은 쌍따옴표를 표기해야함
		
		/*
		 *변수 명명 규칙
		 *
		 * 1. 대소문자 구분
		 * -소문자로 시작 권장
		 * 2. 숫자시작 불가
		 * 3. 길이제한 없음
		 * 4. 예약어(개발언어) 사용 금지
		 * 5. 특수문자는 언더바(_)와 달러($)만 허용
		 * -언더바는 주로 DB에서 사용
		 * 6.변수명은 언어를 가리지 않음
		 * -영문으로 시작 권장
		 * 7. 여러단어를 쓸 경우 2번째 단어부터 첫글자를 대문자로 표기(카멜표기법)
		 * 
		*/	
		
		/*
		 * 상수 명명 규칙
		 * 
		 * final
		 * 변수를 상수화 시키는 것으로, 최초로 값을 할당한 이후 변수값을 다시 초기화할 수 없음
		 * 모든 문자를 대문자로 작성
		 * 복수의 단어를 변수명으로 사용할 경우 언더바(_)사용
		 * 변하면 안되는 고정값을 저장할 때 사용
		 * 특정한 값에 의미를 부여할 때 사용
		 * 
		 * ex)
		 * final int MIN_AGE=1;
		 * final int MAX_AGE=100; 
		 * final int LEFT_MOVE=-1; 
		 * final int RIGHT_MOVE=1; 
		*/

	}

}
