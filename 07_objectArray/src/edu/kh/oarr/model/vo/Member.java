package edu.kh.oarr.model.vo;

public class Member {
	
	// 속성(필드==멤버변수)	
	private String memberId;
	private String memberPw;
	private String memberName;
	private int memberAge;
	private String region;
	
	// 기능(생성자, 메서드)
	// 생성자
	// 기본 생성자, 매개변수 생성자
	// 생성자 작성 규칙
	// 1. 생성자 이름은 클래스명과 같다
	// 2. 반환형이 없다.
	// ** 기본 생성자는 컴파일러가 자동으로 생성해준다 **
	// 생성자가 하나라도 있으면, 기본 생성자는 자동으로 생성되지 않는다.
	// -> 매개변수 생성자가 있다면 기본 생성자를 직접 만들어야한다.
	
	// 기본 생성자 만들기
	public Member() {}

	// 매개변수 생성자 : 모든 필드 초기화
	// 오버로딩 : 같은 클래스 내, 동일한 생성자 명/메서드 명 등을 이용할 수 있는 기법
	// 오버로딩 성립 조건 : 매개변수의 개수, 순서, 타입(자료형) 중 하나라도 달라야 한다.
	// + 생성자명/메서드명은 같아야한다
	public Member(String memberId, String memberPw, String memberName, int memberAge, String region) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.region = region;
	}

	// 메서드
	// getter/setter
	// 필드에 선언된 멤버변수들이 캡슐화 원칙에 의해 private로 선언되어 다른 클래스에서 직접 접근을 할 수 없음
	// 간접 접근 방식으로 값을 세팅/얻어올 수 있도록 메서드를 만들어 제공함
	// getter/setter의 접근 제한자는 public이어야 한다.
	public String getMemberId() {
		// 반환형(String) : 메서드가 호출된 자리에 반환형의 반환값(문자열)을 가지고 돌아간다.
		return memberId;
		// return : 해당 메서드를 종료하고 반환값을 가지고 호출한 곳으로 돌아간다.
	}

	public void setMemberId(String memberId) {
		// 반환형 void : 반환값이 없다.(return X)
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberAge() {
		return memberAge;
	}

	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	
}
