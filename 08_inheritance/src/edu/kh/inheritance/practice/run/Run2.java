package edu.kh.inheritance.practice.run;

import java.util.Scanner;

import edu.kh.inheritance.practice.model.dto.Employee;
import edu.kh.inheritance.practice.model.dto.Student;

public class Run2 {

	public static void main(String[] args) {

		Student[] std = new Student[3];

		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 197.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");
		
		for(Student students : std) {
			System.out.println(students.information());
		}
		
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는 구조를 제공
		 * 
		 * 일반적인 for문보다 코드가 더 간결하고 가독성이 좋아서 반복작업을 더 쉽게 작성할 수 있다.
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션 명) {
		 *		// 반복해서 실행할 코드
		 * }
		 * 
		 * */

		System.out.println();
		/************************************************/
		Scanner sc = new Scanner(System.in);

		Employee[] emp = new Employee[10];
		int num = 0;
		while(true){
			System.out.print("이름 : ");
			String name = sc.next();

			System.out.print("나이 : ");
			int age = sc.nextInt();

			System.out.print("신장 : ");
			int height = sc.nextInt();

			System.out.print("몸무게 : ");
			int weight = sc.nextInt();

			System.out.print("급여 : ");
			int salary = sc.nextInt();

			System.out.print("부서 : ");
			String dept = sc.next();

			emp[num] = new Employee(name, age, height, weight, salary, dept);
			num++;
			
			if (num >= 10)
				break;
			
			boolean flag = true;			
			do {
				System.out.print("사원 정보를 추가하시겠습니까?(y/n) : ");
				String str = sc.next().toUpperCase(); // 소문자 -> 대문자
				str.toLowerCase(); // 대문자 -> 소문자
				
				if(str.equalsIgnoreCase("y")) // 대소문자 구분 X
					break;
				else if (str.equalsIgnoreCase("n")) {
					flag = false;
					break;
				} else
					System.out.println("잘못입력하셨습니다.");
			} while (true);
			
			if (!flag)
				break;
		}

		for(Employee employees : emp) {
			if (employees == null) break;
			System.out.println(employees.information());
		}
		
	}
}
