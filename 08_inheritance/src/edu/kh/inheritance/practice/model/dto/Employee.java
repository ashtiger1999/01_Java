package edu.kh.inheritance.practice.model.dto;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.salary = salary;
		this.dept = dept;
	}
	
	@Override
	public String information() {
		
		String str = " / 급여 : " + salary;
		str += " / 부서 : " + dept;
		
		return super.information() + str;
	}

	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}

	public String getDept() {return dept;}
	public void setDept(String dept) {this.dept = dept;}
}
