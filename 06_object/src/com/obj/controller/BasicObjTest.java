package com.obj.controller;

public class BasicObjTest {	//클래스 선언부
	//1.필드(멤버변수) ->데이터 저장 / 생략가능
	//2. 생성자 -> 클래스를 인스턴스화 시킬 때 실행, 객체로 생성할 때 사용
	//3. 메소드 -> 기능 //생략가능
	
	
	DefaultTest d = new DefaultTest();
	
	public void fieldTest() {
		FieldTest f = new FieldTest();
		System.out.println(f.name);
		System.out.println(f.age);
		//System.out.println(f.email);
	}
}
