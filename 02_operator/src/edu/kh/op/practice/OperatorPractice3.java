package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	public void practice1() {
		
		int price;
		boolean isTrue;
		double pay;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Price : ");
		price = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Have Membership?(true/false) : ");
		isTrue = sc.nextBoolean();

		pay = isTrue == true ? price*0.9 : price*0.95;
		System.out.printf("pay : %.1f",pay);
		
	}

	public void practice2() {
		
		int money;
		int i50;
		int i10;
		int i5;
		int i1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Money : ");
		money = sc.nextInt();
		
		i50 = money / 50000;
		i10 = money % 50000 / 10000;
		i5 = money % 10000 / 5000;
		i1 = money % 5000 / 1000;
		
		System.out.println("50000W : " + i50);
		System.out.println("10000W : " + i10);
		System.out.println("5000W : " + i5);
		System.out.println("1000W : " + i1);
		
	}

	public void practice3() {
		
		int num1;
		int num2;
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Number 1 : ");
		num1 = sc.nextInt();
		
		System.out.print("Number 2 : ");
		num2 = sc.nextInt();
		
		result = num1 % num2 == 0 ? "배수입니다." : "배수가 아닙니다.";
		
		System.out.println(result);
		
	}
	
}
