package edu.kh.oop.method.model.service;

import java.util.Scanner;

import edu.kh.oop.method.model.vo.Member;

// CRUD
// Create -> 회원가입
// Read -> 정보 조회
// Update -> 정보 수정
// Delete -> 정보 제거

public class MemberService {
	
	// 속성(필드)
	private Scanner sc = new Scanner(System.in);
	
	private Member memberInfo = null; // 가입한 회원의 정보를 저장할 변수 (전역 변수)
	private Member loginMember = null; // 로그인한 회원의 정보를 저장할 변수
	
	// 기능(생성자, 메서드)
	
	// 메뉴 화면 출력 기능
	public void displayMenu() {
		int menuNum = 0; // 메뉴 선택용 변수
		
		// 무조건 한번은 수행
		do {
			System.out.println("====회원 정보 관리 프로그램====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine();
			
			switch(menuNum) {
			// 내가 호출한 메서드가 어떤 값을 가지고 return하는지 고려하기
			case 1: System.out.println(signUp()); break;
			case 2: System.out.println(login()); break;
			case 3: System.out.println(selectMember()); break;
			case 4: 
				int result = updateMember();
				switch(result) {
				case -1: System.out.println("\n로그인 후 이용바람"); break;
				case 0: System.out.println("\n회원정보 수정실패 (비밀번호 불일치)"); break;
				case 1: System.out.println("\n회원정보가 수정되었습니다."); break;
				}
				break; 
			case 0: System.out.println("\n프로그램 종료.."); break; // 프로그램 종료
			default:System.out.println("\n잘못 입력 하셨습니다. 메뉴에 있는 번호만 입력해주세요.\n");
			}
			
		} while(menuNum!=0); // menuNum==0, 반복 종료
		
	}
	
	// *회원 가입 기능*
	public String signUp() { // 메서드 정의
		System.out.println("\n******회원 가입******");
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		System.out.print("비밀번호 확인 : ");
		String memberPw2 = sc.next();
		System.out.print("이름 : ");
		String memberName = sc.next();
		System.out.print("나이 : ");
		int memberAge = sc.nextInt();	
		
		// 비밀번호, 비밀번호 확인이 일치하면 회원가입
		// 일치하지 않으면 회원가입 실패
		
		if(memberPw.equals(memberPw2)) { // 일치하는 경우
			
			// 회원 가입
			// 새로운 회원 객체가 생성
			// -> Member 클래스 이용해서 새로운 객체 생성
			// -> 매개변수 생성자 이용
			
			memberInfo = new Member(memberId, memberPw, memberName, memberAge);
			                        // 지역변수	
			return "\n회원 가입 성공\n"; 

		}else { // 일치하지 않는 경우
			return "\n회원 가입 실패!! (비밀번호 불일치)\n";
		}
	}

	// *로그인 기능*
	// 회원가입이 되어있는 사람이 있는지 없는지
	// 내가 입력한 아이디와 비밀번호로 가입한 사람의 정보가 있는지 확인!
	public String login() {
		System.out.println("\n******회원 로그인******");
		
		// 회원가입을 했는지부터 확인
		// == memberInfo가 객체를 참조하고 있는지 확인
		// == null인지 아닌지 확인
		
		if(memberInfo==null) { // 회원가입을 안한 경우
			// null : 아무것도 참조하고 있지 않음
			return "\n회원 가입을 진행해 주세요.";
			// return 값;
			// 현재 메서드를 종료하고, 값을 가지고 해당 메서드를 호출한쪽으로 되돌아감
			// early return 기법 : 특정 조건을 만족한 경우, 더 이상 코드를 진행시키지 않고 리턴시키는 방법
		}
		// 회원 가입을 했다면, 해당 라인으로 도달할 수 있음

		// 로그인 기능 수행
		System.out.print("아이디 : ");
		String memberId = sc.next();
		System.out.print("비밀번호 : ");
		String memberPw = sc.next();
		
		// 회원가입 정보(memberInfo가 참조하는 Member 객체)에
		// 저장된 아이디, 비밀번호가
		// 입력한 아이디, 비밀번호와 같으면 "로그인 성공"
		// 같지 않으면 "아이디 또는 비밀번호 불일치" 리턴
		
		// 아이디, 비밀번호가 모두 일치할 경우
		if(memberId.equals(memberInfo.getMemberId())&&memberPw.equals(memberInfo.getMemberPw())) {
			
			// 로그인한 사람의 정보를 기억시키기
			// loginMember에 현재 로그인한 사람의 정보를 기억시키기
			// == loginMember에 memberInfo가 참조하고 있는 객체의 주소 대입
			
			loginMember = memberInfo;
			// 얕은 복사
			
			// int[] arr = {1,2,3};
			// int[] newArr = arr; // 주소값만 복사, 배열도 객체
			
			// 회원가입 정보를 loginMember에 대입하여
			// 어떤 회원이 로그인 했는지를 구분할 수 있게함
			
			return "\n" + loginMember.getMemberName() + "님 환영합니다.\n";
		}
		else { // 아이디, 비밀번호 중 하나라도 일치하지 않을 경우
			return "\n아이디 또는 비밀번호가 일치하지 않습니다.\n";
		}
		
	}

	// *회원 정보 조회 기능*
	// -> 조회하려면?
	// => 로그인여부 확인
	
	// -> 로그인을 했다면?
	// => 현재 로그인한 사람의 정보를 저장하고 있는 객체에서 정보 얻어오기 ( 이름, 아이디, 나이)
	// -> 로그인을 안했다면?
	// => "로그인 후 이용해주세요" 출력
	public String selectMember() {
		System.out.println("\n******회원 정보 조회******");
		
		if(loginMember==null) {
			return "\n로그인 후 이용해주세요.\n";
		}
		
		String str =  "이름 : "+loginMember.getMemberName();
		str +=  "\n 아이디 : "+loginMember.getMemberId();
		str +=  "\n 나이 : "+loginMember.getMemberAge() + "\n";
		
		return str;
	}
	
	// *회원 정보 수정 기능*
	// 로그인 여부
	// 수정할 이름
	// 수정할 나이
	// 비밀번호 입력
	// 비밀번호 일치여부
	// 정보 수정
	public int updateMember() {
		
		System.out.println("\n******회원 정보 수정******");
		
		// 1) 로그인 여부 판별
		// 로그인이 되어있지 않으면 -1 반환
		
		// 2) 로그인이 되어있을 때
		// 2-1) 수정할 회원 정보 입력 받기(이름, 나이)
		// 2-2) 비밀번호를 입력받아서 현재 로그인한 회원의 비밀번호와
		//      일치하는지 확인
		//      2-2.1) 비밀번호가 일치하는 경우
		//             -> 로그인한 회원의 이름과 나이 정보를 입력받은 값으로 변경 후 1 반환
		//      2-2.2) 비밀번호가 일치하지 않는 경우
		//             -> 0 반환
		
		if(loginMember == null) {
			return 0;
		}
		
		System.out.print("수정할 이름 : ");
		String inputName = sc.next();
		System.out.print("수정할 나이 : ");
		int inputAge = sc.nextInt();
		System.out.print("비밀번호 : ");
		String inputPw = sc.next();
		
		if(inputPw.equals(loginMember.getMemberPw())) {
			memberInfo.setMemberName(inputName);
			memberInfo.setMemberAge(inputAge);
//			loginMember=memberInfo;
			return 1;
		}
		
		return 0;
	}
	
	

}
