package edu.kh.basic;

public class UseWhileToReverseNumber {
	
	public static void main(String[] args) {
		
		int num=13579;
		int reverse=0;
		
		while(num>0) {
			
			int rest=num%10;
			reverse=reverse*10+rest;
			
			num=num/10;
			
		}
		
		System.out.println(reverse);
	}

}
