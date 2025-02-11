package edu.kh.variable.ex1;

public class VariableExample4 {

	public static void main(String[] args) {
		
		/* 강제 형변환
		 * -기존 자료형을 원하는 자료형으로 강제 변환시키는 것
		 * 
		 * 1) 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환할때
		 * 2) 출력되는 데이터의 표기법을 변환시키고 싶을때 
		 * 
		 * *강제 형변환 방법
		 * -자료형을 변환시키고 싶은 값 또는 변수 앞에 (자료형)을 작성
		 * 
		 * -강제 형변환 시 데이터의 손실이 발생할 수 있음
		 * */
		
		double temp=3.14;
		int num=(int)temp;
		System.out.println("temp = "+temp); //3.14
		System.out.println("num = "+num); //3
		
		int n=290;
		byte b=(byte)n;
		System.out.println(n); //290
		System.out.println(b); //34
		
		//char <-> int 강제 형변환
		
		char ch='A';
		System.out.println((int)ch);
		
		int number=44085;
		System.out.println((char)number);
		
		//overflow
		//컴퓨터가 예측할 수 없음
		//-개발자가 예측해야함
		int i=2147483647;//int형의 최댓값
		int result=i+1;
		System.out.println(result);
	}

}
