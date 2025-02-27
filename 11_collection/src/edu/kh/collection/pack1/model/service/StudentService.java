package edu.kh.collection.pack1.model.service;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.pack1.model.dto.Student;

public class StudentService {

	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
	// * 인터페이스 객체 생성 X, 부모 참조변수 O

	// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)

	// new ArrayList() : 기본 생성자 -> 기본 크기 10짜리 리스트 생성
	// 하지만 리스트의 크기는 필요에 따라 늘고 줄기 때문에 기본 크기에 큰 의미를 두지 않는다

	// 학생 정보를 저장할 List 생성
	private List<Student> studentList = new ArrayList<>(); // 검색(조회)에 효율적
	// private List<Student> studentList = new LinkedList<>(); // 추가, 삭제, 수정에 효율적
	// 다형성 중 업 캐스팅 적용
	// 부모타입(List) 참조변수(student) = 자식객체(ArrayList) 주소

	private Scanner sc = new Scanner(System.in);

	private List<Object> testList = new ArrayList<Object>();

	public StudentService() { // 기본 생성자
		studentList.add(new Student("홍길동", 23, "서울시 중구", '남', 100));
		studentList.add(new Student("고영희", 24, "경기도 안산시", '여', 90));
		studentList.add(new Student("강아지", 25, "서울시 강남구", '여', 80));
		studentList.add(new Student("곽두팔", 26, "인천시 중구", '남', 70));
		studentList.add(new Student("박주희", 27, "서울시 서대문구", '여', 60));

	}

	// List 테스트 용 메서드 예제
	public void ex() {

		// List.add(Object e) : List에 객체를 추가
		// 매개변수 타입이 Object == 모든 객체를 매개변수로 전달할 수 있음

		testList.add("문자열");
		testList.add(new Student("홍길동", 25, "서울", 'm', 90));
		testList.add(sc);
		testList.add(new Object());

		// 컬렉션 특징 : 여러 타입의 데이터를 저장할 수 있다.

		// Object List.get(index) : 리스트에서 index번째 인덱스에 있는 객체를 반환
		// 반환형이 Object == 모든 객체를 반환할 수 있다.

		System.out.println(testList.get(0));
		System.out.println(testList.get(1));
		System.out.println(testList.get(2));
		System.out.println(testList.get(3));

		// testList에 꺼내온 인덱스 요소가 Student 혹은 상속관계인지 검사
		// 만약 Student라면 이름을 꺼내오고 싶다.
		for (Object e : testList) {
			if (e instanceof Student) {
				System.out.println(((Student) e).getName());
			}
		}
	}

