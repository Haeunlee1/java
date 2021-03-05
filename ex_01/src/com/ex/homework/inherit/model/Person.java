package com.ex.homework.inherit.model;

public class Person {
	private String name;         //필드선언
	private int age;
	private String gender;

	public Person(){}

	public Person(String name, int age, String gender){
		this.name =  name;
		this.age = age;
		this.gender = gender;
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}

	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}

	public void setGender(String gender){
		this.gender=gender;
	}
	public String getGender(){
		return gender;
	}

}
