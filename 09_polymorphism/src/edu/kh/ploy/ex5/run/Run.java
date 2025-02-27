package edu.kh.ploy.ex5.run;

import java.util.Scanner;

import edu.kh.ploy.ex5.model.dto.Person;
import edu.kh.ploy.ex5.model.dto.Student;
import edu.kh.ploy.ex5.model.service.ManagementSystem;
import edu.kh.ploy.ex5.model.service.School;

public class Run {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Num of Students : ");
		int size = sc.nextInt();
		
		ManagementSystem student = new School(size);
		
		while(true) {
			System.out.print("ID :");
			String id = sc.next();
			
			System.out.print("Name :");
			String name = sc.next();
			
			System.out.print("Age :");
			int age = sc.nextInt();
			
			System.out.print("Grade :");
			int grade = sc.nextInt();
			
			System.out.print("Class :");
			int classNum = sc.nextInt();
			
			System.out.print("Number :");
			int stdNum = sc.nextInt();
			
			Person person = new Student(id,name,age,grade,classNum,stdNum);
			
			student.addPerson(person);
			
			System.out.print("Countinue? : ");
			char ch = sc.next().charAt(0);
			
			if(ch=='n'||ch=='N') {
				student.getAllPerson();
				break;
			}
		}
	}
}