	/**
	 * alt + shif + j : 메서드 설명용 주석
	 *
	 * @apiNote 메뉴 출력용 메서드
	 * @author 허재호(email@gmail.com)
	 */
	public void displayMenu() {

		int menuNum = 0; // 메뉴 선택용 변수

		do {
			System.out.println("\n===학생 관리 프로그램\n");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 학생 정보 전체 조회");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 제거");
			System.out.println("5. 이름으로 검색(일치)");
			System.out.println("6. 이름으로 검색(포함)");
			System.out.println("7. 나이순으로 정렬"); // Comparable 사용
			System.out.println("8. 이름순으로 정렬"); // Comparator 사용
			System.out.println("0. 프로그램 종료");

			System.out.print("\n메뉴 번호 선택 : ");

			try {

				menuNum = sc.nextInt();
				sc.nextLine();

				switch (menuNum) {
				case 1:
					System.out.println(addStudent());
					break;
				case 2:
					selectAll();
					break;
				case 3:
					System.out.println(updateStudent());
					break;
				case 4:
					System.out.println(removeStudent());
					break;
				case 5:
					/* searchName1(); */ break;
				case 6:
					/* searchName2(); */ break;
				case 7:
					/* sortByAge(); */ break;
				case 8:
					/* sortByName(); */ break;
				case 0:
					System.out.println("\n프로그램 종료");
					break;
				default:
					System.err.println("\n메뉴에 작성된 번호만 입력하세요.");
				}

			} catch (InputMismatchException e) {
				System.err.println("\nErr : 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");

				sc.nextLine(); // 입력버퍼에 남아있는 잘못된 코드 제거
				menuNum = -1; // 첫 반복 시 잘못 입력하는 경우,
								// menuNum이 초기값인 0을 가지고 있어 반복문이 종료되는데
								// 이를 방지하기 위해서 임의의 값 -1을 대입
			}
		} while (menuNum != 0);

	}

	/**
	 * 1. 학생 정보 추가 메서드
	 * 
	 * @return 삽입 성공 시 "성공", 실패 시 "실패" 문자열 반환
	 */
	public String addStudent() {
		// Checked Exception : 반드시 throws 구문이나 try-catch 구문을 활용한 예외의 처리가 강제된다.
		// IOException, SQLException, ...

		// Unchecked Exception : 예외 처리가 강제되지 않는 예외 타입
		// 예외가 발생하면 throws를 작성하지 않아도 자동 전파를 통해 상위 호출 메서드로 예외를 위임하게 된다.
		// InputMismatchException, NullPointerException, ...

		do {
			try {
				System.out.println("\n===학생 정보 추가\n");

				System.out.print("이름 : ");
				String name = sc.next();

				System.out.print("나이 : ");
				int age = sc.nextInt();

				sc.nextLine();

				System.out.print("지역 : ");
				String region = sc.nextLine();

				System.out.print("성별 : ");
				char gender = sc.next().charAt(0);

				System.out.print("점수 : ");
				int score = sc.nextInt();

				if (gender != '남' && gender != '여') {
					System.err.println("\nErr : gender 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
					continue;

				} else if (age > 130 || age < 0) {
					System.err.println("\nErr : age 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
					continue;

				} else if (score < 0 || score > 100) {
					System.err.println("\nErr : score 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
					continue;

				} else {
					// Student 새 객체 생성 후 studentList에 추가
					if (studentList.add(new Student(name, age, region, gender, score))) {
						return "성공";
					}
					return "실패";
				}

			} catch (InputMismatchException e) {
				System.err.println("\nErr : 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
				sc.nextLine();
			}
		} while (true);
	}

	/**
	 * 2. 학생 전체 조회 메서드
	 * 
	 * - List가 비어있는 경우 "학생 정보가 없습니다." 출력 - 있는 경우 전체 학생 정보 출력
	 * 
	 */
	public void selectAll() {
		System.out.println("\n===학생 전체 조회\n");

		// studentList가 비어있는 지 확인

		// 1. int List.size();
		// List에 저장된 데이터의 개수를 얻어오는 방법
		// if(studentList.size()==0) {}

		// 2. boolean List.isEmpty();
		// 컬렉션이 비어있다면 true 반환
		if (studentList.isEmpty()) {
			System.out.println("\n학생 정보가 없습니다.");
			return; // 현재 메서드를 종료하고 호출한 곳으로 돌아감
		}

		// 일반 for문
		/*
		 * for (int i = 0; i < studentList.size(); i++) {
		 * System.out.println(studentList.get(i)); }
		 */

		// 향상된 for문(for each 문)
		// - 컬렉션, 배열의 모든 욧를 순차적으로 반복 접근할 수 있는 for문
		int index = 0;
		for (Student std : studentList) {
			System.out.print(index++ + "번 ");
			System.out.println(std);
		}
	}

	/**
	 * 3. 학생 정보 수정 메서드
	 * 
	 * - 학생 정보가 studentList에 하나라도 있는지 검사 - 없다면 "입력된 학생정보가 없습니다" 문자열 반환
	 * 
	 * - 인덱스 번호로 학생을 수정하려고 하는데, 입력된 숫자가 0보다 작은지 검사, - 작다면 "음수는 입력할 수 없습니다" 문자열 반환
	 * 
	 * - studentList 범위 내 인덱스 번호인지 검사, - 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
	 * 
	 * - 수정할 때 index 번째에 저장된 학생 정보 1. 수정 전 정보를 출력
	 * 
	 * 2. 이름, 나이, 지역, 성별, 점수 수정할 값 입력받기
	 * 
	 * 3. 수정이 완료되었다면, "000의 정보가 변경되었습니다." 문자열 반환
	 * 
	 * @return
	 */
	public String updateStudent() {

		System.out.println("\n===학생 정보 수정\n");
		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();

		// 1) 학생 정보가 studentList에 하나라도 있는지 검사
		if (studentList.isEmpty())
			return "입력된 학생정보가 없습니다.";
		// 2) 인덱스 번호가 0보다 작은지 검사
		if (index < 0)
			return "음수는 입력할 수 없습니다.";
		// 3) 인덱스 번호가 리스트 범위 내의 값인지 검사
		if (index >= studentList.size())
			return "범위를 넘어선 값을 입력할 수 없습니다.";

		// 수정코드 작성
		// 1. index번째에 저장된 학생 정보 출력
		System.out.println("\n" + index + "번째에 저장된 학생정보");
		System.out.println(studentList.get(index));

		// 2. 수정할 내용 입력받기(addStudent 메서드 참고)
		do {
			try {
				System.out.println("\n===수정할 학생 정보\n");

				System.out.print("이름 : ");
				String name = sc.next();

				System.out.print("나이 : ");
				int age = sc.nextInt();

				sc.nextLine();

				System.out.print("지역 : ");
				String region = sc.nextLine();

				System.out.print("성별 : ");
				char gender = sc.next().charAt(0);

				System.out.print("점수 : ");
				int score = sc.nextInt();

				if (gender != '남' && gender != '여') {
					System.err.println("\nErr : gender 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
					continue;

				} else if (age > 130 || age < 0) {
					System.err.println("\nErr : age 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
					continue;

				} else if (score < 0 || score > 100) {
					System.err.println("\nErr : score 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
					continue;

				} else {
					// 입력받은 index번째에 수정할 학생정보를 세팅 -> 수정
					// index번째에 있던 기존 학생 정보가 반환되고, 그 객체를 temp에 저장
					Student temp = studentList.set(index, new Student(name, age, region, gender, score));

					return temp.getName() + "의 정보가 입력되었습니다.";
				}

			} catch (InputMismatchException e) {
				System.err.println("\nErr : 입력 형식이 유효하지 않습니다. 다시 시도해주세요.");
				sc.nextLine();
			}
		} while (true);
	}

	/**
	 * 4. 학생 정보 삭제 메서드
	 * 
	 * - 학생 정보가 studentList에 하나라도 있는지 검사 - 없다면 "입력된 학생정보가 없습니다" 문자열 반환
	 * 
	 * - 인덱스 번호로 학생 정보를 삭제하려고 하는데, 입력된 숫자가 0보다 작은지 검사, - 작다면 "음수는 입력할 수 없습니다" 문자열 반환
	 * 
	 * - studentList 범위 내 인덱스 번호인지 검사, - 초과했다면 "범위를 넘어선 값을 입력할 수 없습니다" 문자열 반환
	 * 
	 * - 삭제할 때 index 번째에 저장된 학생 정보 1. 삭제 전 정보를 출력
	 * 
	 * 2. 삭제하기 전 "정말 삭제하시겠습니까?(y/n) : "
	 * 
	 * 3. Y, "000의 정보가 삭제되었습니다." 문자열 반환 4. N, "취소" 문자열 반환
	 */
	public String removeStudent() {

		// Student list.remove(int index);
		// 리스트에서 index번째 요소 제거
		// 이 때, 제거된 요소가 반환됨.
		// + List 중간에 비어있는 인덱스가 없게하기 위해서
		// remove 동작 시, 뒤쪽 요소를 한칸씩 자동으로 당겨온다.

		System.out.println("\n===학생 정보 삭제\n");
		System.out.print("인덱스 번호 : ");
		int index = sc.nextInt();

		if (studentList.isEmpty())
			return "입력된 학생 정보가 없습니다.";
		if (index < 0)
			return "음수는 입력할 수 없습니다.";
		if (index >= studentList.size())
			return "범위를 넘어선 값을 입력할 수 없습니다.";

		System.out.println("\n삭제할 학생 정보");
		System.out.println(studentList.get(index));

		System.out.print("\n정말 삭제하시겠습니까?(Y/N) : ");
		char ch = sc.next().toUpperCase().charAt(0);

		if (ch == 'Y') {
			Student remove = studentList.remove(index);
			return remove.getName() + "의 정보가 삭제되었습니다.";
		} else if (ch == 'N')
			return "취소";
		else
			return "Err : 입력 형식이 유효하지 않습니다. 다시 시도해주세요.";
	}
}
