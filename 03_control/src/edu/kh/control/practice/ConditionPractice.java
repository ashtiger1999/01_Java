package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		
		int num;
		String result="";
		
		System.out.print("Enter the Number : ");
		num=sc.nextInt();
		
		if(num<0) result="ErrCode : please enter over 0";
		else {
			if (num%2==0) result="2n";
			else result="!2n";
			}
		System.out.println(result);
		}

	public void practice2() {
		
		int ko;
		int en;
		int ma;
		
		int sum;
		double avg;
		
		String result="Pass";
		
		System.out.print("Input Korean Score : ");
		ko=sc.nextInt();
		
		System.out.print("Input English Score : ");
		en=sc.nextInt();
		
		System.out.print("Input Math Score : ");
		ma=sc.nextInt();
		
		sum=ko+en+ma;
		avg=sum/3.0;
		
		if (ko<40 || en<40 || ma<40 || avg<60) result="None Pass"; 	
		
		System.out.printf("Korean : %d, Engligh : %d, Math : %d, Sum : %d, Average : %.1f, %s", ko, en, ma, sum, avg, result);
		
	}

	public void practice3() {
		
		int month;
		String result;
		
		System.out.print("input Month : ");
		month=sc.nextInt();
		
		switch(month) {
		case 1,3,5,7,8,10, 12 : result="31 days"; break;
		case 2 : result="28 days"; break;
		case 4,6,9,11 : result="30 days"; break;
		
		default : result="Err Code : Month";
		}
		
		System.out.println(result);
		
	}

	public void practice4() {
		
		double wei;
		double hei;
		double bmi;
		String result;
		
		System.out.print("Weight : ");
		wei=sc.nextDouble();
		
		System.out.print("Height : ");
		hei=sc.nextDouble();
		
		bmi=wei/(hei*hei);
		
		if(bmi<18.5) result="저체중";
		else if(bmi<23) result="정상체중";
		else if(bmi<25) result="과체중";
		else if(bmi<30) result="비만";
		else result="고도비만";
		
		System.out.println("BMI : "+bmi);
		System.out.println(result);
		
	}
	
	public void practice5() {
		
		double mid;
		double fin;
		double wrk;
		int att;
		double sum;
		String result="pass";
		
		System.out.print("Middle Term Score : ");
		mid=sc.nextDouble();
		mid*=0.2;
		
		System.out.print("Final Term Score : ");
		fin=sc.nextDouble();
		fin*=0.3;
		
		System.out.print("Homework Score : ");
		wrk=sc.nextDouble();
		wrk*=0.3;
		
		System.out.print("Attendance Score : ");
		att=sc.nextInt();
		
		sum=mid+fin+wrk+att;
		
		System.out.println("====Result====");
		
		if(att<20*0.7) {
			result="fail";
			System.out.printf("fail : ATT( %d / 20 )", att);
		}
		else {
			if(sum<70) result="fail : Under the Cutline";
			System.out.printf("Middle Term(20) : %.1f\n",mid);		
			System.out.printf("Final Term(30) : %.1f\n",fin);		
			System.out.printf("Homework(30) : %.1f\n",wrk);		
			System.out.printf("Attendance(20) : %d\n",att);		
			System.out.printf("Sum : %.1f\n",sum);		
			System.out.printf("%s",result);		
		}
				
	}

}
