package com.ex.homework.inherit.run;

import com.ex.homework.inherit.model.Employee;
import com.ex.homework.inherit.model.Student;


public class Run {

	public static void main(String[] args) {

		//Student, Employee �Ű����� ���־ ����ϱ�
		
		Student s1 = new Student("������",26,"����",3,2,"11011");
		Student s2 = new Student(1,2,"22022");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		// ��°�
		//������ 26 ���� 3 2 11011
		//null 0 null 1 2 22022 => �̸�, ����, �������� ���� �� ���� ������ default���� ��µ�
		//toString�� ��� �Ű������� ��µǰ� �س��� ����
		
		Employee e1 = new Employee("������",26,"����","������","�븮",100);
		Employee e2 = new Employee("������","���",20);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		//��°�
		//������ 26 ���� ������ �븮 100
		//null 0 null ������ ��� 20 => ���� ��������
		
		
		//������ϱ�
		//s2�� �̸�,����,�������� s1�� ��������
		s2.setName("������");
		s2.setAge(26);
		s2.setGender("����");
		
		if(s1.equals(s2)) {
			System.out.println("s1:s2�� ����");
		}else {
			System.out.println("�ٸ���");
		}
		//��� => ����
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Student s3 = new Student("������",26,"����",3,2,"11011");
		Student s4 = new Student("������",26,"����",3,2,"11011");
		
		if(s3.equals(s4)) {
			System.out.println("s3:s4 ����");
		}else {
			System.out.println("�ٸ���");
		}
		System.out.println("s3 : "+s3.hashCode());
		System.out.println("s4 : "+s4.hashCode());
	}

}
