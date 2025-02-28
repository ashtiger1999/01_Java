package edu.kh.collection.pack3.prc.model.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private List<Toy> toyList = new ArrayList<>();
	
	public ToyFactory() {
		// TODO Auto-generated constructor stub
	}

	public void displayMenu() {

		do {
			try {
				// menu display
				System.out.println("<<PlayTime Factory>>");
				System.out.println("1. Select All Toys");
				System.out.println("2. Add New Toy");
				System.out.println("3. Remove Toy");
				System.out.println("4. Sort Toys by Made Date");
				System.out.println("5. Select Toys by Useable Age");
				System.out.println("6. Add Material");
				System.out.println("7. Remove Material");
				System.out.println("0. Turn Off");
				// input number to select menu
				System.out.print("\nSelect Menu : ");
				int menuNum = sc.nextInt();

				switch (menuNum) {
				case 1:
					selectToy();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 0:
					System.out.println("Turn Off the Program...");
					return;
				default:
					System.out.println("\nErr: InputMissMatched");
				}

			} catch (InputMismatchException e) {
				e.printStackTrace();
				sc.nextLine();
			}
		} while (true);
	}

	public void addToy() {

	}

	public void removeToy() {

	}

	public void selectToy() {

	}

	public void ageList() {

	}

	public void addMaterial() {

	}

	public void removeMaterial() {

	}

}
