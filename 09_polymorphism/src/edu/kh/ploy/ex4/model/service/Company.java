package edu.kh.ploy.ex4.model.service;

import edu.kh.ploy.ex4.model.dto.Employee;
import edu.kh.ploy.ex4.model.dto.Person;

public class Company implements ManagementSystem{
	
	private Employee[] employees;
	private int employeeCount;
	
	public Company() {}
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount=0;
	}
	
	public Employee[] getEmployees() {return employees;}
	public void setEmployees(Employee[] employees) {this.employees = employees;}

	public int getEmployeeCount() {return employeeCount;}
	public void setEmployeeCount(int employeeCount) {this.employeeCount = employeeCount;}

	@Override
	public void addPerson(Person person) {
		if(employees[employeeCount]==null) employees[employeeCount]=(Employee)person;
		else {System.out.println("인원이 모두 충원되었습니다."); return;} 
		System.out.print("직원이 추가되었습니다 - " + employees[employeeCount].getInfo());
		employeeCount++;
		/*
		for(int i=0; i<employees.length; i++) {
			if(employees[i]==null) {
				employees[i] = (Employee)person;
				System.out.print("직원이 추가되었습니다 - " + employees[i].getInfo());
				break;
			}
		}
		*/
	}

	@Override
	public void removePerson(String id) {
		for(int i=0; i<employees.length; i++) {
			if(employees[i]==null) break;
			if(employees[i].getId().equals(id)) {
				System.out.print("직원이 삭제되었습니다 - ");
				System.out.print(employees[i].getInfo());
				employees[i]=null;
				employeeCount--;
				break;
			}
			System.out.println("해당 ID를 가진 직원이 존재하지 않습니다.");
		}
	}

	@Override
	public void displayAllPerson() {
		System.out.println("전체 직원 명단 : ");
		for(Employee emps : employees) 
			if(emps!=null) System.out.print(emps.getInfo());
	}
}
