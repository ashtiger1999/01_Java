package edu.kh.variable.ex2;

import java.util.Scanner;

public class ScannerExample3 {
	
	public static void main(String[] args) {
		
		// 문자열(String) 입력
		// 문자열을 3번 입력받아 한줄로 출력하기
		
		Scanner sc=new Scanner(System.in);
		
		// .next() :
		// 다음 입력된 한 단어를 읽어옴
		// 공백(스페이스, 탭 등)을 만나면 입력 중단
		
		// .nextLine() :
		// 다음 입력된 한 줄을 읽어옴
		// 공백과 함께 입력된 모든 내용을 입력받음
		
		String input;
		
//		System.out.print("input : ");
//		input=sc.nextLine();
//		
//		System.out.print("chat : "+input);
//		
		for(int i=1; i>0; i++) {			
			System.out.print("text : ");
			input=sc.nextLine();
			
			String chatNum="chat" + i;
			System.out.printf("%s : %s\n", chatNum, input);
						
		}
	}

}
