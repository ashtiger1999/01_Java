package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {
	
	Scanner sc=new Scanner(System.in);
	
	public void practice1() {
		
		int[] arr=new int[9];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
			if(i%2==0) sum+=arr[i];
		}
		System.out.println("\n짝수번째 인덱스 합 : "+sum);
	}

	public void practice2() {
		
		int[] arr=new int[9];
		int sum=0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr.length-i;
			System.out.print(arr[i]+" ");
			if(i%2!=0) sum+=arr[i];
		}
		System.out.println("\n홀수 번째 인덱스 합 : "+sum);
	}

	public void practice3() {
		
		System.out.print("양의 정수 : ");
		int num=sc.nextInt();
		
		int[] arr=new int[num];
		for(int i=0; i<num; i++) {
			arr[i]=i+1;
			System.out.print(arr[i]+" ");
		}
	}

	public void practice4() {
		
		int[] arr=new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print("입력 "+i+" : ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int num=sc.nextInt();
		
		boolean flag=false;
		for(int i=0; i<arr.length; i++)	
			if(arr[i]==num) {
				flag=true;
				System.out.println("인덱스 : "+i);
				break;
			}
		if(!flag) System.out.println("일치하는 값이 없습니다.");
	}

	public void practice5() {
		
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		
		char[] arr=new char[str.length()];
		for(int i=0; i<str.length(); i++) arr[i]=str.charAt(i);
		
		System.out.print("문자 : ");
		char ch=sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ",str,ch);
		
		boolean flag=false;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ch) {
				flag=true;
				count++;
				System.out.print(i+" ");
			}
		}
		if(!flag) System.out.print("\n존재하지 않습니다.");
		System.out.printf("\n%c 개수 : %d",ch,count);
	
		}

	public void practice6() {
		
		System.out.print("정수 : ");
		int num=sc.nextInt();
		
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ",i);
			arr[i]=sc.nextInt();			
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			sum+=arr[i];
		}
		System.out.println("\n합계 : "+sum);
	
	}
	
	public void practice7() {
	
		System.out.print("주민등록번호(-포함) : ");
		String str=sc.nextLine();
		
		char[] arr=new char[str.length()];
		for(int i=0; i<arr.length; i++)	{
			arr[i]=str.charAt(i);
			if(i>7) {
				arr[i]='*';
			}
			System.out.print(arr[i]);
		}
	}

	public void practice8() {
		
		int num=0;
		do {
			System.out.print("정수 : ");
			num=sc.nextInt();
			if(num<3||num%2==0) System.out.println("다시 입력하세요.");
		}while(num<3||num%2==0);
		
		int[] arr=new int[num*2-1];
		for(int i=0; i<arr.length; i++) {
			if(i<num) arr[i]=i+1;
			else arr[i]=arr.length-i;
			System.out.print(arr[i]);
			if(i<arr.length-1) System.out.print(", ");
		}
	}
	
	public void practice9_1() {
		
		System.out.print("정수 : ");
		int num=sc.nextInt();
		if(num<3||num%2==0) {
			
		}
		
	}

	public void practice9() {
		
		int[] arr=new int[10];
		System.out.print("발생한 난수 :");
		for (int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*9+1);
			System.out.print(" "+arr[i]);
		}
	}

	public void practice10() {
		
		int[] arr=new int[10];
		System.out.print("발생한 난수 :");
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*9+1);
			System.out.print(" "+arr[i]);
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) max=arr[i];
			if(arr[i]<min) min=arr[i];
		}
		System.out.println("\n최대값 : "+max);
		System.out.println("최소값 : "+min);
	}

	public void practice11() {
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
						
			for(int e=0; e<i; e++) {
				if(arr[i]==arr[e]) {
					i--;
					break;
				}
			}
		}
		for(int i=0; i<arr.length; i++)	System.out.print(arr[i]+" ");

	}

	public void practice12() {
		int[] lotto=new int[6];
		for(int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random()*45+1);
			for(int e=0; e<i; e++) if(lotto[i]==lotto[e]) {i--;	break;}
		}
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++) System.out.print(lotto[i]+" ");
	}
	
	public void practice13() {
		System.out.print("문자열 : ");
		String str=sc.next();
		
		char[] arr=new char[str.length()];
		for(int i=0; i<arr.length; i++)	arr[i]=str.charAt(i);
		Arrays.sort(arr);

		System.out.print("문자열에 있는 문자 : ");
		boolean dp;
		int count=0;
		
		for(int i=0; i<arr.length; i++) {
			dp=false;
			for(int e=0; e<i; e++){
				if(arr[i]==arr[e]) {
					dp=true;
					break;
				}
			}
			if(!dp) {
				System.out.print(arr[i]);
				count++;
				if(i<arr.length-1)System.out.print(", ");
			}
		}
		System.out.println("\n문자 개수 : "+count);

	}
	
	public void practice13_1() {
		System.out.print("문자열 : ");
		String str=sc.nextLine();
		
		char[] arr=new char[str.length()];
		for(int i=0; i<arr.length; i++) arr[i]=(char)str.charAt(i);
		System.out.print("문자열에 있는 문자 : ");
		int count=0;
		for(int i=0; i<arr.length; i++) {
			boolean dp=false;
			for(int e=0; e<i; e++) {
				if(arr[e]==arr[i]) {
					dp=true;
					break;
				}
			}
			if(!dp) {
				System.out.print(arr[i]);
				if(i<arr.length-1) System.out.print(", ");
				count++;
			}
		}
		System.out.println("\n문자 개수 : "+count);
	}
	
	public void practice13_2() {
		System.out.print("문자열 입력 : ");
		String str=sc.nextLine();
		
		int count=0;
		
		char[] arr=new char[str.length()];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(char)str.charAt(i);
			for(int e=0; e<i; e++) {
				if(arr[e]==arr[i]) {
					count++;
					break;
				}
			}
		}
		char[] result=new char[arr.length];
		for(int i=0; i<arr.length; i++) {
			// 중복되지 않은 글자들을 result에 모으고 싶어 result[i]=;
		}
		Arrays.sort(arr);
		
		
		
	}

	public void practice14() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num=sc.nextInt();
		sc.nextLine();
		
		String[] arr=new String[num];
		for(int i=0; i<num; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i]=sc.nextLine();
		}
		
		boolean again=false;
		char ch='0';
		int size=num;
		
		do {
			again=false;
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			ch=sc.next().charAt(0);
			if(Character.toLowerCase(ch)=='y') {
				again=true;
			}else if(Character.toLowerCase(ch)=='n') break;
			else {
				System.err.println("Err : input Y/N");
				again=true;
				continue;
			}
			
			System.out.print("더 입력하고 싶은 개수 :");
			int add=sc.nextInt();
			sc.nextLine();
			size+=add;
			
			arr=Arrays.copyOf(arr, size);
			
			for(int i=num; i<size; i++) {
				System.out.print(i+1+"번째 문자열 : ");
				arr[i]=sc.nextLine();
			}
			num+=add;
		}while(again);
		System.out.println(Arrays.toString(arr));
	}
	public void practice14_1() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num=sc.nextInt();
		sc.nextLine();
		
		String[] arr=new String[num];
		for(int i=0; i<num; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i]=sc.nextLine();
		}
		
		boolean again=false;
		int size=num;
		
		do {
			again=false;
			System.out.print("더 값을 입력하시겠습니까?(Y/N)");
			char ch=sc.next().charAt(0);
			if(Character.toLowerCase(ch)=='y') {
				/**********************************************/
				System.out.print("더 입력하고 싶은 개수 :");
				int add=sc.nextInt();
				sc.nextLine();
				
				arr=Arrays.copyOf(arr, size+add);
				
				for(int i=size; i<size+add; i++) {
					System.out.print(i+1+"번째 문자열 : ");
					arr[i]=sc.nextLine();
				}
				
				size+=add;
				again=true;
				/**********************************************/
			}else if(Character.toLowerCase(ch)=='n') break;
			else {
				System.err.println("Err : input Y/N");
				again=true;
			}
			
		}while(again);
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice14_2() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size=sc.nextInt();
		sc.nextLine();
		
		String[] arr=new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i]=sc.nextLine();
		}
		
		while(true) {
			System.out.print("더 입력하시겠습니까?(y/n) : ");
			char ch=(char)sc.next().charAt(0);
			
			if(ch=='y'||ch=='Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add=sc.nextInt();
				
				arr=Arrays.copyOf(arr, size+add);
				for(int i=size; i<size+add; i++) {
					System.out.print(i+"번째 문자열 : ");
					arr[i]=sc.nextLine();	
				}
				
				size+=add;
			}
			else if(ch=='n'||ch=='N') break;
			else System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice14_3() {
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int size=sc.nextInt();
		sc.nextLine();
		
		String[] arr=new String[size];
		
		for(int i=0; i<size; i++) {
			System.out.print(i+1+"번째 문자열 : ");
			arr[i]=sc.nextLine();
		}
				
		while(true) {
			System.out.print("더 입력하시겠습니까?(y/n) : ");
			char ch=(char)sc.next().charAt(0);
			
			if(ch=='y'||ch=='Y') {
				System.out.print("더 입력하고 싶은 개수 : ");
				int add=sc.nextInt();
				
				String[] newArr=new String[arr.length+add];
						
				for(int i=0; i<newArr.length; i++) {
					if(i<arr.length) {
						newArr[i]=arr[i];
					}
					else {
						System.out.print(i+"번째 문자열 : ");
						newArr[i]=sc.nextLine();
					}
				}
				arr=newArr;
			}
			else if(ch=='n'||ch=='N') break;
			else System.out.println("잘못 입력하셨습니다.");
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
