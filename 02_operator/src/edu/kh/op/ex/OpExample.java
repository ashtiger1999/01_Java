package edu.kh.op.ex;

import java.util.Scanner;

// 예제 코드 작성용 클래스 (기능용/메서드용)
public class OpExample {
	
	//ex1() method : OpExample Class에 포함된 메서드
	public void ex1() {
		
		System.out.println("ex1() 호출됨");
		
		// 증감 연산자 : ++, --
		// 1을 더하거나 감소시키는 연산자
		
		int iNum1 = 10;
		int iNum2 = 10;
		
		iNum1++;
		iNum2--;
		
		System.out.println("iNum1 : " + iNum1);		
		System.out.println("iNum2 : " + iNum2);
		
		// 전위 연산
		int temp1 = 5;
		
		System.out.println( ++temp1 + 5);
		// 6+5=11
		
		// 후위 연산
		int temp2 = 3;
		
		System.out.println(temp2-- + 2);
		System.out.println(temp2);
		
		int a = 3;
		int b = 5;
		int c= a++ + --b;
		
		System.out.printf("%d / %d / %d\n",a,b,c);// 4 4 7
		
	}
	
	public void ex2() {
		
		// 비교 연산자 : >, <, >=, <=, ==, !=
		// -> 비교 연산자의 결과는 항상 논리값(T/F)이다.
		
		int a = 10;
		int b = 20;
		
		System.out.println((a == b) == false);
		
		int c = 4;
		int d = 5;
		
		System.out.println((++c != d) == (--c != d));
		//5 5 4 5
		//! = !
		
		
	}

	public void ex3() {
		// 논리 연산자 : &&(AND), ||(OR)
		
		int a = 101;
		System.out.println((a >=100) && (a%2 == 0));
		
		int b = 5;
		System.out.println((1<=b) && (b<=10));
		
		int c = 10;
		System.out.println((c > 10) || (c%2 == 0));
		
	}

	public void ex4() {
		// 삼항 연산자 : 조건식 ? true일 때 실행될 값 : false일 때 실행될 값
		// 조건식 : 연산결과가 참/거짓인 연산식
		
		int num = 30;
		
		// num이 30 초과라면 "num은 30보다 큰 수이다"
		// num이 30 이하라면 "num은 30 이하의 수이다"
		String result = num > 30 ? "num은 30보다 큰 수이다":"num은 30 이하 수이다";
		System.out.println(result);
		
	}

	public void ex5() {
		Scanner sc = new Scanner(System.in);
		
		int input;
		System.out.print("정수 입력 : ");
		input = sc.nextInt();
		
		String result = input >= 0 ? "양수입니다." : "음수입니다.";
		
		System.out.println(result);
		
	}
}
