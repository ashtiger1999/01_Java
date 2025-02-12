package edu.kh.variable.ex2;

public class PrintExample {

	public static void main(String[] args) {

		// System.out.println(); : 한 줄 출력용 메서드 (출력 후 줄바꿈 수행)
		System.out.println("test 01");
		System.out.println("test 02");
		
		
		// System.out.print(); : 단순 출력용 메서드 (출력 후 줄바꿈 X) 
		System.out.print("test 03");
		System.out.print("test 04");
		
		// 줄바꿈 여부 차이점은 있지만 괄호안의 내용이 그대로 출력됨
		System.out.print("\ntest 05");
		System.out.println("");
		System.out.print("test 06");
		System.out.println();
		
		// 이스케이프 문자 (escape character) : 특별한 의미를 갖도록 하는 용도로 사용
		// \n : 줄바꿈
		// \t : tab
		
		int iNum1=10;
		int iNum2=5;
		
		// 10 + 5 = 15
		System.out.println( iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
		
		// System.out.printf("연산식", 연산식 각 자리에 들어가는 값/변수 나열);
		/*
		 * %d : 정수형
		 * %o : 8진수
		 * %x : 16진수
		 * 
		 * %c : 문자 - char
		 * %s : 문자열 - String
		 * 
		 * %f : 실수(소수점아래6자리) - float 
		 * %e : 지수형태표현 
		 * %g : 대입값그대로
		 * 
		 * %A : 16진수실수
		 * %b : 논리형 - boolean
		 * */
		System.out.printf("%d + %d = %d\n", iNum1, iNum2, iNum1+iNum2);
		
		// 10 + 10 * 5 / 2 =35
		int i1 = 10;
		int i2 = 5;
		int i3 = 2;
		System.out.printf("%d + %d * %d / %d = %d\n", i1, i1, i2, i3, i1+i1*i2/i3);
		
		// 패턴 연습
		int iNum = 3;
		
		System.out.printf("%d\n", iNum);
		// 5칸 공간 확보 후 오른쪽 정렬
		System.out.printf("%5d\n", iNum);
		// 5칸 공간 화보 후 왼쪽 정렬
		System.out.printf("%-5d %d\n", iNum, iNum);
		
		// 소수점 자리 제어(반올림)
		System.out.printf("%f\n", 10/4.0); //2.500000
		System.out.printf("%.2f\n", 10/4.0); //2.50
		
		// 문자, 문자열, boolean
		boolean isTrue=false;
		char ch='가';
		String str="안녕하세요~!"; //참조형
		
		System.out.printf("%b / %c / %s\n",isTrue,ch,str);
		
		// \
		System.out.println("\\");
		// \o/
		System.out.println("\\o/");
		// \t : tab (한 공간씩 표현 X, 한번에 공간 차지)
		System.out.println("a\tb\tc\td");
		// 유니코드 이스케이프
		System.out.println("\u0041");
		

	}

}
