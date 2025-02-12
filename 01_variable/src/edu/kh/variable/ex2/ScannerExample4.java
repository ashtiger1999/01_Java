package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample4 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// nextInt() 사용 후 nextLine()사용시 문제점
		System.out.print("nextInt() 입력 : ");
		int intNum=sc.nextInt();
		// 정수값 입력
		// -> 정수값과 엔터(\n)가 입력 버퍼에 들어감
		// -> nextInt()는 정수값만을(공백) 수집
		// -> 입력버퍼에는 엔터(\n)만 남은 상태
		
		sc.nextLine();		
		
		System.out.print("nextLine() 입력 : ");
		String word=sc.nextLine();
		// 공백까지 포함(개행 포함)
		// 입력버퍼에 남아있는 엔터(\n) 수집하고 끝
		
		System.out.printf("%d %s",intNum, word);		
	}


}
