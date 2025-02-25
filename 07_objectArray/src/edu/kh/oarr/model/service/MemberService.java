package edu.kh.oarr.model.service;

import java.util.Scanner;

import edu.kh.oarr.model.vo.Member;

public class MemberService {

	// 속성
	private Scanner sc = new Scanner(System.in);

	// 회원가입한 사라므이 정보를 저장할 참조변수
	// Member 5칸짜리 객체배열 선언 및 할당
	private Member[] memberArr = new Member[5];

	// 현재 로그인한 회원의 정보를 저정할 참조변수
	private Member loginMember = null;

	// 기능
	public MemberService() { // 기본 생성자

		// memberArr 배열 0, 1, 2 인덱스 초기화
		memberArr[0] = new Member("user00", "pass00", "홍길동", 30, "서울");
		memberArr[1] = new Member("user01", "pass01", "김삿갓", 40, "경기");
		memberArr[2] = new Member("user02", "pass02", "곽두팔", 30, "부산");
	}

	// 메뉴 출력용 메서드
	public void displayMenu() {

		int menuNum = 0;

		// 무조건 한번은 반복
		do {

			System.out.println("\n// 회원정보 관리 프로그램 v2");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 회원 정보 조회");
			System.out.println("4. 회원 정보 수정");
			System.out.println("5. 회원 지역 검색");
			System.out.println("6. 로그아웃");
			System.out.println("0. 프로그램 종료");

			System.out.print("// 메뉴 입력 : ");
			menuNum = sc.nextInt();
			sc.nextLine(); // 입력 버퍼에 남은 개행문자(enter) 제거

			switch (menuNum) {
			case 1:	System.out.println(signUp()); break;
			case 2:	System.out.println(login()); break;
			case 3:	System.out.println(selectMember());break;
			case 4:	switch(updateMember()){
				case -1: System.out.println(" // 로그인 후 입력바람");break;
				case 0: System.out.println(" // 비밀번호가 틀렸습니다.");break;
				case 1: System.out.println(" // 변경이 완료되었습니다.");break;
				} break;
			case 5: searchRegion();	break;
			case 6: logout();	break;
			case 0:	System.out.println(" // 프로그램 종료"); break;
			default: System.err.println(" // 잘못입력하셨습니다.");
			}

		} while (menuNum != 0);

	}

	// memberArr 배열의 비어있는 인덱스를 얻어오는 보조 메서드
	// 단, 배열이 비어있지 않다면 -1 반환
	public int emptyIndex() {

		// memberArr의 배열을 인덱스 0번부터 끝 인덱스까지 접근하여
		// 참조 값이 null인 경우의 인덱스를 반환
		for (int i = 0; i < memberArr.length; i++) {
			if (memberArr[i] == null) {
				return i;
				// 현재 메서드 종료하고 호출한 쪽으로 i값을 가지고 되돌아감
			}
		}
		return -1;
	}

	// 회원 가입 메서드
	public String signUp() {

		System.out.println("\n// 회원 가입");

		// memberArr 배열에 빈자리가 있는지 확인
		// -> 객체배열 memberArr에 새로 가입할 회원 정보를 저장할 예정
		// -> 빈 공간의 인덱스 번호를 얻어오기
		int index = emptyIndex();
		// memberArr 배열에서 비어있는 인덱스를 반환받음/없다면 -1

		if (index == -1) { // 비어있는 공간이 없음 -> 회원가입 불가
			return " // 회원가입이 불가능 합니다.";
		}

		// 회원 가입 가능일때
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

		System.out.print("지역 : ");
		String region = sc.next();

		for (int i = 0; i < memberArr.length; i++) { // 중복 아이디 체크
			if (memberArr[i] != null) {
				if (memberArr[i].getMemberId().equals(memberId))
					return " // 회원가입 실패 : 중복된 아이디입니다.";
			}
		}

		// 비밀번호와 비밀번호 확인이 일치하는 경우에만 회원가입 진행
		if (memberPw.equals(memberPw2)) { // 비밀번호 일치
			// 새로운 Member 객체 생성해서 할당된 주소를 memberArr의 비어있는 인덱스에 대입
			memberArr[index] = new Member(memberId, memberPw, memberName, memberAge, region);
			return " // 회원가입 성공";
		}
		// 비밀번호 불일치
		return " // 회원가입 실패 : 비밀번호 불일치";
	}

