package edu.kh.collection.ex2.model.dto;

public class Monkey extends Animal {

	public Monkey() {}

	public Monkey(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println(name + "가 우끼끼하고 웁니다.");
	}

}
