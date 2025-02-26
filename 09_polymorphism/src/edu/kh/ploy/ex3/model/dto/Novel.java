package edu.kh.ploy.ex3.model.dto;

public class Novel extends Book {
	
	private String genre;
	
	public Novel() {}

	public Novel(String title, String author, String genre) {
		super(title, author);
		this.genre = genre;
	}
	
	public void displayInfo() {
		System.out.printf("[소설] 제목 : %s / 저자 : %s / 장르 : %s",super.getTitle(),super.getAuthor(),genre);
	}
}
