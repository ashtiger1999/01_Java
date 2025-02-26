package edu.kh.ploy.ex2.model.service;

public interface TestInterface {
	
	int result(int num);
	
	// java 8 이후에는 디폴트 메서드(구현부가 있는 메서드)가 추가
	default void display() {
		System.err.println("TestInterface의 display");
	}

}
