package edu.kh.oop.method.practice.model.vo;

import java.util.Scanner;

public class PrcMemberService {
	
	private Scanner sc = new Scanner(System.in);
	
	private PrcMember memInfo=null;
	private PrcMember loginMem=null;
	
	public void display() {
		
		int num=0;
		
		do {
			System.out.println("=main=");
			System.out.print("select menu"+"\n");
			System.out.println("1. sign up");
			System.out.println("2. login");
			System.out.println("3. user info");
			System.out.println("4. edit profile");
			System.out.println("5. logout");
			System.out.println("6. delete id");
			System.out.println("0. turn off");
			
			System.out.print("select : ");
			num=sc.nextInt();
			
			switch(num) {
			case 1: System.out.println(signUp());break;
			case 2: System.out.println(login());break;
			case 3: System.out.println(selectMem());break;
			case 4: break;
			case 5: break;
			case 6: break;
			case 0:  System.out.println("see you.."); break;
			default: System.err.println("Err : input");
			}
		}while(num!=0);
		
	}
	
	public String signUp() {
		
		System.out.println("=sign up=");
		System.out.print("id : ");
		String memId = sc.next();
		System.out.print("pw : ");
		String memPw = sc.next();
		System.out.print("pw check : ");
		String memPw2 = sc.next();
		System.out.print("name : ");
		String memName = sc.next();
		System.out.print("age : ");
		int memAge = sc.nextInt();
		
		if(memPw.equals(memPw2)) {
			memInfo = new PrcMember(memId, memPw, memName, memAge);
			return "complete sign up";
		}
		else return "failed sign up";
	}
	
	public String login() {
		
		if(memInfo==null) {
			return "Err : signUp first";
		}
		System.out.print("id : ");
		String id = sc.next();
		
		System.out.print("pw : ");
		String pw = sc.next();
		
		if(id.equals(memInfo.getMemId())&&pw.equals(memInfo.getMemPw())) {
			loginMem = memInfo;
			return "login complete"; 
		}
		return "login failed";
		
	}
	
	public String selectMem() {
		
		if(loginMem==null) {
			return "login first";
		}
		String str = "id : "+loginMem.getMemId();
		str += "\nname : "+loginMem.getMemName();
		str += "\nage : "+loginMem.getAge();
		return str;
		
	}
	
	public void updateDate() {
		
	}
	
	public void logout() {
		
	}

}
