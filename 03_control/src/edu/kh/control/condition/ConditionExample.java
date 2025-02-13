package edu.kh.control.condition;

import java.util.Scanner;

public class ConditionExample {
	//기능 제공용 클래스
	
	// 생성자 영역
	Scanner sc = new Scanner(System.in);
	
	// 메서드 영역
	public void ex1() {
		
		// if 문
		// 조건식이 true 일때만 내부 코드 수행
		
		// 입력받은 정수가 양수인지 검사
		// 양수라면 "양수입니다"출력
		
		int num;
		
		System.out.print("input : ");
		num = sc.nextInt();
		
		if(num >= 0) {		
			System.out.println("over 0");
		} 
		if(num < 0) {
			System.out.println("less 0");
		}
	}
	
	public void ex2() {
		
		// if - else 문
		// 조건식 결과가 true면 if,
		// false면 else 실행
		
		int num;
		
		System.out.print("input : ");
		num = sc.nextInt();
		
		if ( num % 2 == 0 ) {
			
			if ( num == 0) {
				System.out.println("0");
				
			} else {
				System.out.println("2n");
			}		
		} else {
			System.out.println("!2n");
		}
	}

	public void ex3() {
		
		// if(조건식) - else if(조건식) - else
		
		// 양수, 음수, 0 구분하기
		
		int num;
		System.out.print("Number : ");
		num = sc.nextInt();
		
		if ( num > 0 ) {
			System.out.println("over 0");
			
		} else if ( num < 0 ) {
			System.out.println("under 0");
			
		} else {
			System.out.println("0");
		}	
	}

	public void ex4() {
		
		int month;
		double temp;
		
		String season;
		String weather = null;
		
		System.out.print("Month : ");
		month = sc.nextInt();
		
		System.out.print("Temp : ");
		temp = sc.nextDouble();
		
		sc.nextLine();
		
		if ( month == 1 || month == 2 || month == 12 ) {
			season = "Winter";
			
			if ( temp <= -15 ) weather = "한파 경보";				
			else if ( temp <= -12 ) weather = "한파 주의보";	
		}
		else if( month > 2 && month <= 5 ) season = "Spring";			
		else if ( month > 5 && month <= 8 ) {
			season = "Summer";
			
			if ( temp >= 35 ) weather = "폭염 경보";				
			else if ( temp >= 33 ) weather = "폭염 주의보";			
		}
		else if ( month > 8 && month <= 11 ) season = "fall";		
		else season = "Err";
		
		System.out.printf("Season : %s, Weather : %s", season, weather);
	}
	
	public void ex5() {
		
		int age;
		String result;
		
		System.err.print("Age : ");
		age = sc.nextInt();
		
		if(age<=13) result="child";	
		else if(age>19) result="adult";		
		else result="teen";
		// 실행코드가 한 줄 이라면, 중괄호를 생략할 수 있음
		
		System.out.println(result);
	}

	public void ex6() {
		
		// 점수(100점 만점)를 입력받아
		// 90 이상을 a
		// 80 이상을 b
		// 70 이상을 c
		// 60 이상을 d
		// 미만 f
		// 0/100 범주 외 점수 오류표기
		
		int scr;
		char grd;
		
		System.out.print("Score : ");
		scr = sc.nextInt();
		
		if (scr>100 || scr<0) grd='n';
		else if (scr>=90) grd='A';
		else if (scr>=80) grd='B';
		else if (scr>=70) grd='C';
		else if (scr>=60) grd='D';
		else grd='F';
		
		System.out.println("Grade : "+grd);
	}

	public void ex7() {
		
		int age;
		double height;
		String result;
		
		System.out.print("Age : ");
		age = sc.nextInt();
		
		if (age>100||age<0) result="Err";
		else {
			System.out.print("Height : ");
			height = sc.nextDouble();
			
			if (age>=12 && height >= 140.0)result="access";
			else if (age<12) result="NOT ALLOWED_AGE";
			else result="NOT ALLOWED_HEIGHT";
		}
		System.out.println(result);
	}

	public void ex8() {
		
		int age;
		double hei;
		String result;
		
		System.out.print("Age : ");
		age=sc.nextInt();
		
		if (age>100||age<0) result="Err : Age";
		else {
			System.out.print("Height : ");
			hei=sc.nextDouble();
			
			if (hei>250.0||hei<0) result="Err : Height"; 
			else if (age>=12&&hei>=140.0) result="Access";
			else if(age<12&&hei>=140.0)	result="Not Allowed : Age";
			else if(age>=12&&hei<140.0) result="Not Allowed : Height";
			else result="Not Allowed";			
		}
		
		System.out.println(result);
	}

	public void ex9() {
		// switch 문
		// 여러 case 중 하나를 선택하여 수행하는 조건문
		
		// 요일 번호 입력 (1~7) : 3
		// 수요일
		
		System.out.print("요일 번호 입력 : ");
		int day = sc.nextInt();
		
		switch(day) {
		case 1 : System.out.println("mon"); break;
		case 2 : System.out.println("tue"); break;
		case 3 : System.out.println("wen"); break;
		case 4 : System.out.println("tur"); break;
		case 5 : System.out.println("fri"); break;
		case 6 : System.out.println("sat"); break;
		case 7 : System.out.println("sun"); break;
		default : System.out.println("err");
		}
	}

	public void ex10() {
		// 점수 범위를 벗어난 것은 생각하지 않는다.
		System.out.print("점수 입력(0~100) : ");
		int score = sc.nextInt();
		
		switch(score/10) {
		case 10:
		case 9: System.out.println("a"); break;
		case 8: System.out.println("b"); break;
		case 7: System.out.println("c"); break;
		case 6: System.out.println("d"); break;
		default: System.out.println("f");
		}
	}

}