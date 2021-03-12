package com.obj.model.vo;

public class Animal {

	private String type;
	private String name;
	private int age;
	private int legs;
	private static int temp;  //=> static 필드는 setter, getter에도 static 추가해줘야함
	
	public Animal() {}
	//데이터 저장용 객체
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
		Animal.temp=temp;   //=> static 변수는 this말고 클래스명.변수명으로 
		//=> static 필드는 setter, getter에도 static 추가해줘야함
	}
	public static int getTemp() {
		return temp;	//=> static 필드는 setter, getter에도 static 추가해줘야함
	}
}
