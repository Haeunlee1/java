package com.objparam.controller;

import com.objparam.model.vo.Lunch;

public class ObjectParam {

	private String check;
	
	
	//1. �⺻�ڷ��� �Ű�����, ��ü, �迭 �Ű������� ����
	public void basicParam(int a, String b){
		a++;
		b+="���ڿ�";
		System.out.print("�⺻���Ű�����"+a+" "+ b+"\n");
		}
	
	public void arrParam(int[] arrInt) {
		arrInt[0]=100;
		arrInt[1]=200;
	}
	
	public void food(Lunch lunch){
		lunch.setMenu("��ġ�");
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
