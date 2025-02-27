package edu.kh.exception.model.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionService {

	// 에외(Exception) : 개발자의 소스 코드 수정으로 해결 가능한 오류

	// 예외의 두 종류
	// 1. Unchecked Exception : 선택적으로 예외 처리(ex. Runtime Exception, ...)
	// 2. Checked Exception : 필수적으로 예외 처리(ex. IOException, ...)

	Scanner sc = new Scanner(System.in);

	public void ex1() {
		// 두 정수를 입력받아 나누기한 몫을 출력

		System.out.print("정수 1 입력 : ");
		int input1 = sc.nextInt();
		// InputMismatchException
		// int 형이 아닌 다른 자료형을 대입했을 때

		System.out.print("정수 2 입력 : ");
		int input2 = sc.nextInt();
		// InputMismatchException
		// int 형이 아닌 다른 자료형을 대입했을 때

		if (input2 != 0) {

			System.out.println("결과 : " + input1 / input2);
			// ArithmeticException: / by zero
			// 산술적 예외 발생 : input2에 0이 들어왔을 때 input1을 0으로 나눌 수 없다.

		} else {
			System.out.println("infinity");
		}

		// -------------------------------------------------------------

		try {

			// 예외가 발생할 것 같은 코드
			System.out.println("결과 : " + input1 / input2);

		} catch (ArithmeticException e) {
			// try에서 던져진(throw) 예외를 catch문의 매개변수 e로 잡았다.
			// e를 사용하여 예외 추적 코드를 작성할 수도 있음
			System.out.println("infinity");

			e.printStackTrace();
			// 예외가 발생한 메서드, 위치, 발생한 예외 상황을 에러 메세지로 출력한다.
			// 예외 발생 지점 추적 메서드
		}

		// 발생하는 예외 중 '일부 예외 상황'은 try-catch 문을 사용하지 않아도
		// if-else 문으로 예외 상황을 방지할 수 있다.
		// '일부 예외 상황' == (대부분) Unchecked Exception
	}

	public void ex2() {
		// 여러가지 예외에 대한 처리 방법

		try {

			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();
			// InputMismatchException
			// int 형이 아닌 다른 자료형을 대입했을 때

			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			// InputMismatchException
			// int 형이 아닌 다른 자료형을 대입했을 때

			System.out.println("결과 : " + input1 / input2);
			// ArithmeticException: / by zero
			// 산술적 예외 발생 : input2에 0이 들어왔을 때 input1을 0으로 나눌 수 없다.

			String str = null;
			System.out.println(str.charAt(0));
			// NullPointerException: Cannot invoke "String.charAt(int)" because "str" is
			// null

			// InputMismatchException, ArithmeticException 둘 다 RuntimeException 후손
			// RuntimeException은 Exception 후손
			// Exception
			// ㄴ RuntimeException
			// ㄴ InputMismatchExceptionm, ArithmeticException
			/*
			 * } catch(RuntimeException e) { // Unreachable catch block for
			 * InputMismatchException. It is already handled by the catch block for
			 * RuntimeException // 부모 클래스의 예외 처리가 자식 클래스의 예외 처리보다 먼저 시행될 경우 오류 발생
			 */
		} catch (InputMismatchException e) {
			System.out.println("타입에 맞는 값만 입력하세요");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		} catch (RuntimeException e) {
			System.out.println("런타임 예외 상황 발생");
			e.printStackTrace();
		} catch (Exception e) {
			// Exception 클래스 : 모든 예외의 최상위 부모, 모든 예외 상황 catch 가능
			// 다형성 - 업 캐스팅 : 부모타입 참조변수로 자식객체 참조
			// ex) Exception e = new RuntimeException();

			// ** 상위 타입의 예외 클래스를 catch문에 작성하면 다형성 업캐스팅에 의해 모두 잡아서 처리 가능 **
			System.out.println("최고 조상 예외 처리 기능인 Exception의 처리 상황 발생");
			e.printStackTrace();
			// 발생한 예외에 대한 메서드와 위치에 대한 모든 내용 출력
		}
	}

	public void ex3() {
		// try - catch - finally
		// finally : try 구문에서 예외 발생 여부에 관계 없이 마지막에 무조건적으로 시행
		try {

			System.out.print("정수 1 입력 : ");
			int input1 = sc.nextInt();
			// InputMismatchException
			// int 형이 아닌 다른 자료형을 대입했을 때

			System.out.print("정수 2 입력 : ");
			int input2 = sc.nextInt();
			// InputMismatchException
			// int 형이 아닌 다른 자료형을 대입했을 때

			System.out.println("결과 : " + input1 / input2);
			// ArithmeticException: / by zero
			// 산술적 예외 발생 : input2에 0이 들어왔을 때 input1을 0으로 나눌 수 없다.

		} catch (ArithmeticException e) {
			System.out.println("산술적 예외 처리가 됨");

			// 매개변수 e : 예외에 관련된 정보와 기능
			System.out.println(e.getClass()); // 예외 상황의 타입
			// class java.lang.ArithmeticException

			System.out.println(e.getMessage()); // 예외 상황의 원인 : 예외 발생 시 출력된 내용
			// / by zero

			System.out.println(e); // e.toString();
			// java.lang.ArithmeticException: / by zero

			e.printStackTrace(); // 예외 상황 타입/원인/위치

		} catch (InputMismatchException e) {
			System.out.println("정수만 넣어라");

		} finally {

			System.out.println("예외 상황 발생 여부에 상관없이 무조건 수행되는 finally 구문");
			sc.close(); // 스캐너 종료(통로 닫기) : 메모리 누수방지

		}
	}

	public void ex4() {

		try {
			methodA();

		} catch (IOException e) {
			System.out.println("methodC에서부터 발생한 예외를 ex4에서 잡아서 처리함");
			e.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

	public void methodA() throws Exception {
		methodB();
	}

	public void methodB() throws IOException {
		// 부모 객체로 자식 객체인 오류를 잡아서 위임(던짐)할 수 있다.
		// Exception
		// 		ㄴ IOException
		// 				ㄴ FileNotFoundException
		methodC();
	}

	public void methodC() throws FileNotFoundException {
		// throws : 호출한 메서드에게 예외를 던짐
		// -> 호출한 메서드에게 예외처리를 하라고 위임하는 행위

		// throw : 예외 강제 발생 구문
		throw new FileNotFoundException();
		// Unhandled exception type IOException
		// 반드시 예외 처리가 필요한 Checked Exception
	}

	public void ex5() throws UserException {
		// 사용자 정의 예외 클래스인 UserException 사용하여 강제 예외 발생시키기
		throw new UserException("사용자 정의 예외 발생");
		// Unhandled exception type UserException
		// UserException extends Exception : 
		// UserException은 Exception에게 상속 받는 자식 클래스이고,
		// Exception은 Checked Exception이므로 예외 처리가 필수로 요구되어 오류가 발생
	}
}
