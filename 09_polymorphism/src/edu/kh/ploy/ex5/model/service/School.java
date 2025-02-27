package edu.kh.ploy.ex5.model.service;

import edu.kh.ploy.ex5.model.dto.Person;
import edu.kh.ploy.ex5.model.dto.Student;

public class School implements ManagementSystem{
	
	private Student[] std;
	private int stdCount;
	
	public School() {}

	public School(int size) {
		std = new Student[size];
		stdCount = 0;
	}

	public Student[] getStd() {return std;}
	public void setStd(Student[] std) {this.std = std;}

	public int getStdCount() {return stdCount;}
	public void setStdCount(int stdCount) {this.stdCount = stdCount;}

	@Override
	public void addPerson(Person person) {
		if(stdCount==std.length) {
			System.out.println("인원이 모두 충원되었습니다.");
		}
		else {
			if(person instanceof Student) {
				std[stdCount] = (Student)person;
				stdCount++;			
			}
		}
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i < stdCount - 1; i++) {
			if(std[i].getId().equals(id)) {
				System.out.println("학생 정보가 삭제되었습니다 - " + std[i].getInfo());
				std[i] = null;
				for(int e = i; e < stdCount - 1; e++) {
					std[e] = std[e + 1];
				}
				std[stdCount - 1] = null;
				break;
			}
		}
	}
	
	@Override
	public void getAllPerson() {
		for(Student stds : std) {
			if(stds!=null)
			 System.out.println(stds.getInfo());
		}
	}

	
	

}
