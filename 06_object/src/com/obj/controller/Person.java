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
	
	//setter() / getter() �����ϴ� �� => �ʵ尪�� �� ��� ���� / �ʵ�� �Ѱ���
	//setter() : �ʵ忡 ���� �־��ִ� ��, ���ϰ� ����, ���� �־��ְ� ����
	//setter�̸� : set�ʵ��() / �ʵ�� ù���ڴ� �빮��
	public void setAge(int age) {
		if(age<0) {
			System.out.println("����� �Է��ϼ���");
		}else {
			this.age=age;
		}
//		this.age=age;
		//�޼ҵ�ϱ� ���ǹ��� ���� ���͸�����
	}
	//getter() : �ʵ忡 �ִ� ���� ȣ���� ������ ���(����)�ϴ� ��
	//getter�̸� : get�ʵ��(), �ʵ� ù���ڴ� �빮��
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
