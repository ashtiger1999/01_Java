package edu.kh.array2.ex;

import java.util.Arrays;

public class Array2Example {
	
	/*
	 * 2차원 배열
	 * 
	 * - 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	 * -> 행, 열 개념 추가
	 * 
	 * */
	
	 public void ex1() {
		 
		 // 2차원 배열 선언
		 int[][] arr;
		 // int arr[][];
		 // int[] arr[];
		 // -> int 2차원 배열을 참조하는 참조변수 "arr" 선언
		 // 참조변수 == 참조형 == 레퍼런스 변수 == 레퍼런스
		 
		 // 2차원 배열 할당
		 // -> new 자료형[행크기][열크기]
		 arr = new int[2][3];
		 // heap 역역에 int 2차원 배열 2행 3열 공간을 할당
		 // 그 공간의 주소 arr 참조변수에 대입
		 
		 // 2차원 배열 초기화
		 // 1) 행, 열 인덱스를 이용해서 직접 초기화
		 arr[0][0] = 10;
		 arr[0][1] = 20;
		 arr[0][2] = 30;
		 arr[1][0] = 40;
		 arr[1][2] = 50;
		 arr[1][2] = 60;
		 
		 // 2) 2중 for문을 이용해서 초기화
		 int num=10; // 배열 초기화에 사용할 변수
		 
		 // * 배열 길이
		 System.out.println("arr.length : ");
		 System.out.println(arr.length); // 2(행의 길이)
		 // arr이 참조하고 있는 2차원 배열의 행의 길이
		 
		 System.out.println("\narr[0].length : ");
		 System.out.println(arr[0].length); // 3(열의 길이)
		 // arr[1]이 참조하고 있는 배열의 길이
		 
		 
		 System.out.println("\narr[1].length : ");
		 System.out.println(arr[1].length); // 3(열의 길이)
		 // arr[0]이 참조하고 있는 배열의 길이
		 
		 for(int col=0; col<arr.length; col++) { // 행 반복(0,1)
			 
			 for(int row=0; row<arr[col].length; row++) { // 열 반복(0,1,2)
				 arr[col][row]=num;
				 num+=10;
			 }
			 
		 }
		 
		 // Arrays.toString(배열명) : 참조하고 있는 1차원 배열의 값을 문자열로 반환
		 System.out.println("\nArrays.toString(arr) : ");
		 System.out.println(Arrays.toString(arr));
		 
		 // Arrays.deepToString(배열명) 
		 // : 참조하고 있는 배열의 실제 데이터가 나오는 부분까지 접근하여
		 //   모든 값을 문자열로 반환
		 System.out.println("\nArrays.deepToString(arr) : ");
		 System.out.println(Arrays.deepToString(arr));
		 
		 // 3) 선언과 동시에 초기화
		 int[][] arr2 = {{10,20,30},{40,50,60}};
		 int[][] arr3 = new int[][] {{10,20,30},{40,50,60}};
		 
		 System.out.println("\nArrays.deepToString(arr2) : ");
		 System.out.println(Arrays.deepToString(arr2));
		 System.out.println("\nArrays.deepToString(arr3) : ");
		 System.out.println(Arrays.deepToString(arr3));
		 int[][][] ar=new int[2][3][4];
		 
		 num=10;
		 
		 for(int i1=0; i1<ar.length; i1++) { // (0~1)
			 for(int i2=0; i2<ar[i1].length; i2++) { // (0~2)
				 for(int i3=0; i3<ar[i1][i2].length; i3++) { // (0~3)
					 ar[i1][i2][i3]=num;
					 num+=10;
				 }
			 }
		 }
		 System.out.println("\nArrays.deepToString(ar) : ");
		 System.out.println(Arrays.deepToString(ar));
		 
		 
	 }

	 public void ex2() {
		 // 2차원 배열 선언과 동시에 초기화
		 // 3행 3열짜리 정수형 2차원 배열 선언과 동시에
		 // 1 ~ 9 까지 초기화
		 
		 int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		 
		 // 행별로 합 출력
		 // 0행의 합 : 6
		 // 1행의 합 : 15
		 // 2행의 합 : 24
		 
		 for(int col=0; col<arr.length; col++) {
			 int sum=0;
			 for(int row=0; row<arr[col].length; row++) {
				 sum+=arr[col][row];
			 }
			 System.out.printf("%d행의 합 = %d\n",col,sum);
		 }
		 
		 System.out.println("===========================");
		 
		 // 열별로 합 출력
		 // 0열의 합 : 12
		 // 1열의 합 : 15
		 // 2열의 합 : 18
		 
		 for(int col=0; col<arr[0].length; col++) {
			 int sum=0;
			 for(int row=0; row<arr.length; row++) {
				 sum+=arr[row][col];
			 }
			 System.out.printf("%d열의 합 = %d\n",col,sum);
		 }
		 
	 }
	 
	 public void ex3() {
		 // 가변 배열
		 // -> 2차원 배열 생성 시 마지막 배열 차수(열)을 지정하지 않거
		 //	   나중에 서로 크기가 다른 1차원 배열을 생성하여 참조하는 배열
		 
		 char[][] arr = new char[4][];
		 // char 2차원 배열 생성 시 행 부분만 생성
		 
		 System.out.println(Arrays.toString(arr));
		 
		 arr[0] = new char[3];
		
		 System.out.println(Arrays.toString(arr));
		 
		 arr[1] = new char[4];
		 arr[2] = new char[2];
		 arr[3] = new char[5];
		 
		 char ch ='a'; // 초기화할 때 사용할 변수
		 
		 for(int col=0; col<arr.length; col++) {
			 for(int row=0; row<arr[col].length; row++) {
				 arr[col][row]=ch++;
			 }
			 System.out.println("\n"+Arrays.toString(arr[col]));		 
		 }
		 
		 System.out.println("\n"+Arrays.deepToString(arr));		 
	}
}
