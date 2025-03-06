package edu.kh.io.pack4.model.service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharacterService {
	
	/*
	 * 문자 기반 스트림
	 * 
	 * - 2 byte 문자 단위로 입출력하는 스트림
	 * 
	 * - Reader(입력) Writer(출력) 최상위 클래스
	 * 
	 * - 문자만 작성된 파일, 채팅, 인터넷 요청 등의 데이터 전달
	 * 
	 * */
	
	/**
	 * 문자 기반 파일 입력(파일 읽어오기)
	 * + 보조 스트림 Buffered 사용
	 */
	public void fileInput() {
		
		// 스트림 참조 변수 선언
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader("/io_test/20250305/노래가사.txt");
			br = new BufferedReader(fr);
			
			String line = null; // 한 줄을 읽어와 저장할 변수
			
			while(true) {
				
				// BufferedReader.readLine() : 
				// 한 줄씩 문자열을 읽는 역할(줄단위)
				// -> 개행문자가 나올때까지의 문자열을 읽음
				line = br.readLine();
				
				if(line==null) break;
				
				System.out.println(line);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br!=null) {
					br.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	/**
	 * 문자 기반 파일 출력(파일 내보내기)
	 * + 보조 스트림 Buffered 사용
	 */
	public void fileOutput() {
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("오늘은 3월 6일 목요일입니다.\n");
			sb.append("내일이면 시험이 있습니다.\n");
			sb.append("부디 잘 통과하길 바랍니다.\n");
			sb.append("쪽지시험이 있다는데요...?\n");
			
			String content = sb.toString();
			
			// content에 저장된 문자열을
			// /io_test/202050305/출력테스트.txt 파일로 출력하기
			
			// 파일과 출력 스트림 연결(파일이 없으면 생성해줌)
			fw = new FileWriter("/io_test/20250305/출력테스트.txt");
			bw = new BufferedWriter(fw);
			
			bw.write(content); // content에 저장된 내용을 연결된 파일에 출력
			
			// bw.flush();
			
			System.out.println("출력 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw!=null) {
					bw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
