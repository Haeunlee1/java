package com.obj.main;

import com.obj.model.vo.Animal;

public class Run4 {

	public static void main(String[] args) {

		//Animal monkey = new Animal();
		
		//���� ������ ���� �ٲٴ� ���� �ν��Ͻ��� ���� ����� �̸����� �������ִ°� ���� 
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal monkey = new Animal();
		
		
		cat.setType("Cat");
		cat.setName("�߿���");
		cat.setAge(20);
		cat.setLegs(4);
		System.out.println(cat.getType()+" "+cat.getName()+" "+cat.getAge()+" "+cat.getLegs());
		
		dog.setType("Dog");
		dog.setName("�ǻ�");
		dog.setAge(3);
		dog.setLegs(4);
		System.out.println(dog.getType()+" "+dog.getName()+" "+dog.getAge()+" "+dog.getLegs());
		
		monkey.setType("Monkey");
		monkey.setName("����");
		monkey.setAge(6);
		monkey.setLegs(2);
		System.out.println(monkey.getType()+" "+monkey.getName()+" "+monkey.getAge()+" "+monkey.getLegs());
		
//		Animal.temp; // static�̴ϱ� Ŭ������.������ ���� ������ ���� �ٵ� ���������ڰ� private�̴ϱ� ���� �Ұ� , �����Ϸ��� get,set�����
		//static ����
		//Ŭ������.�ʵ�(or �޼ҵ�);
		Animal.setTemp(20);  // static�� ���밪
		
//		System.out.println(cat.getTemp());
//		cat.setTemp(30);
//		System.out.println(dog.getTemp());  // static�� �����̶� cat���� 30���� �ٲ� dog���� �Ȱ��� 30���� ����
		// ���� ������ �ƴ� ��ó�� Ŭ���������� �����ϱ�
	}

}
