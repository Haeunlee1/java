package com.obj.controller;

public class InitblockTest {

	public String name;
	public int age;
	public double height;
	public final String email;
	public static String data;
	
	//초기화블럭사용하기 => new로 생성할 때마다 실행됨
	{
		//필드(멤버변수)의 초기값을 세팅;
		//연산자 사용이 가능
		System.out.println("초기화 블록실행");
		name = "수강생";
		age = 19;
		height = 180;
		email="dldldl@gmail.com";
		
		//static 변수를 초기화 할 수 있는가
		data="ㅎㅎ";
	}
	//생성자
	public InitblockTest() {}
	
	
	
	//static 초기화블록 => 최초 객체가 생성될 때 한번만 실행됨
	//static으로 선언된 변수를 초기화할 때 사용
	//나누는 이유는? 초기화블럭(=인스턴스블럭)은 heap영역, static은 static영역에서 실행됨=>프로그램에서 제일 먼저 실행된다.
	static {
		System.out.println("static 초기화블럭");
//		name="김김김"; => // static이 아닌 일반 인스턴스임, 접근불가  
		
	}


}
