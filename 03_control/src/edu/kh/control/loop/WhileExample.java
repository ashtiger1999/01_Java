package edu.kh.control.loop;

import java.util.Scanner;

public class WhileExample {
	
	Scanner sc=new Scanner(System.in);
	
	/*
	 * while 문
	 * 
	 * 별도의 초기식, 증감식이 존재하지 않고
	 * 반복 종료 조건을 자유롭게 설정하는 반복문
	 * 
	 * 확실히 얼마만큼 반복 후에 끝날지는 모르지만
	 * 언젠가 반복조건이 "false"가 되는 경우에 반복을 종료
	 * 
	 * */
	
	public void ex1() {
		// 메뉴판 출력
		
		int input=9;
		
		while (input!=0) {
			
			System.out.println("---menu---");
			System.out.println("1. ddockbbockki");
			System.out.println("2. zzolmyeon");
			System.out.println("3. kimbab");
			System.out.println("0. off");
			
			System.out.print("choice : ");
			input=sc.nextInt();
			
			System.out.println();
			
			switch (input) {
			case 1:System.out.println("order ddockbbockki\n"); break;
			case 2:System.out.println("order zzolmyeon\n"); break;
			case 3:System.out.println("order kimbab\n"); break;
			case 0:System.out.println("system off\n"); break;
			default:System.out.println("err : input\n");
			}
		}
		
	}

	public void ex2() {
		// 입력되는 모든 정수의 합 구하기
		//단, 0이 입력되면 반복 종료 후 결과 출력
		// -> 0이 입력되지 않으면 무한히 반복
		int input;
		int sum=0;
		do {
			System.out.print("input : ");
			input=sc.nextInt();
			sum+=input;
		} while (input!=0);
		System.out.println("sum : "+sum);

	}

}
