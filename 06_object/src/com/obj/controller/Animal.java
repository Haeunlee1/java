package com.obj.controller;

public class Animal {

	
	//AnimalŬ���� ���� ����ϱ�
			//����, �̸�, ����, ������, �ٸ�����, ����
			//�� �ٵ��� 9 ���װ�� 4 ��->���
			//������ ������ 10 �Ϻ� 2 �� ->
			//�ڳ��� �ڵ��� 77 ����� 4 �� ->���
	
	public String animal;
	public String name;
	public int age;
	public String place;
	public int legs;
	public char gender;
	
	
	public Animal() {
		animal="��";
		name="�ٵ���";
		age=9;
		place="���װ��";
		legs=4;
		gender='��';
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
