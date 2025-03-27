package edu.kh.io.pack2.run;

import edu.kh.io.pack2.model.service.ByteService;

public class ByteRun {

	public static void main(String[] args) {
		
		/*
		// 불변성 (Immutable)의 String
		String str1 = "hello";
		String str2 = "hello";
		// 리터럴 문자열로 표기한 hello는 hashCode 값이 같다.
		System.out.println(str1.hashCode()); // 99162322
		System.out.println(str2.hashCode()); // 99162322
		
		str2 = str2 + "world"; 
		System.out.println(str2.hashCode()); // 1524582912
		// 다른 객체가 생성됨
		
		// 가변성(Mutable)의 StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.hashCode()); // 1706377736
		sb.append("hello world"); // hello world
		sb.append("12345"); // hello world12345
		System.out.println(sb.hashCode()); // 1706377736
		// 객체는 유지되고 값만 변함
		*/
		
		ByteService service = new ByteService();
		// service.fileByteOutput();
		// service.bufferFileByteOutput();
		// service.bufferedFileByteInput();
		// service.readProperties();
		// service.fileCopy();
		service.output1();
		
	}

}
