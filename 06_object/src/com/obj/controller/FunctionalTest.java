package com.obj.controller;

import java.util.Scanner;

public class FunctionalTest {
	//기능제공용 클래스
	// 메소드만 가지고 있는 클래스
	
	//계산기 기능을 추가
	//수 2개, 연산자, 결과값
	//1. 반환형이 있고 매개변수 x
	//반환형은 무조건 한개만 가능하다
	//같은 자료형의 데이터 여러개면 => 배열로 묶어서 넘기기
	// 다른 자료형의 데이터 여러개면 => 클래스로 묶어도 됨
	public double cal1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		System.out.print("정수입력 : ");
		int su2 = sc.nextInt();
		System.out.print("연산자 : ");
		char op = sc.next().charAt(0);
		
		double result=0.0; 		//지역변수는 무조건 초기화 시켜야함
		
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}
		
		return result;		//자신을 호출한 곳으로 return값을 보내줌
	}
	
	
	//매개변수가 있고 반환형이 없는 메소드 구현하기
	//계산기 => 숫자 2개, 연산자, 계산결과
	public void cal2(int su, int su2, char op) {
		double result=0.0;
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}
		System.out.println("cal2 = "+result);
	}
	
	
	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int su=sc.nextInt();
		System.out.print("정수입력 : ");
		int su2 = sc.nextInt();
		System.out.print("연산자 : ");
		char op = sc.next().charAt(0);
		double result=0.0;
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}
		System.out.println("cal3 = "+result);
		
	}
	
	//반환형도 있꼬 매개변수도 있음
	public double cal4(int su, int su2, char op) {
		double result=0.0;
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}return result;
	}
	
}
