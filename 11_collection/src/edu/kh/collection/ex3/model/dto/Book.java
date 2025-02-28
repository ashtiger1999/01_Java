package edu.kh.collection.ex3.model.dto;

public class Book {
	
	private int num;
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book() {}

	public Book(int num, String title, String author, int price, String publisher) {
		super();
		this.num = num;
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return String.format("%d번 도서 : [도서제목 : %s / 도서저자 : %s / 도서가격 : %d원 / 도서출판사 : %s]",num,title,author,price,publisher);
	}

	public int getNum() {return num;}
	public void setNum(int num) {this.num = num;}

	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}

	public String getAuthor() {return author;}
	public void setAuthor(String author) {this.author = author;}

	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	public String getPublisher() {return publisher;}
	public void setPublisher(String publisher) {this.publisher = publisher;}	
}
