package com.objparam.controller;

import com.objparam.model.vo.Lunch;

public class ObjectParam {

	private String check;
	
	
	//1. 기본자료형 매개변수, 객체, 배열 매개변수의 차이
	public void basicParam(int a, String b){
		a++;
		b+="문자열";
		System.out.print("기본형매개변수"+a+" "+ b+"\n");
		}
	
	public void arrParam(int[] arrInt) {
		arrInt[0]=100;
		arrInt[1]=200;
	}
	
	public void food(Lunch lunch){
		lunch.setMenu("김치찌개");
		lunch.setPrice(8000);
	}
	
	public void checkTest() {
		check+="10";
		System.out.println(check);
	}
	public void setCheck(String check) {
		this.check=check;
	}
}
