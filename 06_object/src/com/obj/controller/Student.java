package com.obj.controller;

public class Student {

	//Student클래스를 만들어 보자
	//접근제한자는 어디서나 접근가능하게 설정
	//이름, 나이, 학년, 반, 주소, 키
	//필드를 출력해보자
	
	public String name;
	public int age;
	public int grade;
	public int group;
	public String add;
	public double height;
	
	{
		name ="이하은";
		age=26;
		grade=3;
		group=4;
		add="서울";
		height=166.7;
	}
	
	//생성자 추가하기 => new로 생성될 떄마다 
	//접근제한자 클래스명(){ 로직 = 필드 초기화}
	//public 
	public Student() {
		//필드를 초기화함.
		name="박유현";
		age=27;
		grade=1;
		group=10;
		add="서울";
		height=200.2;
		System.out.println("기본생성자 실행");
	} 
	//=> 기본생성자, default값으로 설정됨 // 따로 작성하지 않아도 JVM이 알아서 생성해줌
	// 기본생성자는 무조건 코드에 작성해주세요
	
	
	//매개변수가 있는 생성자
	//외부에서 (이 객체를 생성하는 쪽)데이터를 받아서 초기화하는 생성자
	public Student(String name, int age, int grade, int group, String add, int height){
		this.name=name; //이름이 같을 때 this. 를 사용함 //매개변수와 필드명이 중복될 때 // 보통 같은걸로 많이 씀
		this.age=age;
		this.grade=grade;
		this.group=group;
		this.add=add;
		this.height=height;
		
	}
	//매개변수의 개수에 따라 생성자를 골라쓰기 가능
	public Student(String name, int age, String add, double height) {
		//다른 생성자 호출
		//this();//=> 기본생성자 호출 됨, 매개변수에 없던 학년&반이 기본생성자값으로 셋팅되어 출력됨
		//다른 형식을 갖고있는 생성자도 호출가능
		//this는 항상 처음에 나와야함
		//this(name,age,10,20,add,height);
		this.name=name;
		this.age=age;
		this.add=add;
		this.height=height;
	}
	
	
	
	
}













