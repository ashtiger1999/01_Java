package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {
	
	Scanner sc = new Scanner(System.in);
	
	public void ex1() {
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
	}
	
	public void ex2() {
		
		for (int i='A'; i<='Z'; i++) System.out.print((char)i);
		
		System.out.println("\n==========================");
		
		for (char i=65; i<65+26; i++) System.out.print(i);
		
	}

	public void ex3() {
		
		System.out.print("Number : ");
		int num=sc.nextInt();
		
		for (int i=1; i<=num; i++) System.out.print(i+" ");
		
	}
	
	public void ex4() {
		// 정수 5개를 입력받아서 합계 구하기
		
		int sum=0;
	
		for (int i=1; i<=5; i++) {	
			System.out.print("input" + i + " : ");
			int input=sc.nextInt();
			
			sum+=input;
		}
		System.out.println("sum : "+sum);
	}
	
	public void ex5() {
		// 1부터 20까지 1씩 증가하면서 출력
		// 단 입력받은 수의 배수는 양쪽에 () 표시
		
		System.out.print("times : ");
		int times =sc.nextInt();
		System.out.print("until : ");
		int until =sc.nextInt();
		
		for (int i=1; i<=until; i++) {
			if (i%times==0) System.out.print("("+i+") ");
			else System.out.print(i+" ");
		}
	}
	
	public void ex6() {
		// 구구단
		
		System.out.print("dan : ");
		int dan=sc.nextInt();
		
		if(dan>9||dan<2) System.out.println("Err : dan");
		else {
			for (int i=1; i<10; i++) System.out.println(dan+" x "+i+" = "+dan*1);
		}
	}

	public void ex7() {
		// 숫자 세기 count
		
		// 1부터 20까지 1씩 증가하며
		// 입력받은 수의 배수의 총 개수 출력
		// 입력받은 수의 배수의 합계 출력
		
		int sum=0;
		int count=0;
		
		System.out.print("times : ");
		int times=sc.nextInt();
		
		System.out.print("until : ");
		int until=sc.nextInt();
		
		for(int i=1; i<=until; i++) {
			if(i%times==0) {
				System.out.print(i+" ");
				sum+=i;
				count++;
			}
		}
		
		System.out.println(": "+count);
		System.out.println("sum : "+sum);
		
	}
	
}
