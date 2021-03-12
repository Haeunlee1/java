package com.obj.model.vo;

public class Animal {

	private String type;
	private String name;
	private int age;
	private int legs;
	private static int temp;  //=> static �ʵ�� setter, getter���� static �߰��������
	
	public Animal() {}
	//������ ����� ��ü
	public Animal(String type, String name, int age, int legs) {
		this.type=type;
		this.name=name;
		this.age=age;
		this.legs=legs;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void setLegs(int legs) {
		this.legs=legs;
	}
	public int getLegs() {
		return legs;
	}
	
	public static void setTemp(int temp) {
		//this.temp=temp;
		Animal.temp=temp;   //=> static ������ this���� Ŭ������.���������� 
		//=> static �ʵ�� setter, getter���� static �߰��������
	}
	public static int getTemp() {
		return temp;	//=> static �ʵ�� setter, getter���� static �߰��������
	}
}
