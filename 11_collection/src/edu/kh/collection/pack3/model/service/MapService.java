package edu.kh.collection.pack3.model.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.kh.collection.pack3.model.dto.Member;

public class MapService {
	
	// Map : Key와 Value 한 쌍이 데이터가 되어 이를 모아둔 객체
	// Key : Value -> Entry라고 부름
	
	// - Key를 모아두면 Set의 특징(중복 X)
	// - Value를 모아두면 List의 특징(증복 O)
	
	public void ex1() {
		
		// Hashmap<K,V> : Map의 자식 클래스 중, 가장 대표되는 Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// Map.put(Integer Key, String Value) : 추가
		map.put(1, "짱구");
		map.put(2, "철수");
		map.put(3, "맹구");
		map.put(4, "유리");
		map.put(5, "훈이");
		map.put(6, "수지");
		
		// Key 중복 테스트 하기
		System.out.println(map.put(6, "짱아")); // Map은 중복을 허용하지 않음, 대신 Value를 덮어쓴다.
		System.out.println(map.put(3, "수지"));
		
		// Value 중복 테스트
		System.out.println(map.put(7, "짱아")); // Value는 중복을 허용함.
		
		System.out.println(map); // {Key=Value, Key=Value, ... } : map에서 toString() 오버라이드가 되어있음	
	}
	
	public void ex2() {
		
		// Map 사용 예제
		
		// VO/DTO(값 저장용 객체)는 특정 데이터 묶음의 재사용이 많은 경우 주로 사용함.
		// -> 재사용이 적은 VO는 오히려 코드 낭비
		// -> Map을 이용해서 VO와 비슷한 코드를 작성할 수 있음
		
		// 1) VO 버전
		Member member = new Member();
		
		// 값 세팅
		member.setId("user01");
		member.setPw("pass01");
		member.setAge(25);
		
		// 값 출력
		System.out.println(member.getId());
		System.out.println(member.getPw());
		System.out.println(member.getAge());
		
		System.out.println("----------------------------------------");
		
		// 2) Map 버전
		Map<String, Object> map = new HashMap<String, Object>();
		// Value == Object : Value에는 자료형에 상관없이 모든 객체를 받을 수 있음. 
		
		// 값 세팅
		map.put("id", "user02");
		map.put("pw", "pass02");
		map.put("age", 30);
		
		// 값 출력
		// Object(Value) Map.get(String Key) : 매개변수로 전달받은 key와 대응되는 Value 반환
		System.out.println(map.get("id"));
		System.out.println(map.get("pw"));
		System.out.println(map.get("age"));
		
		System.out.println("----------------------------------------");
		
		// Map에 저장된 데이터 순차적으로 접근하기
		// {"id"="user02", "pw"="pass02", "age"=30}
		
		// Map에서 Key만 모아두면 Set의 특징을 가진다(중복저장 X)
		// -> 이를 활용해서 Map에서 keySet() 메서드 제공
		// -> Key만 모아서 Set으로 반환
		
		Set<String> set = map.keySet();
		
		System.out.println("keySet() : " + set);
		
		// 향상된 for문
		for(String key : set)
			System.out.println(map.get(key));
		
		// map에 저장된 데이터가 많거나(반복 필요)
		// 어떤 key가 있는지 불분명할 때(향상된 for문)
		// 또는 map에 저장된 모든 데이터에 접근해야할 때
		// keySet() + 향상된 for문 코드 사용
	}
	
	public void ex3() {
		// List에 Map 여러개 추가하여 다루기
		
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>(); 
		// List 객체만 생성되었고, 해당 List에는 Map만 들어올 수 있음을 제한함
		// -> Map 객체는 아직 생성 X
		
		for(int i=0; i<10; i++) {
			// Map 객체 생성
			Map<String, Object> map = new HashMap<String, Object>();
			
			// Map에 데이터 추가
			map.put("id", "user0"+i);
			map.put("pw", "pass0"+i);
			
			// Map을 List에 추가
			list.add(map);
			// HashMap은 순서를 보장하지 않는 자료 구조
			// 순서를 유지하고 싶으면 LinkedHashMap 이용하면 된다.
			// LinkedHashMap은 put한 순서를 유지 시켜줌
		}
		// for문 종료 시 list에 10개의 Map 객체가 추가되었다.
		System.out.println(list);
		
		// 향상된 for문을 이용하여 key가 "문자열"에 대응되는 Value 값 전부 출력하기
		for(Map<String, Object> temp : list) {
			System.out.println(temp.get("id") + " / " + temp.get("pw"));
		}
	}
}
