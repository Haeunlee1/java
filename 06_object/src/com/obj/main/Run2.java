package com.obj.main;

import com.obj.controller.FunctionalTest;

public class Run2 {
	public static void main(String[] args) {
		double result = new FunctionalTest().cal1();
		//double result = 계산값
		System.out.println(result);
//		System.out.println(new FunctionalTest().cal1());		//바로 출려되게 함
//		double result2 = new FunctionalTest().cal1()+300;	
		//new FunctionalTest().cal1()는 변수라고 생각하기 그래서 연산도 가능함 (return 메소드니까!!)
		
		//매개변수 있는 생성자 호출
		FunctionalTest f = new FunctionalTest();
		f.cal2(10, 5, '/');			//매개변수 넣으면 바로 메소드 실행가능 
//		System.out.println(f.cal2(10, 4, '+')); => 반환형이 없으면 syso로도 출력 불가 그냥 접근연산자(.)으로 호출하기
		//매개변수가 있는 메소드를 호출할 때는 
		//반드시 선언된 매개변수값을 모두 전달해야함
		
		//반환형이 없고 매개변수도 없는 메소드 
		f.cal3();
		
		//반환형이 있고 매개변수도 있는 메소드
		double result3 = f.cal4(10, 2, '/');
		System.out.println("cal4 계산한 결과 : "+result3);
		
		//각 메소드의 값을 출력하기 위해선 반환형 메소드 => 실행될 때 syso를 따로 실행시켜줘야함
		// 반환x메소드 => 메소드 생성시에 로직에 sys값을 넣어주기
		
		
		
	}

}
