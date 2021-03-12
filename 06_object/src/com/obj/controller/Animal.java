package com.obj.controller;

public class Animal {

	
	//Animal클래스 만들어서 출력하기
			//종류, 이름, 나이, 서식지, 다리개수, 성별
			//개 바둑이 9 동네골목 4 남->출력
			//원숭이 원순이 10 일본 2 여 ->
			//코끼리 코돌이 77 냉장고 4 여 ->출력
	
	public String animal;
	public String name;
	public int age;
	public String place;
	public int legs;
	public char gender;
	
	
	public Animal() {
		animal="개";
		name="바둑이";
		age=9;
		place="동네골목";
		legs=4;
		gender='남';
	}
	
	public Animal(String animal,String name, int age, String place, int legs, char gender) {
		this.animal=animal;
		this.name=name;
		this.age=age;
		this.place=place;
		this.legs=legs;
		this.gender=gender;
	}
}
