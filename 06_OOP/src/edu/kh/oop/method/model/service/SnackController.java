package edu.kh.oop.method.model.service;

import edu.kh.oop.method.model.vo.Snack;

public class SnackController {

	private Snack s = new Snack();

	public SnackController() {
		// TODO Auto-generated constructor stub
	}

	public String saveData(String kind, String name, String flavor, int numOf, int price) {

		s.setKind(kind);
		s.setName(name);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장완료";
		
	}

	public String confirmData() {
		
		return s.imformation();

	}

}
