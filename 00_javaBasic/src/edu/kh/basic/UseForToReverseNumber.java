package edu.kh.basic;

public class UseForToReverseNumber {
	
	public static void main(String[] args) {
		
		int num=24682;
		int reverse=0;
		int rest;
		
		for(; num>1; num/=10) {
			rest=num%10;
			
			reverse=reverse*10+rest;
		}
		System.out.println(reverse);
		
	}

}
