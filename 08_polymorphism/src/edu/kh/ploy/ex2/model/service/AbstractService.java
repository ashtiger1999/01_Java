package edu.kh.ploy.ex2.model.service;

import edu.kh.ploy.ex2.model.dto.Animal;
import edu.kh.ploy.ex2.model.dto.Fish;
import edu.kh.ploy.ex2.model.dto.Person;

public class AbstractService {
	
	public void ex1() {
		
		// Animal 객체 생성
		// Animal a1 = new Animal();
		// Cannot instantiate the type Animal
		// = 애니멀 타입은 객체화 될 수 없음
		// => 추상 클래스는 객체로 생성할 수 없음
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setType("척추동물_포유류_인간");
		p1.setEatType("잡식");
		
		Fish f1 = new Fish();
		f1.setType("척추동물_어류_상어");
		f1.setEatType("육식");
	
		System.out.println(p1);
		System.out.println(f1);
		
		// 추상 클래스와 다형성
		Animal a1 = new Person(); // 다형성 중 업 캐스팅
		Animal a2 = new Fish(); // 다형성 중 업 캐스팅
		
		System.out.println();
		a1.ex();
		a1.eat();
		a1.breath();
		a1.move();
		
		System.out.println();
		a2.ex();
		a2.eat();
		a2.breath();
		a2.move();
	}

}