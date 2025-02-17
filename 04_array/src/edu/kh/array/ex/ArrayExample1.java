package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample1 {
	
	Scanner sc=new Scanner(System.in);
	
	/*
	 * 배열(Array)
	 * 
	 * - 같은 자료형의 변수를 하나의 묶음으로 다루는 것
	 * - 묶여진 변수들은 하나의 배열명으로 불러지고
	 *   구분은 "index(0~)"를 이용함
	 * */
	
	public void ex1() {
		// 변수 vs 배열
		
		// =========
		
		// 변수 선언
		int num;
		// Stack 메모리 영역에 "int"자료형을 저장할 수 있는 공간 4byte를 할당하고
		// 그 공간에 "num"이라는 이름을 부여했다
		
		// 변수 대입
		num=10;
		// 생성된 "num"이라는 변수 공간에 10이라는 정수값을 대입
		
		// 변수 사용
		System.out.println(num);
		// "num"이 작성된 자리에 "num"에 저장된 값을 읽어와서 출력
		
		// =========
		
		// 배열 선언
		int[] arr;
		//int arr[];
		// Stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 "arr"이라는 이름을 부여
		// ** 해당 변수는 참조형으로 주소값만을 저장할 수 있다. **
		
		// 배열 할당
		arr=new int[3];
		// new : "new 연산자"라고 하며
		//       Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		
		// int[3] : int 자료형 변수 3개를 하나의 묶음으로 나타내는 배열
		
		// new int[3] : heap 영역에 int형 변수 3칸짜리 int[]를 생성(할당)
		
		// arr = new int[3];
		// int[] int[] -> 같은 자료형 == 연산 가능
		
		System.out.println(arr);
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		// heap 영역에 할당된 공간은 !절대! 비어있을 수 없다.
		// JVM 기본값이 할당되어있다.
		// boolean false, 0, null(참조형)
		
		// 배열 요소 값 대입
		arr[0]=10;
		arr[1]=50;
		arr[2]=100;
		
		// 배열 사용
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		
		// [10, 50, 100] 실제로 arr 배열이 가진 모든 요소의 값을 알고 싶을때
		// Arrays.toString(배열명); - 문자열
		System.out.println(Arrays.toString(arr));

	}

	public void ex2() {
		
		// 배열 선언 및 할당
		int[] arr=new int[4];
		
		// arr[0~3] 전부 JVM에 의해 0으로 초기화 되어있는 상태
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=500;
		arr[3]=1000;
		// arr[4]=5000;
		// java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
		// 배열의 인덱스 범위를 벗어남 : 길이가 4칸인 배열인데, 크기를 넘어선 범위인 인덱스 4번을 가지고 있음
		
		// 코드에서 빨간줄 에러 : 컴파일 에러
		// 실행했을 때 발생하는 에러 : 런타임 에러
		
		// 배열과 for문
		// 배열의 길이가 (몇 칸 인가) : 배열명.length
		System.out.println(arr.length);
		
		for(int i=0; i<arr.length; i++) {
			//i : 0, 1, 2, 3
			System.out.printf("arr[%d]에 저장된 값 : %d\n",i,arr[i]);
		}
		
		// 선언과 동시에 초기화하는 방법
		int[] arr2= {1,2,3,4,5};
		// stack 영역에 int[] 자료형 공간을 4byte 할당하고
		// 그 공간에 arr2라는 이름을 부여
		// heap 메모리 영역에 int 5칸짜리 int[]를 생성하고
		// 0번 인덱스부터 각 요소에 1~5까지 초기화함(대입)
		// int[] 주소값을 arr2 참조변수가 참조함
		System.out.println(Arrays.toString(arr2));
		
	}

	public void ex3() {
		
		double[] height=new double[5];
		
		// 배열의 각 요소에 값을 대입하는 용도의 반복문
		for(int i=0; i<height.length; i++) {
			// 0, 1, 2, 3, 4
			System.out.print((i+1)+"번 키 입력 : "); // 1, 2, 3, 4, 5
			height[i]=sc.nextDouble();
			// height[0]=158.0;
			// height[1]=178.0;
			// ...
			// height[4]=185.0;
		}
		
		System.out.println();
		
		double sum=0; // 합계 저장용 변수
		
		// 배열의 각 요소에 대입 되어있는 값을 사용(합계)하는 용도의 반복문
		for(int i=0; i<height.length; i++) {
			sum+=height[i];
		}
		System.out.println(sum);
		System.out.println(sum/height.length);
	}

	public void ex4() {
		// 입력받은 인원 수 만큼의 점수를 입력받아 배열에 저장
		// 입력이 완료되면 점수 합계, 평균, 최고점, 최저점 출력
		
		// ex)
		// 입력받을 인원 수 : 4
		// 1번 점수 입력 : 100
		// 2번 점수 입력 : 80
		// 3번 점수 입력 : 50
		// 4번 점수 입력 : 60
		
		// 합계 : 290
		// 평균 : 72.5
		// 최고점 : 100
		// 최저점 : 50
		
		System.out.print("입력받을 인원 수 : ");
		int member=sc.nextInt();
		int[] arr=new int[member];		

		double sum=0;		
		int max=arr[0];
		int min=arr[0];

		for(int i=0; i<member; i++) {
			System.out.print((i+1)+"번 점수 입력 : ");
			arr[i]=sc.nextInt();
			
			if (arr[i]>100||arr[i]<0) {
				System.err.println("Err : score");
				i--;
				continue;
			}
			
			sum+=arr[i];
			if (arr[i]>max) max=arr[i];
			if (arr[i]<min) min=arr[i];
		}
		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.printf("평균 : %.2f\n",sum/arr.length);
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);
	}

	public void ex5() {
		// 메뉴 뽑기
		
		String[] arr= {"a", "b", "c", "d", "e", "f"};
		
		System.out.println("오늘의 메뉴 : "+arr[(int)(Math.random()*6)]);
		
	}

	public void ex6() {
		// 배열을 이용한 검색
		
		// 입력받은 정수가 배열에 있는지 없는지 확인
		// 만약 있다면 몇번 인덱스에 존재하는지 출력
		
		// ex)
		// 정수 입력 : 200
		// 1번째 인덱스에 존재
		
		// 정수 입력 :3 
		// 존재하지 않음
		
		int[] arr= {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
		
		System.out.print("정수 입력 : ");
		int input=sc.nextInt();
		
		// 신호를 나타내기 위한 변수
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==input) {
				flag=true;
				System.out.println(i+"번째 인덱스에 존재");
			}
		}
		// flag 상태를 검사
		// flag가 false라면 일치하는 값을 찾지 못했다라는 의미
		// 그런데 flag가 false라면 if문의 조건식이 false이므로 수행코드가 실행되지 않음
		// 부정 논리 연산자를 활용하여 조건식을 완성
		if(!flag) System.out.println("존재하지 않음");
	}

	public void ex7() {
		String[] arr= {"사과", "딸기", "바나나", "키위", "멜론", "아보카도"};
		/*
		 * 과일 입력 : 아보카도
		 * 5번 인덱스에 존재
		 * 
		 * 과일 입력 : 수박
		 * 존재하지 않음
		 * 
		 * */
		boolean flag=false;
		
		System.out.print("과일 입력 : ");
		String input=sc.next();
		
		for(int i=0; i<arr.length; i++) {
			
			if(input.equals(arr[i])) {
				System.out.println(i+"번째 인덱스에 존재");
				flag=true;
			}
		}
		if(!flag) System.out.println("존재하지 않음");
	}

	public void ex8() {
		
		// String 참조형
		
		String str = "가나다"; // String Constant(상수) Pool에 저장
		String str2 = new String("가나다"); // heap 영역에 새 객체로서 저장
		
		
		System.out.println(str);
		System.out.println(str2);
		
		System.out.println();
		
		System.out.println(str.toString());
		
		// String 클래스의 toString 메서드가 존재
		// toString() 메서드는 자기 자신을 그대로 반환
		
		// System.out.println(str);을 실행하면
		// str.toString()이 자동으로 호출됨
		// 대입해둔 문자열 값 자체가 반환됨
		
		// 주소값(객체의 해시코드)을 확인하고 싶다면 다음 코드 참고
		System.out.println(System.identityHashCode(str));
		
	}

	public void ex9() {
		// 문자열을 입력받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		// 문자 하나를 입력받아서 일치하는 문자가 char 배열에 몇개 존재하는지 확인
		// 단, 일치하는 문자가 없을 경우 "존재하지 않습니다" 출력
		
		/*
		 * ex)
		 * 
		 * 문자열 입력 : hello
		 * [h, e, l, l, o]
		 * 검색할 문자 입력 : l
		 * 2개 있음 / 존재하지 않습니다.
		 * 
		 * */
		
		// 사용해야하는 기술, 기능
		// 1) 배열 검색
		// 2) 문자열의 길이 : String.length();
		//    ex) "hello".length() -> 5
		
		// String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 얻어옴.
		// ex) "hello".charAt(1) -> e
		
		// 4) count
		
		System.out.print("문자열 입력 : ");
		String input=sc.nextLine();
		
		char[] arr=new char[input.length()];
		for(int i=0; i<input.length(); i++) arr[i]=input.charAt(i);
		System.out.println(Arrays.toString(arr));
		
		System.out.print("검색할 문자 입력 : ");
		char ch=sc.next().charAt(0);
		// sc.next() -> String 문자열
		// String.charAt(i) -> 문자열의 인덱스 i번째 문자를 char 형태로 추출
		
		int count=0;
		for(int i=0; i<arr.length; i++) if(arr[i]==ch) count++;
		if(count!=0) System.out.println(count+"개 있음");
		else System.out.println("존재하지 않음");
		
	}

}