	// 로그인 메서드
	public String login() {

		System.out.println("\n// 로그인");

		if (memberArr == null)
			return " // 등록된 아이디가 없습니다.";

		if (loginMember != null)
			return " // 먼저 로그아웃하세요";

		// 1) 아이디, 비밀번호 입력받기
		System.out.print("아이디 : ");
		String inputId = sc.next();

		System.out.print("비밀번호 : ");
		String inputPw = sc.next();

		// 2) memberArr 배열 내 요소를 순서대로 접근하여
		for (int i = 0; i < memberArr.length; i++) {
			// 2-1) 현재 접근한 요소의 null 여부 확인
			if (memberArr[i] != null) { // 값이 null인 배열객체에 접근하여 getter를 수행하고자 할때, Err:null point exception이 발생한다.
				// 2-2) 회원정보가 있을 경우 가입된 회원 정보의 아이디, 비밀번호와 로그인을 시도하는 정보의 일치 여부 확인
				// 2-2.1) 일치한다면 로그인 회원 정보 객체를 참조할 변수 loginMember에 현재 접근중인 memberArr[i] 요소에 저장된
				// 주소를 얕은 복사
				if (inputId.equals(memberArr[i].getMemberId()) && inputPw.equals(memberArr[i].getMemberPw())) {
					loginMember = memberArr[i];
					// 2-3) 로그인 성공시 홍길동님 환영합니다.
					return " // 로그인 성공! " + loginMember.getMemberName() + "님, 환영합니다.";
				}
			}
		}
		// 2-3.1) 로그인 실패시 아이디 또는 비밀번호가 일치하지 않습니다.
		return " // 아이디 또는 비밀번호가 일치하지 않습니다";
	}
	
	// 회원 정보 조회
	public String selectMember() {
		System.out.println("\n// 회원 정보 조회");
		if(loginMember==null) return " // 로그인 후 이용 바람";
		
		String str = "\n이름 : " + loginMember.getMemberName();
		str+= "\n아이디 : " + loginMember.getMemberId();
		str+= "\n나이 : " + loginMember.getMemberAge();
		str+= "\n지역 : " + loginMember.getRegion();
		
		return str;
	}

	// 회원 정보 수정
	public int updateMember() {
		
		System.out.println("\n// 회원정보 수정");
		
		if(loginMember==null) return -1;
		
		System.out.print("수정할 이름 입력 : ");
		String inputName = sc.next();
		
		System.out.print("수정할 나이 입력 : ");
		int inputAge = sc.nextInt();
		
		System.out.print("수정할 지역 입력 : ");
		String inputRegion = sc.next();
		
		System.out.print("비밀번호 입력 : ");
		String inputPw = sc.next();
		
		if(!inputPw.equals(loginMember.getMemberPw())) return 0;
		
		loginMember.setMemberName(inputName);
		loginMember.setMemberAge(inputAge);		
		loginMember.setRegion(inputRegion);

		return 1;
		
	}
	
	// 회원 검색(지역) 메서드
	public void searchRegion() {
		
		System.out.println("\n// 회원 검색(지역)");
		System.out.print("검색할 지역을 입력하세요 : ");
		String inputRegion = sc.next();
		
		// 1) memberArr 배열의 모든 요소 순차 접근
		boolean flag = true;
		
		for(int i=0; i<memberArr.length; i++) {
			// 2) memberArr[i] 요소가 null인 경우 반복 종료
			if(memberArr[i]==null) break;
			
			// 3) memberArr[i] 요소가 null이 아니라면
			// -> 해당 요소에 저장된 지역이 입력받은 지역과 같을 경우
			if(inputRegion.equals(memberArr[i].getRegion())) {
				// memberArr[i] 요소에 저장된 객체의 회원 아이디, 이름을 출력
				System.out.printf(" // 아이디 : %s, 이름 : %s\n",memberArr[i].getMemberId(),memberArr[i].getMemberName());
				flag=false;
			}
		}
		// 4) 입력한 지역과 일치하는 회원이 없다면 일치하는 검색 결과가 없습니다 출력
		if(flag) System.out.println("일치하는 검색 결과가 없습니다.");		
	}
	
	// 로그아웃
	public void logout() {
		
		if(loginMember==null) System.out.println("\n // 로그인중인 계정이 없습니다.");
		
		loginMember=null;
		
		System.out.println("\n // 로그아웃 되셨습니다.");
		
	}
	
	
}
