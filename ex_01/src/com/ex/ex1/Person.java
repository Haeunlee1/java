package com.ex.ex1;

public class Person {

	private String name;
	private char gender;
	
	public Person() {}

	public Person(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
}
