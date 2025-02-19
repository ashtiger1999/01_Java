package edu.kh.oop.abstraction.model.vo;

// model - 프로그램 로직과 관련되어있는 데이터를 저장하는 용도 + 비지니스 로직
// VO (Value Object) : 값 저장용 객체를 만들기 위한 클래스를 모아두는 패키지

public class People { // 국민 (사람) 클래스
	
	// 클래스란? 객체의 특성(속성과 기능)을 정의한 것
	// == 객체를 만들기 위한 설계도
	
	// 속성 == 값 == data
	// 값을 저장하기 위한 변수 선언
	// -> 국민이라면 공통적으로 가지고 있는 속성만 작성(추상화)
	// 이름, 성별, 주민번호, 주소, 전화번호, 나이
	// 필드 == 필드변수 == 멤버변수
	
	// 캡슐화
	// - 데이터(속성)와 기능을 하나로 묶어서 관리하는 기법
	// - 데이터의 직접적인 접근을 제한하는 것이 원칙이다.
	// -> 직접접근 못하기 때문에
	//	  클래스 내부에 간접 접근 방법을 제공하는
	//	  기능(메서드)을 작성해둔다.
	// getter()/setter();
	
	/*
	 * 데이터 직접 접근 제한
	 * 
	 * public (공공의) -> private (사적인, 개인적인) 변경
	 * 
	 * */
	
	// [접근 제한자] 자료형 변수명;
	private String name;
	private char gender;
	private String pNo;
	private String address;
	private String phone;
	private int age;
	// public double bitCoin; // 범 국민적 공통점이 아니므로 제거
	
	// 기능 == 행동/동작 == method(메서드)
	public void tax() {
		System.out.println("세금을 냅니다.");
	}
	
	public void vote() {
		System.out.println("투표를 합니다.");
	}
	
	
	// 캡슐화에서 사용할 간접 접근 기능 (getter/setter)
	// [접근 제한자] 반환령 메서드명() {}
	
	// name 변수의 값을 호출한 쪽으로
	// 돌려보내주는 간접 접근 기능 중 getter
	
	// setter()
	public String getName() {
		return name;
		// return; : 현재 메서드를 종료하고 호출한 쪽으로 되돌아감
		// return 값/변수; : 현재 메서드를 종료하고
		//					 값/변수를 가지고 호출한 쪽으로 되돌아감
	}
	
	// getter() : 반환형이 무조건 있음
	//            getter는 필드에 작성된 변수값을 호출한 쪽으로 되돌려주는 것
	//            변수는 자료형이 있을 것
	//            그 변수를 되돌려준다면 당연히 반환형도 존재할 것
	
	// name 변수에 값을 세팅하는 간접 접근 기능 중 setter
					// 매개변수
	public void setName(String name) {
		this.name = name;
	}
	
	public char getGender() {return gender;}
	public void setGender(char gender) {this.gender=gender;}
	
	public String getpNo() {return pNo;}
	public void setpNo(String pNo) {this.pNo=pNo;}
	
	public String getAddress() {return address;}
	public void setAddress(String address) {this.address=address;}
	
	public String getPhone() {return phone;}
	public void setPhone(String phone) {this.phone=phone;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age=age;}
	
	// 자동완성 : alt + shift + s/generate getters and setters
	
	private String myName;
	private char myGender;
	private String mypNo;
	private String myAddress;
	private String myPhone;
	private int myAge;

	public String getMyName() {
		return myName;
	}

	public void setMyName(String myName) {
		this.myName = myName;
	}

	public char getMyGender() {
		return myGender;
	}

	public void setMyGender(char myGender) {
		this.myGender = myGender;
	}

	public String getMypNo() {
		return mypNo;
	}

	public void setMypNo(String mypNo) {
		this.mypNo = mypNo;
	}

	public String getMyAddress() {
		return myAddress;
	}

	public void setMyAddress(String myAddress) {
		this.myAddress = myAddress;
	}

	public String getMyPhone() {
		return myPhone;
	}

	public void setMyPhone(String myPhone) {
		this.myPhone = myPhone;
	}

	public int getMyAge() {
		return myAge;
	}

	public void setMyAge(int myAge) {
		// 메서드(기능) 형태인 getter/setter를 이용하면 본인이 원하는 기능을 추가할 수 있음
		// age가 0보다 크지 않을 때, 예외 발생 시키기
		// age가 0보다 클 때, 속성값에 전달받은 값 세팅하기
		if(myAge>0) {
			this.myAge = myAge;
		} 
		else {
			throw new IllegalArgumentException("0 이하 입니다.");
			// IllegalArgumentException
			// 메서드에 전달된 인자가(매개변수)유효하지 않을 때 발생하는 예외
		}
	}
	
	
	

}
