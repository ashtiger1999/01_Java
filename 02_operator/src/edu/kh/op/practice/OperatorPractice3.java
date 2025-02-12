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
}
