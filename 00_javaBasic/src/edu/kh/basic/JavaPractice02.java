package edu.kh.basic;

public class JavaPractice02 {

	public static void main(String[] args) {

		for(int dan=2; dan<10; dan++) {
			System.out.println(dan+"dan");

			for(int times=1; times<10; times++) {
				System.out.println(dan+" * "+times+" = "+dan*times);
			}
			System.out.println();
		}
	}
}
