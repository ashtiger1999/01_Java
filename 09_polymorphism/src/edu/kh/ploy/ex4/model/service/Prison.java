package edu.kh.ploy.ex4.model.service;

import edu.kh.ploy.ex4.model.dto.Employee;
import edu.kh.ploy.ex4.model.dto.Person;
import edu.kh.ploy.ex4.model.dto.Prisoner;

public class Prison implements ManagementSystem{
	
	private Prisoner[] prisoners;
	private int prisonerCount;
	
	public Prison() {}
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount=0;
	}
	
	public Prisoner[] getPrisoners() {return prisoners;}
	public void setPrisoners(Prisoner[] prisoners) {this.prisoners = prisoners;}
	
	public int getPrisonerCount() {return prisonerCount;}
	public void setPrisonerCount(int prisonerCount) {this.prisonerCount = prisonerCount;}

	@Override
	public void addPerson(Person person) {
		if(prisoners[prisonerCount]==null) prisoners[prisonerCount]=(Prisoner)person;
		else {System.out.println("인원이 모두 충원되었습니다."); return;} 
		System.out.print("수감자가 추가되었습니다 - " + prisoners[prisonerCount].getInfo());
		prisonerCount++;
		/*
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i]==null) {
				prisoners[i] = (Prisoner)person;
				System.out.print("수감자가 추가되었습니다 - " + prisoners[i].getInfo());
				break;
			}
		}
		*/
	}

	@Override
	public void removePerson(String id) {
		for(int i=0; i<prisoners.length; i++) {
			if(prisoners[i]==null) break;
			if(prisoners[i].getId().equals(id)) {
				System.out.print("수감자가 삭제되었습니다 - ");
				System.out.print(prisoners[i].getInfo());
				prisoners[i]=null;
				prisonerCount--;
				break;
			}
			System.out.println("해당 ID를 가진 수감자가 존재하지 않습니다.");
		}
	}

	@Override
	public void displayAllPerson() {
		System.out.println("전체 수감자 명단 : ");
		for(Prisoner pris : prisoners) {
			if(pris!=null) System.out.print(pris.getInfo());
		}
	}
}
