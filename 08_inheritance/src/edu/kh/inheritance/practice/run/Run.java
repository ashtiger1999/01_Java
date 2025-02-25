package edu.kh.inheritance.practice.run;

import java.util.Scanner;

import edu.kh.inheritance.practice.model.dto.Employee;
import edu.kh.inheritance.practice.model.dto.Student;

public class Run {

	public static void main(String[] args) {

		Student[] std = new Student[3];

		std[0] = new Student("홍길동", 20, 178.2, 70.0, 1, "정보시스템공학과");
		std[1] = new Student("김말똥", 21, 197.3, 80.0, 2, "경영학과");
		std[2] = new Student("강개순", 23, 167.0, 45.0, 4, "정보통신학과");

		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].information());
		}

		System.out.println();
		/************************************************/
		Scanner sc = new Scanner(System.in);

		Employee[] emp = new Employee[10];
		int num = 0;
		do {
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
				char ch = sc.next().charAt(0);
				if (ch == 'y' || ch == 'Y')
					break;
				else if (ch == 'n' || ch == 'N') {
					flag = false;
					break;
				} else
					System.out.println("잘못입력하셨습니다.");
			} while (true);
			if (!flag)
				break;
		} while (true);

		for (int i = 0; i < num; i++) {			
			System.out.println(emp[i].information());
		}
		/*
		 * emp[0] = new Employee("박보검", 26, 180.3, 72.0, 100000000, "영업부"); emp[1] = new
		 * Employee("강동원", 38, 182.0, 76.0, 200000000, "기획부");
		 */
	}
}
