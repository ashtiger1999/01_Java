package edu.kh.collection.practice.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.practice.model.dto.Book;

public class BookService {

	private List<Book> library = new ArrayList<Book>();
	private List<Book> favList = new ArrayList<Book>();

	private Scanner sc = new Scanner(System.in);

	public BookService() {
		library.add(new Book(1111, "세이노의 가르침", "세이노", 12000, "데이원"));
		library.add(new Book(2222, "문과의 가르침", "유시민", 17000, "돌베개"));
		library.add(new Book(3333, "역행자", "자청", 14000, "웅진지식하우스"));
		library.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 22000, "열린책들"));
		library.add(new Book(5555, "도둑맞은 집중력", "어니스트 허밍웨이", 18000, "어크로스"));
	}

	public void displayMenu() {

		int menuNum = 0;

		do {
			try {
				System.out.println("<<도서 관리 프로그램>>");
				System.out.println("1. 도서 등록");
				System.out.println("2. 도서 조회");
				System.out.println("3. 도서 수정");
				System.out.println("4. 도서 삭제");
				System.out.println("5. 즐겨찾기 추가");
				System.out.println("6. 즐겨찾기 삭제");
				System.out.println("7. 즐겨찾기 조회");
				System.out.println("8. 도서 랜덤 뽑기");
				System.out.println("0. 프로그램 종료");

				System.out.println();
				System.out.print("메뉴를 입력하세요 : ");
				menuNum = sc.nextInt();

				switch (menuNum) {
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
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					break;
				case 0:
					System.out.println("프로그램을 종료합니다...");
					break;
				default:
					System.out.println("잘못 입력하셨습니다.");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (menuNum != 0);
	}

	/**
	 * 도서 등록 메서드
	 */
	public void addBook() {

		System.out.println();
		do {
			System.out.println("==도서 등록하기==");
			System.out.print("도서 번호 입력 : ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("도서 제목 입력 : ");
			String title = sc.nextLine();
			System.out.print("도서 저자 입력 : ");
			String author = sc.nextLine();
			System.out.print("도서 가격 입력 : ");
			int price = sc.nextInt();
			sc.nextLine();
			System.out.print("도서 출판사 입력 : ");
			String publisher = sc.nextLine();

			System.out.println();
			library.add(new Book(number, title, author, price, publisher));
			System.out.println("도서가 등록되었습니다.");

			do {
				System.out.print("계속 입력하시겠습니까?(Y/N)");
				char input = sc.next().toUpperCase().charAt(0);

				if (input == 'N') {
					System.out.println();
					return;
				} else if (input == 'Y') {
					System.out.println();
					break;
				} else {
					System.out.println("\n잘못 입력하셨습니다.");
					System.out.println();
				}
			} while (true);

		} while (true);
	}

	/**
	 * 도서 조회 메서드
	 */
	public void selectBook() {

		System.out.println();
		System.out.println("==도서 목록 조회==");
		for (Book book : library) {
			System.out.println(book);
		}
		System.out.println();
	}

	public void updateBook() {
		
		System.out.println();
		if(library.isEmpty()) {
			System.out.println("등록된 도서가 없습니다.");
			return;
		}
		
		System.out.println("==도서 정보 수정==");
		
		
		

	}

}
