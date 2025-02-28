package edu.kh.collection.ex2.run;

import edu.kh.collection.ex2.model.dto.Monkey;
import edu.kh.collection.ex2.model.dto.Tiger;
import edu.kh.collection.ex2.model.service.Zoo;

public class Run {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		
		zoo.addAnimal(new Tiger("호랑이"));
		zoo.addAnimal(new Monkey("원숭이"));
		
		zoo.displayMenu();
	}
}
