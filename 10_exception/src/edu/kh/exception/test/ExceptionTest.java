package edu.kh.exception.test;

public class ExceptionTest {

	public static void main(String[] args) {

		// 컴파일 에러 => 개발자의 코드 작성 실수
		// 자료형이 맞지 않아, 연산이 불가하여 "컴파일 에러"가 발생(잘못된 코드)
		// int a = 99.9; // Type mismatch: cannot convert from double to int
		int a = (int)99.9; // 코드 수정 가능
		
		// 런타임 에러 => 프로그램 수행 중 발생하는 에러
		// 				  주로 if문으로 처리 가능
		int[] arr = new int[3]; // 크기가 3 : index = { 0, 1, 2 }
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		// arr[3] = 40;
		// java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
		// 배열 범위 초과 예외
		int index = 3;
		if( index >= arr.length ) { // 배열의 인덱스 범위를 초과한 값을 넣는 경우.
			System.out.println("배열 범위 초과");
		}else {
			arr[index] = 40;
			System.out.println("배열 범위를 초과하지 않음");
		}
	}

}
