package com.obj.controller;

public class Person {
	
	private String name;
//	public int age;
	private int age;
	private String addr;
	private double height;
	private double weight;
	
	public Person() {}
	
	public Person(String name, int age, String addr, double height, double weight) {
		this.name=name;
		this.age=age;
		this.addr=addr;
		this.height=height;
		this.weight=weight;
	}
	
	//setter() / getter() 설정하는 법 => 필드값에 손 대는 것임 / 필드당 한개씩
	//setter() : 필드에 값을 넣어주는 것, 리턴값 없음, 값만 넣어주고 끝남
	//setter이름 : set필드명() / 필드명 첫글자는 대문자
	public void setAge(int age) {
		if(age<0) {
			System.out.println("양수만 입력하세요");
		}else {
			this.age=age;
		}
//		this.age=age;
		//메소드니까 조건문을 통해 필터링가능
	}
	//getter() : 필드에 있는 값을 호출한 곳으로 출력(전달)하는 것
	//getter이름 : get필드명(), 필드 첫글자는 대문자
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAddr(String addr) {
		this.addr=addr;
	}
	public String getAddr() {
		return addr;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	public double getHeight() {
		return height;
	}
	
	public void setWeight(double weight) {
		this.weight=weight;
	}
	public double getWeight() {
		return weight;
	}
}
