package com.ex.homework.inherit.model;

import java.util.Objects;

public class Student extends Person{

	private int grade;                 //Student�ʵ� �ʱ�ȭ
	private int group;
	private String number;

	public Student(){}

	public Student(String name, int age, String gender, int grade, int group, String number){
		super(name, age, gender);   //PersonŬ������ ��ӹ޾����� super()�� ���� �θ����������
		//super()�� �׻� ù �ٿ� �������
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
	//��ü�� �ּҰ��� ��ȯ���ִ� �޼ҵ�
	// ������� ���ؼ� ��°���
	public String toString() {
		return getName()+" "+getAge()+" "+getGender()+" "+grade+" "+group+" "+number;
		
	}
	

	@Override
	//equals�غ��� (����񱳸޼ҵ�)
	//equals�Ҷ��� hashcode(int��)�� ���� �����ֱ�
	//��� ������ ���ƾ� �������
	
	public boolean equals(Object obj) { 	//�Ű������� ������Ÿ���� Object
		if(obj instanceof Student) {	//
			Student s = (Student)obj;	//obj�� Student�� ����ȯ
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
