package edu.kh.collection.ex3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.ex3.model.dto.Book;

public class BookService {

	private List<Book> library = new ArrayList<>();
	private List<Book> favor = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public BookService() {
		library.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		library.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		library.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		library.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		library.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}

	/**
	 * 1. 메인 메뉴 출력
	 */
	public void displayMenu() {

		do {
			try {
				System.out.println("\n==도서 목록 프로그램");
				System.out.println("1. 도서 추가");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 수정");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 추천도서 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.print("\n메뉴를 입력하세요 : ");
				int num = sc.nextInt();

				switch (num) {
				case 1:
					addBook();
					break;
				case 2:
					selectBook();
					break;
				case 3:
					updateBook();
					break;
				case 4:
					removeBook();
					break;
				case 5:
					addFavor();
					break;
				case 6:
					removeFavor();
					break;
				case 7:
					selectFavor();
					break;
				case 8:
					randomBook();
					break;
				case 0:
					System.out.println("\n프로그램 종료");
					sc.close();
					return;
				default:
					System.out.println("\n올바른 형식의 값을 입력하세요.");
				}
			} catch (Exception e) {
				System.out.println("\n올바른 형식의 값을 입력하세요.");
				sc.nextLine();
			}
		} while (true);
	}

	/**
	 * 1-1. 도서 추가
	 */
	public void addBook() {

		System.out.println("\n==도서 추가");

		System.out.print("도서 번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

		System.out.print("도서 제목 : ");
		String title = sc.nextLine();

		System.out.print("도서 저자 : ");
		String author = sc.nextLine();

		System.out.print("도서 가격 : ");
		int price = sc.nextInt();
		sc.nextLine();

		System.out.print("도서 출판사 : ");
		String publisher = sc.nextLine();
		
		for(int i=0; i<library.size(); i++){
			if(num==library.get(i).getNum()) {
				System.out.println("\n등록 실패 : 중복된 도서 번호 입니다.");
				return;
			}
		}
		
		library.add(new Book(num,title,author,price,publisher));
		System.out.println("추가 완료");
	}

	/**
	 * 1-2. 도서 정보 조회
	 */
	public void selectBook() {
		
		System.out.println("\n==도서 정보 조회");
		
		if(library.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		for(Book list : library) System.out.println(list);
	}

	/**
	 * 1-3. 도서 정보 수정
	 */
	public void updateBook() {

		System.out.println("\n==도서 정보 수정");
		
		if(library.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		sc.nextLine();
		
		boolean flag = false;
		for(Book list : library) {
			if(list.getNum()==bookNum) flag = true;
		}
		if(!flag) {
			System.out.println("\n번호가 일치하는 도서가 없습니다.");
			return;
		}
		
		System.out.println("\n어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 도서 제목");
		System.out.println("2. 도서 저자");
		System.out.println("3. 도서 가격");
		System.out.println("4. 도서 출판사");
		System.out.println("0. 수정 종료");
		
		System.out.print("\n메뉴 선택 : ");
		int menuNum = sc.nextInt();
		sc.nextLine();
		
		switch(menuNum) {
		case 1: 
			System.out.println("\n==도서 제목 수정");
			System.out.print("\n수정할 제목를 입력하세요 : ");
			String title = sc.nextLine();
			for(Book list : library) {
				if(list.getNum()==bookNum) {
					list.setTitle(title);
					System.out.println("수정 완료");
					return;
				}
			}
		case 2:
			System.out.println("\n==도서 저자 수정");
			System.out.print("\n수정할 저자를 입력하세요 : ");
			String author = sc.nextLine();
			for(Book list : library) {
				if(list.getNum()==bookNum) {
					list.setAuthor(author);
					System.out.println("수정 완료");
					return;
				}
			}
		case 3: 
			System.out.println("\n==도서 가격 수정");
			System.out.print("\n수정할 가격을 입력하세요 : ");
			int price = sc.nextInt();
			sc.nextLine();
			for(Book list : library) {
				if(list.getNum()==bookNum) {
					list.setPrice(price);
					System.out.println("수정 완료");
					return;
				}
			}
		case 4:
			System.out.println("\n==도서 출판사 수정");
			System.out.print("\n수정할 출판사를 입력하세요 : ");
			String publisher = sc.nextLine();
			for(Book list : library) {
				if(list.getNum()==bookNum) {
					list.setPublisher(publisher);
					System.out.println("수정 완료");
					return;
				}
			}
		case 0: 
			System.out.println("\n 수정 종료");
			break;
		default: System.out.println("\n올바른 형식의 값을 입력하세요.");
		}
	}

	/**
	 * 1-4. 도서 삭제
	 */
	public void removeBook() {

		System.out.println("\n==도서 삭제");
		
		if(library.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean flag = false;
		for(Book list : library) {
			if(list.getNum()==num) flag = true;
		}
		if(!flag) {
			System.out.println("\n번호가 일치하는 도서가 없습니다.");
			return;
		}
		
		System.out.print("\n정말로 삭제하시겠습니까?(Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch=='Y') {
			for(int i=0; i<library.size(); i++) {
				if(library.get(i).getNum()==num) {					
					Book temp = library.remove(i);
					System.out.println("\n삭제가완료되었습니다.");
					System.out.println("삭제된 도서 정보 : ");
					System.out.println(temp);
					return;
				}
			}
		}
		else if(ch=='N') System.out.println("삭제가 취소되었습니다.");
		else System.out.println("\n올바른 형식의 값을 입력하세요.");
	}

	/**
	 * 1-5. 즐겨찾기 추가
	 */
	public void addFavor() {
		
		System.out.println("\n==즐겨찾기 추가");
		
		if(library.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		System.out.print("즐겨찾기에 추가할 도서의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean flag = false;
		for(int i=0; i<library.size(); i++) {
			if(library.get(i).getNum()==num) {
				flag = true;
				System.out.println(library.get(i));
				
				System.out.print("\n즐겨찾기에 추가하시겠습니까?(Y/N) : ");
				char ch = sc.next().toUpperCase().charAt(0);
				
				if(ch=='Y') {
					favor.add(library.get(i));
					System.out.println("즐겨찾기 추가 성공");
				}
				else if(ch=='N') System.out.println("즐겨찾기 추가 취소");
				else System.out.println("\n올바른 형식의 값을 입력하세요.");
				
				break;
			}
		}
		if(!flag) {
			System.out.println("일치하는 번호의 도서가 없습니다.");
			return;
		}
	}

	/**
	 * 1-6. 즐겨찾기 삭제
	 */
	public void removeFavor() {

		System.out.println("\n==즐겨찾기 삭제");
		
		if(favor.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		System.out.print("삭제할 도서의 번호를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		boolean flag = false;
		for(Book list : favor) {
			if(list.getNum()==num) flag = true;
		}
		if(!flag) {
			System.out.println("\n번호가 일치하는 도서가 없습니다.");
			return;
		}
		
		System.out.print("\n정말로 삭제하시겠습니까?(Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		
		if(ch=='Y') {
			for(int i=0; i<favor.size(); i++) {
				if(favor.get(i).getNum()==num) {					
					Book temp = favor.remove(i);
					System.out.println("\n삭제가완료되었습니다.");
					System.out.println("삭제된 도서 정보 : ");
					System.out.println(temp);
					return;
				}
			}
		}
		else if(ch=='N') System.out.println("삭제가 취소되었습니다.");
		else System.out.println("\n올바른 형식의 값을 입력하세요.");
	}

	/**
	 * 1-7. 즐겨찾기 조회
	 */
	public void selectFavor() {
		
		System.out.println("\n==즐겨찾기 조회");
		
		if(favor.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		for(Book list : favor) System.out.println(list);
	}

	/**
	 * 1-8. 추천도서 뽑기
	 */
	public void randomBook() {
		System.out.println("\n==추천도서 뽑기");
		System.out.println(library.get((int)((Math.random())*(library.size()))));
	}
}
