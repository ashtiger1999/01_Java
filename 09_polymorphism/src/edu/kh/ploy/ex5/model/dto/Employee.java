package edu.kh.ploy.ex5.model.dto;

public class Employee extends Person {
	
	private String dept;
	private int salary;
	private int bonusPoint;
	
	public Employee() {}

	public Employee(String id, String name, int age, String dept, int salary, int bonusPoint) {
		super(id, name, age);
		this.dept = dept;
		this.salary = salary;
		this.bonusPoint = bonusPoint;
	}

	public String getDept() {return dept;}
	public void setDept(String dept) {this.dept = dept;}

	public int getSalary() {return salary;}
	public void setSalary(int salary) {this.salary = salary;}

	public int getBonusPoint() {return bonusPoint;}
	public void setBonusPoint(int bonusPoint) {this.bonusPoint = bonusPoint;}
	
	public String getInfo() {
		return super.getInfo() + String.format(" / Dept. : %s / Salary : %d / BonusPoint : %d",dept, salary,bonusPoint);
	}
}
