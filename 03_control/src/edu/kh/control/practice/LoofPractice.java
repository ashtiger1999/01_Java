package edu.kh.control.practice;

import java.util.Scanner;

public class LoofPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void prc1() {
		
		System.out.print("Input Number : ");
		int num=sc.nextInt();
		
		if (num<1) System.out.println("Number should be over '1'");
		
		else {
			for(int i=1; i<=num; i++) System.out.print(i+" ");
		}	
	}

	public void prc2() {
						
		System.out.print("Input Number : ");
		int num=sc.nextInt();
		if(num<1) System.out.println("Number Should be over '1'");
		else for(int i=0; i<num; i++) System.out.print(num-i+" ");
	}

	public void prc3() {
		
		System.out.print("Input Num : ");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<num; i++) {
			System.out.print(i+" + ");
			sum+=i;
		}
		System.out.print(num+" = "+sum);	
	}

	public void prc4() {
		
		System.out.print("Input 1 : ");
		int num1=sc.nextInt();
		
		System.out.print("Input 2 : ");
		int num2=sc.nextInt();
		
		if(num1<1||num2<1) System.out.println("Number Should be over '0'");
		
		else if(num1>num2) for(int i=0; i<=num1-num2; i++) System.out.print(num2+i+" ");
		else for(int i=0; i<=num2-num1; i++) System.out.print(num1+i+" ");
	}

	public void prc5() {
		
		System.out.print("dan : ");
		int dan=sc.nextInt();
		
		System.out.println("=== "+dan+"dan ===");
		
		if (dan<2||dan>9) System.out.println("dan should be over '1' && under '10'");
		
		else for(int i=1; i<10; i++) System.out.printf("%d x %d = %d\n",dan,i,i*dan);
	}

	public void prc6() {
		
		System.out.print("dan : ");
		int dan=sc.nextInt();
		
		if(dan<2||dan>9) System.out.println("dan should be over 1 and under 10");
		
		else for(int i=dan; i<=9; i++) {
			System.out.println("=== "+i+"dan ===");
			for(int times=1; times<=9; times++)
				System.out.printf("%d x %d = %d\n",i,times,i*times);
		}

		
	}

	public void prc7() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int d=1; d<=i; d++)
				System.out.print("* ");
			System.out.println();
		}

	}

	public void prc8() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int i=0; i<num; i++) {
			for(int d=1; d<=num-i; d++)
				System.out.print("* ");
			System.out.println();
		}
		
	}

	public void prc9() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int x=1; x<=num-i; x++)
				System.out.print(" ");
			for(int y=1; y<=i; y++)
				System.out.print("*");
			System.out.println();
		}
		
	}

	public void prc10() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int x=1; x<=i; x++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=num-1; i>0; i--) {
			for(int y=i; y>0; y--)
				System.out.print("*");
			System.out.println();
		}
	}

	public void prc11() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int e=1; e<=num-i; e++) System.out.print(" ");
			for(int s=0; s<=2*(i-1); s++) System.out.print("*");
			System.out.println();
		}

	}

	public void prc12() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}		
		System.out.println();
		for(int e=1; e<=num-2; e++) {
			System.out.print("*");
			for(int p=1; p<=num-2; p++)
				System.out.print(" ");
			System.out.println("*");
		}
		for(int i=1; i<=num; i++) {
			System.out.print("*");
		}
	}

	public void prc13() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=num; i++) {
			if(i%2==0||i%3==0) System.out.print(i+" ");
			if(i%6==0) count++;
		}
		System.out.println("\ncount : "+count);
	}

	public void prc14() {
		
		System.out.print("Input : ");
		int num=sc.nextInt();
		
		for(int row=1; row<=num; row++) {
			for(int a=0; a<=num-row; a++) System.out.print("*");
			for(int b=1; b<=2*row-2; b++) System.out.print(" ");
			for(int c=0; c<=num-row; c++) System.out.print("*");
			System.out.println();
		}
		for(int row=1; row<=num; row++) {
			for(int a=1; a<=row; a++) System.out.print("*");
			for(int b=1; b<=2*num-2*row; b++) System.out.print(" ");
			for(int c=1; c<=row; c++) System.out.print("*");
			System.out.println();
		}
		
	}

	public void prc15() {
		
		System.out.print("input 1 : ");
		int num1=sc.nextInt();
		System.out.print("input 2 : ");
		int num2=sc.nextInt();
		
		if(num1>num2) {
			int restore=num2;
			num2=num1;
			num1=restore;
		}
		
		for(int i=1; i<=num2-num1; i++) {
			int result=num1+i;
			if(result%2==0) System.out.print(result+" ");
		}
	}
	
	public void prc16() {
		
		System.out.print("input : ");
		int n=sc.nextInt();
		
		int count=0;
		
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		if(count==0) System.out.println("약수가 없습니다.");
	}

	public void prc17() {
		
		System.out.print("input : ");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<num; i++) if(num%i==0) sum=sum+i;
		
		if(sum==num) System.out.println(num+"은 완전수입니다.");
		else System.out.println(num+"은 완전수가 아닙니다.");
	}

	public void prc18() {
		
		System.out.print("input : ");
		int num=sc.nextInt();
		
		if(num<=1) System.out.println("소수의 합은 0입니다.");
		else {
			int count=0;
			int sum=0;
			for(int d=1; d<=num; d++) {
				for(int i=1; i<=num; i++) {
					if(num%i==0) {
						count++;
						System.out.print(i+" ");
					}
				}
				if(count==2) sum=sum+num;
			}
			System.out.println(sum);
		}
	}

}
