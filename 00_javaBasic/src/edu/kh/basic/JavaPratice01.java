package edu.kh.basic;

public class JavaPratice01 {
	public static void main(String[] args) {
		
		int dan=2;
		int times=1;
		
		while(dan<10) {
			System.out.println(dan+"dan");
			while(times<10) {
				System.out.println(dan+" * "+times+" = "+dan*times);
				times++;
			}
			times=1;
			dan++;
			System.out.println();
		}
		
	}

}
