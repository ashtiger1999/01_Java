package edu.kh.variable.ex1;

public class VariableExample3 {
	public static void main(String[] args) {
		
		// 형변환
		/*
		 *컴퓨터는 기본적으로 같은 자료형끼리만 연산이 가능
		 *-다른 자료형간 연산시 오류 발생
		 *형변환 : 값의 자료형을 변환하는것(boolean 제외)
		 *자동/강제 형변환
		 * 
		*/
		
		//자동형변환
		//-서로 다른 두 자료형의 연산시, 컴파일러가 자동으로
		//-값의 범위가 작은 크기의 자료형을 값의 큰 크기의 자료형으로 형변환
		
		int a=1;
		double b=3.0;
		double resultAB=a+b;
		System.out.println(resultAB);
		
		int c=2_100_000_000; //21억
		long d=10_000_000_000l; //100억
		long resultCD=c+d;
		System.out.println(resultCD);
		
		//char<->int 자동형변환
		//char 자료형은 문자형이지만 실제 저장하는 값은 0 부터 6만5천 사이의 정수
		
		char word='각';
		int num=word;
		System.out.println(num);
		
		char w='휋';
		int n=w;
		System.out.println(n);
	}

}
