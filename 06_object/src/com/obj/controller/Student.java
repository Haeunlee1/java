package com.obj.controller;

public class Student {

	//StudentŬ������ ����� ����
	//���������ڴ� ��𼭳� ���ٰ����ϰ� ����
	//�̸�, ����, �г�, ��, �ּ�, Ű
	//�ʵ带 ����غ���
	
	public String name;
	public int age;
	public int grade;
	public int group;
	public String add;
	public double height;
	
	{
		name ="������";
		age=26;
		grade=3;
		group=4;
		add="����";
		height=166.7;
	}
	
	//������ �߰��ϱ� => new�� ������ ������ 
	//���������� Ŭ������(){ ���� = �ʵ� �ʱ�ȭ}
	//public 
	public Student() {
		//�ʵ带 �ʱ�ȭ��.
		name="������";
		age=27;
		grade=1;
		group=10;
		add="����";
		height=200.2;
		System.out.println("�⺻������ ����");
	} 
	//=> �⺻������, default������ ������ // ���� �ۼ����� �ʾƵ� JVM�� �˾Ƽ� ��������
	// �⺻�����ڴ� ������ �ڵ忡 �ۼ����ּ���
	
	
	//�Ű������� �ִ� ������
	//�ܺο��� (�� ��ü�� �����ϴ� ��)�����͸� �޾Ƽ� �ʱ�ȭ�ϴ� ������
	public Student(String name, int age, int grade, int group, String add, int height){
		this.name=name; //�̸��� ���� �� this. �� ����� //�Ű������� �ʵ���� �ߺ��� �� // ���� �����ɷ� ���� ��
		this.age=age;
		this.grade=grade;
		this.group=group;
		this.add=add;
		this.height=height;
		
	}
	//�Ű������� ������ ���� �����ڸ� ��󾲱� ����
	public Student(String name, int age, String add, double height) {
		//�ٸ� ������ ȣ��
		//this();//=> �⺻������ ȣ�� ��, �Ű������� ���� �г�&���� �⺻�����ڰ����� ���õǾ� ��µ�
		//�ٸ� ������ �����ִ� �����ڵ� ȣ�Ⱑ��
		//this�� �׻� ó���� ���;���
		//this(name,age,10,20,add,height);
		this.name=name;
		this.age=age;
		this.add=add;
		this.height=height;
	}
	
	
	
	
}













