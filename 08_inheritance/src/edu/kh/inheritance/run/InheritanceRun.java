package edu.kh.inheritance.run;

import edu.kh.inheritance.model.dto.BasicPhone;
import edu.kh.inheritance.model.dto.SmartPhone;
import edu.kh.inheritance.model.service.InheritanceService;

public class InheritanceRun {
	
	public static void main(String[] args) {
		
		InheritanceService service = new InheritanceService();
		// service.ex4();
		
		// 예제 1
		
		// SmartPhone 객체 생성
		SmartPhone sp = new SmartPhone();  
		// SmartPhone sp = new SmartPhone("Samsung","Galaxy S20",2020,1200000,"Android",128);  
		sp.setModel("Samsung");
		sp.setModel("Galaxy S20");
		sp.setYear(2020);
		sp.setPrice(1200000);
		sp.setOperatingSystem("Android");
		sp.setStorageCapacity(128);
		
		// BasicPhone 객체 생성
		BasicPhone bp = new BasicPhone();
		// BasicPhone bp = new BasicPhone("Nokia","3310",2000,100000,true);
		bp.setModel("Nokia");
		bp.setModel("3310");
		bp.setYear(2000);
		bp.setPrice(100000);
		bp.setHasPhysicalKeyboard(true);
		
		sp.printInfo();
		
		System.out.println();
		
		bp.checkKeyboard();
		
	}
}
