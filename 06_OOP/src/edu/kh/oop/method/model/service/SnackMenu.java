package edu.kh.oop.method.model.service;

import java.util.Scanner;

public class SnackMenu {
	
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("type : ");
		String kind = sc.next();
		System.out.print("name : ");
		String name = sc.next();
		System.out.print("flavor : ");
		String flavor = sc.next();
		System.out.print("numOf : ");
		int numOf = sc.nextInt();
		System.out.print("price : ");
		int price = sc.nextInt();
		
		scr.saveData(kind, name, flavor, numOf, price);
		
		System.out.print("저장한 정보를 확인하겠습니까(y/n) : ");
		char ch = sc.next().charAt(0);
		
		if(ch=='y'||ch=='Y') {
			System.out.println(scr.confirmData());
		}
		else if (ch=='n'||ch=='N') {
			
		}
		else System.out.println("잘못 입력하셨습니다.");
		
	}

}
