package com.obj.controller;

public class FieldTest {
	//필드 선언하기
	//접근제어자(public / protected / default/ private) [예약어] 자료형 변수명;
	public String name;
	int age;
	private String email;
	
	//접근제한자 예약어 자료형 변수명
	//static =>객체를 생성하지 않고 쓸 수 있음 / 클래스명.변수명 로 직접접근가능 단, 접근제한자가 public일때 (new 생성 안해도 됨)
	//static 변수(필드)선언하기
	public static String nickName;
	private static double height;
	
	//final 예약어 => 상수, 변경불가
	public final char ch; 
	
	//필드(멤버변수) 초기화 블록, 생성자를 이용해서 초기화 가능
	{
		ch='c';
	}//=>초기화블럭

	
	
	
	
	
	
}
