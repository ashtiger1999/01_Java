package edu.kh.collection.pack3.prc.model.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import edu.kh.collection.pack3.prc.model.dto.Toy;

public class ToyFactory {

	private Scanner sc = new Scanner(System.in);
	private Set<Toy> toys = new HashSet<>();
	private Map<Integer, String> materials = new HashMap<>();
	
	public ToyFactory() {
		materials.put(1, "fabric");
		materials.put(2, "plastic");
		materials.put(3, "glass");
		materials.put(4, "rubber");

		toys.add(new Toy("Mommy Long Legs",36000,"pink",8,"19940805",addMaterial(1,4)));
		toys.add(new Toy("Huggy Wuggy",12000,"blue",5,"19940312",addMaterial(1,2)));
		toys.add(new Toy("Kissy Missy",15000,"pink",5,"19940505",addMaterial(1,2)));
		toys.add(new Toy("Cat Nap",27000,"purple",8,"19960128",addMaterial(1,2)));
		toys.add(new Toy("Poppy",57000,"red",12,"19931225",addMaterial(1,2,4)));
	}
	
	public void test() {
		
		System.out.print("n : ");
		String str = sc.next();
		
		for (Integer key : materials.keySet()) {
			if(str.equals(materials.get(key))){
				System.out.println("added");
			}
		}
		
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
				sc.nextLine();
				System.out.println();

				switch (menuNum) {
				case 1:
					selectToy();
					break;
				case 2:
					addToy();
					break;
				case 3:
					removeToy();
					break;
				case 4:
					sortByYear();
					break;
				case 5:
					selectAge();
					break;
				case 6:
					updateMaterial();
					break;
				case 7:
					removeMaterial();
					break;
				case 0:
					System.out.println("Turn Off the Program...");
					return;
				default:
					System.out.println("\nErr: InputMissMatched");
					System.out.println();
				}

			} catch (InputMismatchException e) {
				e.printStackTrace();
				sc.nextLine();
				System.out.println();
			}
		} while (true);
	}

	public void addToy() {
		System.out.println("==Add Toy==");
		System.out.print("Toy Name : ");
		String name = sc.nextLine();
		System.out.print("Age Requirement : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("Price : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("Color : ");
		String color = sc.nextLine();
		System.out.print("Manufacturing Year(YYYYMMDD) : ");
		String year = sc.nextLine();
		
		Set<String> material = new HashSet<>();
		
		char ch = 'y';
		do {
			System.out.print("Material('exit' to end) : ");
			String mat = sc.nextLine();
			if(mat.equalsIgnoreCase("exit")) break;
			if(materials.containsValue(mat)) {
				material.add(mat);
			}
			else {
				materials.put(materials.size()+1, mat);
				material.add(mat);
			}
		}while(true);
		
		toys.add(new Toy(name, price, color, age, year, material));
		System.out.println();
	}

	public void removeToy() {
		if(toys.isEmpty()) {
			System.out.println("Err : No Toys Have Been Added");
			return;
		}
		System.out.println("==Remove Toy==");
		System.out.print("Input Toy to Remove : ");
		String name = sc.nextLine();
		for(Toy item : toys) {
			if(item.getName().equalsIgnoreCase(name)) {
				toys.remove(item);
				System.out.println("Toy Removed");
				System.out.println();
				return;
			}
		}
		System.out.println("Err : No Matched Toy");
		System.out.println();
	}

	public void selectToy() {
		if(toys.isEmpty()) {
			System.out.println("Err : No Toys Have Been Added");
			return;
		}
		System.out.println("==Toys List==");
		int num = 1;
		for(Toy toy : toys) {
			System.out.println(num+". "+toy);
			num++;
		}
		System.out.println();
	}

	public void sortByYear() {
		System.out.println("==Sort Toys by Made Date==");
		List<Toy> list = new ArrayList<>(toys);
		Collections.sort(list, new Comparator<Toy>() {

			@Override
			public int compare(Toy o1, Toy o2) {
				return o1.getYear().compareTo(o2.getYear());
			}
		});
		
		for(Toy toys : list) System.out.println(toys);
		System.out.println();
	}

	public void selectAge() {
		if(toys.isEmpty()) {
			System.out.println("No Toys Have Been Added");
			System.out.println();
			return;
		}
		System.out.println("==Toys List Sort By Age When Kids Can Use==");
		List<Integer> arr = new ArrayList<Integer>();
		for(Toy item : toys) {
			if(!arr.contains(item.getAge()))
			arr.add(item.getAge());
		}
		Collections.sort(arr);
		for(Integer temp : arr) {
			System.out.printf("[연령 : %d세]\n",temp);
			for(Toy item : toys) {
				if(item.getAge()==temp) {
					System.out.println(item);
				}
			}
		}
		System.out.println();
	}
	
	public Set<String> addMaterial(int...key) {
		// 재료가 몇개 들어올지 정해져있지 않음
		// -> 가변인자 사용 : 자료형...변수명
		Set<String> material = new HashSet<String>();
		for(Integer keys : key) material.add(materials.get(keys));
		
		return material;
	}
	
	public void updateMaterial() {
		if(materials.isEmpty()) {
			System.out.println("No Materials Have Been Added");
			System.out.println();
			return;
		}
		System.out.println("==Add Material==");
		System.out.println("--Material List--");
		int index=1;

		for(Map.Entry<Integer,String> entry : materials.entrySet()) {
			System.out.println(index+" : "+entry.getValue());
			index++;
		}
		System.out.println("/******************************/");
		System.out.print("Input Material Key : ");
		int key = sc.nextInt();
		System.out.print("Input Material Name : ");
		String mat = sc.next();
		if(materials.containsValue(mat)) {
			System.out.println("This Material Already Added");
			System.out.println();
			return;
		}
		if(materials.containsKey(key)) {
			System.out.print("This Key Already Added. Would You Update the Info. of Material?(Y/N) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			if(ch=='N') {
				System.out.println("Adding Material Failed");
				System.out.println();
				return;
			}else if(ch!='Y') {
				System.out.println("Err : InputMismatched");
				System.out.println();
				return;
			}
		}
		materials.put(key, mat);
		System.out.println("Adding Material Succeed");
		System.out.println();
		return;
	} 

	public void removeMaterial() {
		if(materials.isEmpty()) {
			System.out.println("No Materials Have Been Added");
			System.out.println();
			return;
		}
		System.out.println("==Remove Material==");
		System.out.println("--Material List--");
		int index=1;
		
		for(Map.Entry<Integer,String> entry : materials.entrySet()) {
			System.out.println(index+" : "+entry.getValue());
			index++;
		}
		System.out.println("/******************************/");
		System.out.print("Input Material to Remove : ");
		String name = sc.next();
		if(!materials.containsValue(name)) {
			System.out.println("No Material Has Been Matched");
			System.out.println();
			return;
		}
		for(Map.Entry<Integer,String> temp : materials.entrySet()) {
			if(temp.getValue().equals(name)) {
				materials.remove(temp.getKey());
				System.out.println("Material Removed");
				System.out.println();
				return;
			}
		}
	}
}
