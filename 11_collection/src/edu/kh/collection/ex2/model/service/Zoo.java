package edu.kh.collection.ex2.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.ex2.model.dto.Animal;

public class Zoo {

	private List<Animal> animals = new ArrayList<>();

	private Scanner sc = new Scanner(System.in);

	public Zoo() {
	}

	public void addAnimal(Animal animal) {
		animals.add(animal);
	}

	public void showAnimal() {

	}

	public void displayMenu() {
		System.out.println("KH 동물원");
		System.out.println("원하는 작업을 선택하세요.");
		System.out.println("1. 동물들의 울음소리 듣기");
		System.out.println("2. 종료");

		do {
			try {
				System.out.print("선택 : ");
				int num = sc.nextInt();

				if (num == 1) {
					if (!animals.isEmpty()) {
						System.out.println("동물들의 소리를 들어보세요");
						for (Animal animal : animals) {
							animal.sound();
						}
						return;
					}
					System.out.println("동물이 없습니다.");
				} else if (num == 2) {
					System.out.println("프로그램을 종료합니다.");
					sc.close();
					break;

				} else {
					System.out.println("다시 입력해 주세요.");
				}
			} catch (InputMismatchException e) {
				System.out.println("1과 2 중 하나만 입력 하세요.");
				sc.nextLine();
			}
		} while (true);
	}
}
