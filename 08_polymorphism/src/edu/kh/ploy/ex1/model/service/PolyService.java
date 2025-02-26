package edu.kh.ploy.ex1.model.service;

import edu.kh.ploy.ex1.model.dto.Car;
import edu.kh.ploy.ex1.model.dto.Spark;
import edu.kh.ploy.ex1.model.dto.Tesla;

public class PolyService {

	// 다형성 확인 예제
	public void ex1() {

		// Car 객체 생성
		Car car = new Car();
		// 부모타입 참조변수 = 부모객체주소

		// Tesla 객체 생성
		Tesla tesla = new Tesla();
		// 자식타입 참조변수 = 자식객체주소

		// 다형성
		// 부모타입 참조변수 = 자식객체
		Car car2 = new Tesla(); // 오류 발생 안함
		// Tesla 객체를 참조하는 변수의 타입이 Car(부모)이기 때문에
		// Tesla 객체가 Car(부모) 객체로 변화함
		// -> 업 캐스팅

		Car car3 = new Spark();
		// Spark 객체를 참조하는 변수의 타입이 Spark(부모)이기 때문에
		// Spark 객체가 Car(부모) 객체로 변화함
		// -> 업 캐스팅

		// 1) 자식 객체가 부모 객체로 변하였기 때문에
		// 자식만의 고유한 필드, 메서드를 사용할 수 없다.

		// 1-1) car(부모=부모)
		car.setEngine("6-piston");
		car.setFuel("gasolin");
		car.setWheel(4);
		// Car 본인의 메서드 모두 사용 가능

		// 1-2) tesla(자식=자식)
		tesla.setEngine("motor");
		tesla.setFuel("elec");
		tesla.setWheel(4);
		tesla.setBatteryCapacity(8);
		// Tesla 부모, 본인의 메서드 모두 사용 가능

		// 1-3) car2(부모=자식(Tesla))
		car2.setEngine("motor");
		car2.setFuel("elec");
		car2.setWheel(4);
		// car2.setBatteryCapacity(8);
		// The method setBatteryCapacity(int) is undefined for the type Car

		// car3(부모 = 자식(Spark))
		car3.setEngine("4-piston");
		car3.setFuel("gasolin");
		car3.setWheel(4);
		// car3.setDiscountOffer(0.5);
		// The method setDiscountOffer(double) is undefined for the type Car

		// -> car2, car3는 부모타입 참조변수(Car)이기 때문에
		// Tesla, Spark와 같은 자식 객체의 고유 필드, 메서드를 사용할 수 없다.

		// 2) 다형성을 이용한 객체 배열

		// 객체 배열 : 같은 객체 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		// 다형성을 이용한 객체 배열 :
		// 부모 타입 참조 자료형의 변수를 하나의 묶음으로 다루는 것
		Car[] arr = new Car[3];
		// 각 요소 Car 타입 참조변수

		arr[0] = car; // Car 주소
		arr[1] = car2; // Tesla 주소
		arr[2] = car3; // Spark 주소

		for (int i = 0; i < arr.length; i++)
			System.out.println(i + "번째 인덱스의 엔진 : " + arr[i].getEngine());

		// 상속 + 다형성
		// 상속 특징 : Car 상속 클래스는 모두 getEngine()을 가지고 있다.
		// 다형성(업캐스팅) : 부모타입 참조변수 arr[i]로 자식객체를 참조할 수 있다.
	}

	// 전달받은 Car 또는 자식 객체의 엔진, 연료, 바퀴개수를 출력하는 메서드
	public void printCar(Car temp) {
		// Car temp = tesla(Tesla);
		// Car temp = spark(Spark);
		// Car temp = car(Car);
		// 부모타입 참조변수 = 자식타입 객체
		// -> 다형성의 업캐스팅 모양과 똑같다
		// -> temp라는 Car타입 매개변수에는 Car, Tesla, Spark의 주소가 참조되어도 된다.
		System.out.println("엔진 : " + temp.getEngine());
		System.out.println("연료 : " + temp.getFuel());
		System.out.println("바퀴 : " + temp.getWheel() + "개");
		System.out.println();
	}

	// 매개변수로 전달받은 정수 값에 따라 Car, Tesla, Spark 객체를 만들어 반환하는 메서드
	public Car createCar(int num) {

		Car result = null;

		switch (num) {
		case 1:
			result = new Car();
			break;
		case 2:
			result = new Tesla();
			break;
		case 3:
			result = new Spark();
			break;
		default:
			System.out.println("Err");
		}

		return result;
	}

