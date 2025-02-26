package edu.kh.ploy.ex4.run;

import edu.kh.ploy.ex4.model.dto.Employee;
import edu.kh.ploy.ex4.model.dto.Person;
import edu.kh.ploy.ex4.model.dto.Prisoner;
import edu.kh.ploy.ex4.model.service.Company;
import edu.kh.ploy.ex4.model.service.ManagementSystem;
import edu.kh.ploy.ex4.model.service.Prison;

public class Run {

	public static void main(String[] args) {
		
		ManagementSystem company = new Company(10);
		ManagementSystem prison = new Prison(10);
		
		Person emp01 = new Employee("EMP01","유재석","기획팀");
		company.addPerson(emp01);
		
		Person emp02 = new Employee("EMP02","정형돈","개발팀");
		company.addPerson(emp02);
		
		System.out.println("===========================");
		
		company.displayAllPerson();
		
		System.out.println("===========================");
		
		Person pri01 = new Prisoner("1001","정준하","밥도둑");
		prison.addPerson(pri01);
		
		Person pri02 = new Prisoner("1002","박명수","탈모");
		prison.addPerson(pri02);
		
		System.out.println("===========================");
		
		prison.displayAllPerson();
		
		System.out.println("===========================");
		
		company.removePerson("EMP01");
		prison.removePerson("1001");
		
		System.out.println("===========================");
		
		company.displayAllPerson();
		prison.displayAllPerson();
	}

}
