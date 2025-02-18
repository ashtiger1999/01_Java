package edu.kh.control.branch;

import java.util.Scanner;

public class BranchExample {
	
	Scanner sc=new Scanner(System.in);
	
	public void ex1() {
		// 1부터 10까지 1씩 증가하며 출력하는 반복문 작성
		// 단, 5를 출력하면 반복문 종료
		// 12345
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");

			if(i==5) break;			
		}
	}
	
	public void ex2() {
		// 입력받은 모든 문자열을 누적해라
		// 단, "exit@" 입력시 문자열 누적 종료 후, 결과 출력
		
		String result="";
		
		while (true) {
			System.out.print("input : ");
			String input=sc.nextLine();
			// next(); - 다음에 오는 공백을 포함하지 않는 한 단어
			// nextLine(); - 다음에 오는 문자열 한 줄
			
			if(input.equals("exit@")) break;
			// 자바에서 문자열은 비교연산자(==) 사용 불가
			// 비교연산자는 기본자료형 간의 연산에서만 사용 가능
			// "String"은 기본자료형이 아닌 참조형
			
			// .equals() 메서드
			// str1.equals("str2");
			// -> if(str1==str2) boolean==true;
			result+=input+" ";
		}
		System.out.println(result);
	}
	
	public void ex3() {
		// 1에서 10까지 1씩 증가하며 출력
		// 단 ,3의 배수 제외
		
		// 1 2 4 5 7 8 10
		for(int i=1; i<=10; i++) {
			if(i%3==0) continue;
			
			System.out.print(i+" ");
		}
		
	}
	
	public void ex4() {
		// 1부터 100까지 1씩 증가하며 출력하는 반복문
		//, 단 5의 배수는 건너 뛰고
		// 증가하는 값이 40이 되었을때 반복 멈춤
		
		// 1 2 3 4  6 7 ... 39.
		
		for(int i=1; i<=100; i++) {
			if(i==40) break;
			if(i%5==0) continue;
			System.out.print(i+" ");
		}
	}

	public void RSPGame() {
		// 가위바위보 게임
		// 몇 판 할지 입력 받음
		// 입력받은 판 수 만큼 반복
		
		// 컴퓨터 : Math.random() : 0.0~1.0 사이의 난수 생성
		// 1 ~ 3 가이의 난수 생성
		// 1이면 가위, 2이면 바위, 3이면 보 지정
		// 컴퓨터와 플레이어 가위바위보 판별
		
		// Win / Lose / Draw
		// 매판마다 - 현재 기록 : n1승 n2패 n3무
		
		System.out.println("[RSP - Game]");
		
		System.out.print("Play Coin : ");
		int round=sc.nextInt();
		System.out.println();
		
		// 승패 기록용 변수
		int win=0;
		int lose=0;
		int draw=0;
		String result;
		
		for(int i=1; i<=round; i++) {
			
			System.out.println("Round "+i);
			System.out.print("Select : ");
			String select=sc.next();
			
			int random=(int)(Math.random()*3+1); // 1, 2, 3
			String com=null;
			
			switch(random) {
			case 1:com="가위"; break;
			case 2:com="바위"; break;
			case 3:com="보"; break;
			}
			
			System.out.printf("computer choose : [%s]\n",com);
			
			if(select.equals(com)) {
				draw++;
				result="Draw";
			}
			else {
				boolean win1=select.equals("가위")&&com.equals("보");
				boolean win2=select.equals("바위")&&com.equals("가위");
				boolean win3=select.equals("보")&&com.equals("바위");
				
				if(win1||win2||win3) {
					win++;
					result="Win";
				}
				else {
					lose++;
					result="Lose";
				}
			}
			
			System.out.println("You "+result);
			System.out.printf("WIN : %d LOSE : %d DRAW : %d\n\n",win,lose,draw);
		}
	}

	public void RSP() {
		System.out.println("[RSP]");
		System.out.print("Coin : ");
		int coin=sc.nextInt();
		System.out.println();
		
		int win=0;
		int lose=0;
		int draw=0;
		String result;
		
		for(int i=1; i<=coin; i++) {
			System.out.println("Round "+i);
			System.out.print("Select : ");
			String select=sc.next();
			
			if(!(select.equals("가위")||select.equals("바위")||select.equals("보"))) {
				System.out.println("Error : input");
				System.out.println();
				i--;
				continue;
			}
			
			int random=(int)(Math.random()*3+1);
			String com=null;
			
			switch(random) {
			case 1:com="가위"; break;
			case 2:com="바위"; break;
			case 3:com="보"; break;
			}
			
			if(select==com) {
				draw++;
				result="DRAW";
			}else {
				boolean win1=select.equals("가위")&&com.equals("보");
				boolean win2=select.equals("바위")&&com.equals("가위");
				boolean win3=select.equals("보")&&com.equals("바위");
				
				if(win1||win2||win3) {
					win++;
					result="WIN";
				}else {
					lose++;
					result="LOSE";
				}
			}
			System.out.printf("Computer : [%s]\n",com);
			System.out.println("YOU "+result);
			System.out.printf("win : %d lose : %d draw : %d\n\n",win,lose,draw);
			
		}
	}

	public void rsp() {
		
		System.out.println("[rsp game]");
		System.out.print("coin : ");
		int coin=sc.nextInt();
		
		while (coin<=0) {
			System.err.println("Err : coin\n");
			
			System.out.println("[rsp game]");
			System.out.print("coin : ");
			coin=sc.nextInt();
		}
		System.out.println();
		
		int win=0;
		int lose=0;
		int draw=0;
		String result="";
		
		for(int i=1; i<=coin; i++) {
			System.out.println("round : "+i);
			System.out.print("select : ");
			String select=sc.next();
			
			if(!(select.equals("가위")||select.equals("바위")||select.equals("보"))){
				System.err.println("Err : select\n");
				i--;
				continue;
			}
			
			
			int random=(int)(Math.random()*3);
			String com="";
			switch(random){
				case 0:com="가위"; break;
				case 1:com="바위"; break;
				case 2:com="보"; break;
			}
			
			if(select.equals(com)) {
				draw++;
				result="DRAW";
			}
			else {
				boolean win1=select.equals("가위")&&com.equals("보");
				boolean win2=select.equals("바위")&&com.equals("가위");
				boolean win3=select.equals("보")&&com.equals("바위");
				if(win1||win2||win3) {
					win++;
					result="WIN";
				}
				else {
					lose++;
					result="LOSE";
				}
			}
			System.out.println("com : "+com);
			System.out.println(result);
			System.out.printf("win : %d lose : %d draw : %d\n\n",win,lose,draw);
		}
	}
}
