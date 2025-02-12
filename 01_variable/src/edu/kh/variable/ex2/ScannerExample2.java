package edu.kh.variable.ex2;

import java.util.Scanner;
// ctrl + shift + o : 현재 파일에서 import 되지 않은 class를 모두 삽입 시키는 단축키

public class ScannerExample2 {
	
	public static void main(String[] args) {
		
		// 사칙연산 계산기
		// -> 두 실수를 입력받아 사칙연산 결과를 모두 출력
		// -> 단, 출력된 결과값은 소수점 이하 2번째 자리까지만 표현
		
		Scanner sc = new Scanner(System.in);
		double input1;
		double input2;
		double result;
		
		System.out.print("숫자1 : ");
		input1=sc.nextDouble();
		
		System.out.print("숫자2 : ");
		input2=sc.nextDouble();
				
		result=input1 + input2;
		
		System.out.printf("%.2f + %.2f = %.2f",input1, input2, result);
		
	}

}
