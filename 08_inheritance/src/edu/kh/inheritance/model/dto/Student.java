package edu.kh.inheritance.model.dto;

/*
 * 
 * Object
 *    ㄴ Person
 *  	    ㄴ Student
 * 
 * */

// 상속 방법 : 자식 extends 부모
public class Student extends Person{
	// Student 클래스에 Person 클래스 내용을 확장한다.==연장한다.
	// == Student 클래스에 Person 클래스의 필드 매소드를 추가하여 확장한다.
	
	// 속성(필드)
	/*
	private String name;
	private int age;
	private String nationality;
	*/
	private int grade;
	private int classRoom;
	
	// 기능
	
	// 생성자
	public Student() {}
	
	public Student(int grade, int classRoom) {
		super(); // 부모 클래스_Person의 기본 생성자
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	public Student(String name, int age, String nationality) {}
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
		
		/*
		this.name=name;
		this.age=age;
		this.nationality=nationality;
		*/
		// this 참조변수는 본인 자신만을 의미
		// 상속을 받았어도 name, age, nationality는 부모의 고유 필드이기 때문에 자식인 Student에서 this 참조변수를 이용해 직접 접근 불가
		/*
		setName(name);
		setAge(age);
		setNationality(nationality);
		*/
		// 부모의 setter를 이용하여 간접 접근을 할 수 있음
		// 단, 비효율적인 관계로 super 생성자 이용
		
		super(name, age, nationality); // 부모 클래스_Person의 매개변수 생성자
		this.grade = grade;
		this.classRoom = classRoom;
	}
	
	// setter/getter
	/*
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public String getNationality() {return nationality;}
	public void setNationality(String nationality) {this.nationality = nationality;}
	 */

	public int getGrade() {return grade;}
	public void setGrade(int grade) {this.grade = grade;}
	
	public int getClassRoom() {return classRoom;}
	public void setClassRoom(int classRoom) {this.classRoom = classRoom;}

@Override
	public String toString() {
		return super.toString()+" / grage : "+grade+" / classRoom : "+classRoom;
	}	
	
}
