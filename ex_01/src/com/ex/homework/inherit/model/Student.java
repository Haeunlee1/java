package com.ex.homework.inherit.model;

import java.util.Objects;

public class Student extends Person{

	private int grade;                 //Student필드 초기화
	private int group;
	private String number;

	public Student(){}

	public Student(String name, int age, String gender, int grade, int group, String number){
		super(name, age, gender);   //Person클래스를 상속받았으니 super()를 통해 부모생성자접근
		//super()는 항상 첫 줄에 써줘야함
		this.grade = grade;
		this.group = group;
		this.number = number;	
	}
	

	public Student(int grade, int group, String number) {
		super();
		this.grade = grade;
		this.group = group;
		this.number = number;
	}

	public void setGrade(int grade){
		this.grade=grade;
	}
	public int getGrade(){
		return grade;
	}

	public void setGroup(int group){
		this.group = group;
	}
	public int getGroup(){
		return group;	
	}

	public void setNumber(String number){
		this.number=number;
	}
	public String getNumber(){
		return number;
	}
	
	@Override
	//객체의 주소값을 반환해주는 메소드
	// 내맘대로 정해서 출력가능
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+grade+" "+group+" "+number;
		
	}
	

	@Override
	//equals해보기 (동등비교메소드)
	//equals할때는 hashcode(int형)도 같이 맞춰주기
	//모든 조건이 같아야 같은사람
	
	public boolean equals(Object obj) { 	//매개변수의 데이터타입은 Object
		if(obj instanceof Student) {	//
			Student s = (Student)obj;	//obj는 Student로 형변환
			if(super.getName().equals(s.getName())&&super.getAge()==s.getAge()&&super.getGender().equals(s.getGender())
					&&grade==s.getGrade()&&group==s.getGroup()&&number.equals(s.getNumber()));{
					return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getName(),getAge(),getGender(),grade,group,number);
	}
}
