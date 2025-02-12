package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice2 {
	
	public void practice() {
		
		int age;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Age : ");
		age = sc.nextInt();
		
		String adult = age >= 20 ? "adult" : "child";
		System.out.println(adult);
		
		boolean teen = (age >= 13) && (age <= 19);
		boolean weak = (age >= 65) || (age <= 12);
		
		System.out.println("teen : "+teen);
		System.out.println("weak : "+weak);
		
	}

}
