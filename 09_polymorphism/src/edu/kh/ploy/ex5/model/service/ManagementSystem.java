package edu.kh.ploy.ex5.model.service;

import edu.kh.ploy.ex5.model.dto.Person;

public interface ManagementSystem {
	
	void addPerson(Person person);
	void removePerson(String id);
	void getAllPerson();

}