	// 다형성(업캐스팅)을 이용한 매개변수 사용법
	public void ex2() {

		Tesla tesla = new Tesla("전기모터", "전기", 4, 1000000);

		Spark spark = new Spark("4기통", "휘발유", 4, 0.5);

		Car car = new Car("4기통", "경유", 12);

		printCar(tesla);
		printCar(spark);
		printCar(car);

		System.out.println();

		// 다형성을 이용한 반환형 사용법

		// Car[] car = {new Car(), new Tesla(), new Spark()};

		Car[] carArr = { createCar(1), createCar(2), createCar(3) };

		// 객체가 어떤 타입(자료형)인지 검사
		// instanceof 연산자 : 객체의 자료형을 검사하는 연산자
		// -> 참조하는 객체가 특정 자료형이거나 상속관계인지 확인

		System.out.println(carArr[1] instanceof Tesla); // true, 자료형이 Tesla 맞음
		System.out.println(carArr[1] instanceof Spark); // false, 자료형!=Spark, Tesla는 Car와 상속관계(Spark와는 무관)
		System.out.println(carArr[1] instanceof Car); // true, Tesla는 Car와 상속관계
		System.out.println(carArr[0] instanceof Tesla); // false, Car는 Tesla의 부모
	}

	// 다형성(다운캐스팅) 확인 예제
	public void ex3() {

		// 다운 캐스팅
		// 부모 타입 참조변수가 자식 객체를 참조하는 것 : 업캐스팅
		// 업캐스팅이 적용된 상태에서만 진행 가능
		// 부모타입을 자식타입으로 강제 형변환
		// 자식 객체의 본래 필드, 메서드를 사용 가능하게 한다.

		Car c1 = new Tesla("전기모터", "전기", 4, 50000);
		// 업캐스팅된 상태(Tesla 자식 -> Car 부모)

		System.out.println(((Tesla) c1).getBatteryCapacity());
		// 주의사항
		// "."연산자 (Tesla) 형변환하는 연산자보다 우선순위 높음
		// 형변환하는 부분을 ()로 묶어주고 나서 . 연산을 진행해야
		// Tesla 객체의 메서드를 사용할 수 있음

		Tesla t1 = (Tesla) c1;
		System.out.println(t1.getBatteryCapacity());
	}

	// 다운 캐스팅 주의사항
	public void ex4() {

		Car c1 = new Tesla();
		// Tesla 객체를 만들어서 Car 타입 참조변수 c1에 담음

		// Spark s1 = (Spark)c1; // c1을 관계없는 Spark로 다운 캐스팅 하려고 시도함
		// 다운 캐스팅을 잘못 작성해도 컴파일 에러가 발생하지 않음
		// -> 실행 시 런타임 에러 발생
		// ClassCastException : 형변환 예외

		// 해결방법 : instanceof 와 같이 사용하면 된다.

		// 예외처리
		if (c1 instanceof Spark) { // c1이 Spark이거나 상속관계인가?

			Spark s1 = (Spark) c1; // 다운 캐스팅
			System.out.println("다운 캐스팅 성공");

		} else { // 아니라면
			System.out.println("다운 캐스팅 실패 : Spark 타입||상속관계 아님");
		}
	}

	// 바인딩 확인 예제
	public void ex5() {
		// 바인딩(Binding)
		// 실제 실행할 메서드 코드와 호출하는 코드를 연결시키는 것

		Car c1 = new Car("4기통", "경유", 8);

		System.out.println(c1.toString());
		// edu.kh.poly.ex1.model.dto.Car.toString()
		// Car 객체에 있는 toString() 메서드 호출
		// 프로그램 "실행 전"
		// 컴파일러는 toString() 메서드가 Car에 있는 것으로 인식해서
		// c1.toString() 호출코드와
		// edu.kh.poly.ex1.model.dto.Car.toString() 메서드 코드를 연결
		// -> 정적 바인딩

		// **다형성 적용시 바인딩**
		Car c2 = new Spark("경차엔진", "휘발유", 4, 0.5);
		// 업캐스팅 적용 -> 부모 부분만 참조 가능 상태

		System.out.println(c2.toString());
		// edu.kh.poly.ex1.model.dto.Car.toString()
		// 참조변수 c2가 Car 타입이므로
		// toString() 호출코드와 Car의 toString() 메서드 코드를 연결
		// -> 정적 바인딩

		// 실행해보면 자식(Spark)의 toString()이 호출되는 것을 확인
		// 경차엔진 / 휘발유 / 4 / 0.5
		// -> 컴파일 시에는 부모(Car)와 바인딩 == 정적 바인딩
		// -> "실행 시"에는 정적 바인딩보다 자식(Spark)에서 오버라이딩 됨
		// toString() 메서드가 우선시되어 Spark의 메서드의 바인딩
		// == 동적 바인딩
	}
}
