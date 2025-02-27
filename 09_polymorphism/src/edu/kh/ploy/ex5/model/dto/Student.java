package edu.kh.ploy.ex5.model.dto;

public class Student extends Person {
	
	private int grade;
	private int classNum;
	private int stdNum;
	
	public Student() {}

	public Student(String id, String name, int age, int grade, int classNum, int stdNum) {
		super(id, name, age);
		this.grade = grade;
		this.classNum = classNum;
		this.stdNum = stdNum;
	}

	public int getGrade() {return grade;}
	public void setGrade(int grade) {this.grade = grade;}

	public int getClassNum() {return classNum;}
	public void setClassNum(int classNum) {this.classNum = classNum;}

	public int getStdNum() {return stdNum;}
	public void setStdNum(int stdNum) {this.stdNum = stdNum;}

	public String getInfo() {
		return super.getInfo() + String.format(" / Grade : %d / Class : %d / No. : %d",grade,classNum,stdNum);
	}
}
