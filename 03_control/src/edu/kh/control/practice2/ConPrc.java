package edu.kh.control.practice2;

import java.util.Scanner;

public class ConPrc {
	
	Scanner sc = new Scanner(System.in);
	
	public void prc1() {
		
		int age;
		double height;
		double weight;
		String result="Not Allowed :";
		
		System.out.print("Age : ");
		age=sc.nextInt();
		
		if (age>120||age<0) result="Err : Age";
		else if (age<12) result="Not Allowed : Age";
		else {
			System.out.print("height : ");
			height=sc.nextDouble();
			System.out.print("weight : ");
			weight=sc.nextDouble();
			
			if (height<0||height>300) result="Err : height";
			else if (weight<0||weight>300) result="Err : weight";
			else if (height>=140&&weight<=90&&weight>=40) result="Allowed";
			else {
				if (height<140) result+=" Height";
				if (weight>120||weight<40) result+=" Weight";
			}
		}
		
		System.out.println(result);
		
	}

	public void prc2() {
		
		String type;
		String pay;
		int num=0;
		
		System.out.print("Car Type(S/M/L) : ");
		type=sc.nextLine().toUpperCase();
		
		switch (type) {
		case"S":pay="Small Car : 50,000won/day"; num=50000; break;
		case"M":pay="Mid-Size Car : 80,000won/day"; num=80000; break;
		case"L":pay="Large Car : 120,000/day"; num=120000; break;
		default:pay="Err : Type";
		}
		System.out.println(pay);

		if(!pay.equals("Err : Type")) {
			System.out.print("Days to Rent : ");
			int day=sc.nextInt();
			
			int result=day*num;
			
			System.out.println("pay : "+result+"won");
		}
		
	}
}
