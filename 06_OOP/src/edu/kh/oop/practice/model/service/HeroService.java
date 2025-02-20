package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroService {
	
	public void practice() {
		
		// 1) 매게변수 생성자를 이용하여 첫 번째 Hero 객체 생성
		Hero h1 = new Hero("이구역짱","전사",200,20,1,0);
		
		// 2) 매게변수 생성자를 이용하여 두 번째 Hero 객체 생성
		Hero h2 = new Hero("Zi존위자드","마법사",100,100,1,0);
		
		// 3) 객체가 가진 필드 값을 매개변수 생성자를 이용하여 객체 생성 시 출력
//		System.out.println("=================캐릭터 생성=================");
//		System.out.println(h1);
//		System.out.println("=================캐릭터 생성=================");
//		System.out.println(h2);
		
		// 4) 각 객체가 가진 method를 적절히 호출하여 출력결과와 같이 출력
		System.out.println("\n================" + h1.getNickname() + " 시점================");
		h1.attack(100);
		h1.attack(150.5-100);
		h1.attack(200-150.5);
		h1.dash();
		h1.dash();
		h1.dash();
		
		System.out.println(h1);
		
		System.out.println("\n================" + h2.getNickname() + " 시점================");
		h2.attack(300);
		h2.dash();
		h2.attack(600.5-300);
		h2.attack(900.5-600);
		
		System.out.println(h2);
		
	}

}
