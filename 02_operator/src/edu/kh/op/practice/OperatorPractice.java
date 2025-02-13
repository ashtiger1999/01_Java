package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		int mNum;
		int cNum;
		int result;
		int rest;
		
		System.out.print("num of member : ");
		mNum = sc.nextInt();
		
		System.out.print("num of candy : ");
		cNum = sc.nextInt();
		
		result = cNum / mNum;
		rest = cNum % mNum;
		
		System.out.println("candy per person : " + result);
		System.out.println("rest candy : " + rest);
		
	}

	public void practice2() {
		
		String name;
		int grd;
		int cl;
		int num;
		String sex;
		double scr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("name : ");
		name = sc.nextLine();
		
		System.out.print("grade : ");
		grd = sc.nextInt();
		
		System.out.print("class : ");
		cl = sc.nextInt();
		
		System.out.print("number : ");
		num = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("sex : ");
		sex = sc.nextLine();
		
		System.out.print("score : ");
		scr = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grd,cl,num,name,sex,scr);
		
	}

	public void practice3() {
		
		int kr;
		int en;
		int math;
		int sum;
		double avg;//average
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Korean : ");
		kr = sc.nextInt();
		
		System.out.print("English : ");
		en = sc.nextInt();
		
		System.out.print("Math : ");
		math = sc.nextInt();
		
		sum = kr+en+math;
		avg = sum/3.0;
		
		System.out.println("Sum : "+sum);
		System.out.printf("Average : %.1f",avg);
		
	}
	
}
