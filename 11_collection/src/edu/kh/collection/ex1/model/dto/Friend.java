package edu.kh.collection.ex1.model.dto;

import java.util.List;

public class Friend {
	
	private String name;
	
	public Friend() {}

	public Friend(String name) {
		super();
		this.name = name;
	}
	
	public void pickLeader(List<Friend> friend) {
		int num = (int)(Math.random()*friend.size());
		System.out.println(friend.get(num).getName() + "가 골목대장이다.");	
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
}
