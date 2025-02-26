package edu.kh.ploy.ex4.model.service;

import edu.kh.ploy.ex4.model.dto.Person;

public interface ManagementSystem {
	
	void addPerson(Person person);
	void removePerson(String id);
	void displayAllPerson();

}
