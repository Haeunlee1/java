package com.obj.main;

import com.obj.controller.Person;

public class Run3 {

	public static void main(String[] args) {

		Person p = new Person();
		
		Person p1 = new Person("������",19,"��⵵ ����",180.5,65.5);
		
		//p���� �����Ͱ� ����
//		p.name="������"; //=> ĸ��ȭ,,private => �Ժη� ��������, ���ϴ� �����͸� �ޱ����Ѱ�
//		System.out.println(p1.name); => ĸ��ȭ,,private => �Ժη� ��������, ���ϴ� �����͸� �ޱ����Ѱ�
		
//		p.age=20;  // int�� public���� �����ϰ� ��������
//		System.out.println(p.age);
		//private ����� �ʵ�(�������)�� ������ �� �ְ� �޼ҵ带 �߰���
		//setter()=>���� �ʵ忡 �ִ� �� & getter()=> ����� ���� �������� ��
		System.out.println(p.getAge()); //=>0 ��µ� ��? p�� age���� �����ϱ�
		System.out.println(p1.getAge()); //=> 19 ��µ�, p1�� 19�� �Ű������� �������ϱ�
		
		//p�� age�� �� �ֱ�
		p.setAge(-20); //=>���ǹ� �־���, , false�����̸� �⺻�� 0�� ���
		System.out.println(p.getAge());
		
		//�����Ǿ��ִ� p�� �� �����ͷ� �ֱ�
		p.setName("������");
		p.setAge(26);
		p.setAddr("����");
		p.setHeight(166);
		p.setWeight(10);
		
		//��ü p ����ϱ�
		 System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddr()+" "+p.getHeight()+" "+p.getWeight());
	}

}
