package edu.kh.ploy.ex3.run;

import edu.kh.ploy.ex3.model.dto.Book;
import edu.kh.ploy.ex3.model.dto.Novel;
import edu.kh.ploy.ex3.model.dto.Poetry;
import edu.kh.ploy.ex3.model.dto.TextBook;

public class Run {
	
	public static void main(String[] args) {
		
		Book[] book = new Book[3];
		book[0] = new Novel("해리포터","J.K. 롤링","판타지");
		book[1] = new TextBook("자바 프로그래밍","James Gosling","캄푸터 과학");
		book[2] = new Poetry("우리들의 사랑시","김소월",30);	
		
		for(Book books : book) {books.displayInfo(); System.out.println();}
	}
}
