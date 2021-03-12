package com.obj.main;
import com.obj.controller.*;

public class Run {
	public static void main(String[] args) {
		new BasicObjTest();		//BasicObjTestŬ���� ��ü ����!
		//new DefaultTest();		//Default�� �ٸ� ��Ű������ ���ٺҰ�! ���� ��Ű�������� ����
		
		//FieldTestŬ���� �ʵ忡 �����ϱ�
		//1. Ŭ������ �����ؾ��� => new ������ ���
		//2. ������ Ŭ������ �ּҸ� ������ ���� => ���ٿ�����(.)
		FieldTest fieldTest = new FieldTest();
		//������ ��ü�� �ʵ� �����ϱ�
		System.out.println(fieldTest.name);
		//�ʵ忡 �� �ֱ�
		fieldTest.name="������";
		System.out.println(fieldTest.name);
//		System.out.println(fieldTest.age);   //default�����ڷ� ������
//		System.out.println(fieldTest.email); //private������
		
		//static���� �����ϱ�
		FieldTest.nickName="�ڸ��"; //public�϶� ��𼭵� ���ٰ���
		//FieldTest.name="������";  // name�� static�� �ƴϸ� static���� ���ٺҰ� => new �����ؾ����� ����
		//FieldTest.height=180.5; // private�̴ϱ� ���ٺҰ� (���� Ŭ���������� ����)
		
		
		//�ʱ�ȭ�������ϱ�
		InitblockTest ib = new InitblockTest();  // new�� �����ϰ� �Ǹ� �ʱ�ȭ���� �ڵ����� ������ �׷��� �ؿ������� �ʱ�ȭ��Ͼ��� ���� �����
		System.out.println(ib.name+ib.age+ib.height);
		
		//StudentŬ������ ����� ����
		//���������ڴ� ��𼭳� ���ٰ����ϰ� ����
		//�̸�, ����, �г�, ��, �ּ�, Ű
		//�ʵ带 ����غ���
		//������ ������ ��µǰ� �����ϼ���
		//�г�, �� �����
		Student st = new Student(); //ctrl+shift+o =>�ڵ�import
		System.out.println(st.name+st.age+st.grade+st.group+st.add+st.height);
		System.out.println("st : "+st);
		
		// �ٸ� �л��� ������ ����Ѵ�
		Student st1 = new Student();
		st1.name="������";
		System.out.println(st1.name+st1.age+st1.grade+st1.group+st1.add+st1.height);
		System.out.println("st1 : "+st1);
		
		
		//�Ű������ִ� �����ڸ� �̿�
		//�����ú��� ���ϴ� �����͸� ��ü�� ���԰���
//		Student s2 = new Student("������",26,1,3,"����",190.3);
//		System.out.println(s2.name+s2.age+s2.grade+s2.group+s2.add+s2.height);
		
		Student s3 = new Student("�迹��",26,"����",190.5);
		System.out.println(s3.name+s3.age+s3.grade+s3.group+s3.add+s3.height);
		//-> �г�,�� �� �־��µ� ��µ� ���� => �ʱ�ȭ������ ���� �־���� ����
		// �⺻�������� �ʱ�ȭ���� ��� �ȵ� ����? => �����ڴ� �Ѱ��� ����� �� ���� !!!! => �Ű������� �ִ� �����ڸ� ��������� �⺻�����ڴ� �ҷ����� �ʴ´� ��
		// �ʱ�ȭ���� �ʱ�ȭ�� �� �ߴٸ� => int�� default���� 0�� ��µ�
		
		
		
		//AnimalŬ���� ���� ����ϱ�
		//����, �̸�, ����, ������, �ٸ�����, ����
		//�� �ٵ��� 9 ���װ�� 4 ��->���
		//������ ������ 10 �Ϻ� 2 �� ->
		//�ڳ��� �ڵ��� 77 ����� 4 �� ->���
		
		Animal dog = new Animal();
		System.out.println(dog.animal+" "+dog.name+" "+dog.age+" "+dog.place+" "+dog.legs+" "+dog.gender+" ");
		
		Animal monkey = new Animal("������","������",10,"�Ϻ�",2,'��');
		System.out.println(monkey.animal+" "+monkey.name+" "+monkey.age+" "+monkey.place+" "+monkey.legs+" "+monkey.gender+" ");
		
		Animal ele = new Animal("�ڳ���","�ڵ���",77,"�����",4,'��');
		System.out.println(ele.animal+" "+ele.name+" "+ele.age+" "+ele.place+" "+ele.legs+" "+ele.gender+" ");
		
		//���� Ŭ������ �Ű������ִ� �����ڸ� ����� default�����ڸ� ������ ������??
		//dafault�����ڸ� �ڵ����� ���������� ����
	}
	
}
