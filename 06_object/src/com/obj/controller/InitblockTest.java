package com.obj.controller;

public class InitblockTest {

	public String name;
	public int age;
	public double height;
	public final String email;
	public static String data;
	
	//�ʱ�ȭ������ϱ� => new�� ������ ������ �����
	{
		//�ʵ�(�������)�� �ʱⰪ�� ����;
		//������ ����� ����
		System.out.println("�ʱ�ȭ ��Ͻ���");
		name = "������";
		age = 19;
		height = 180;
		email="dldldl@gmail.com";
		
		//static ������ �ʱ�ȭ �� �� �ִ°�
		data="����";
	}
	//������
	public InitblockTest() {}
	
	
	
	//static �ʱ�ȭ��� => ���� ��ü�� ������ �� �ѹ��� �����
	//static���� ����� ������ �ʱ�ȭ�� �� ���
	//������ ������? �ʱ�ȭ��(=�ν��Ͻ���)�� heap����, static�� static�������� �����=>���α׷����� ���� ���� ����ȴ�.
	static {
		System.out.println("static �ʱ�ȭ��");
//		name="����"; => // static�� �ƴ� �Ϲ� �ν��Ͻ���, ���ٺҰ�  
		
	}


}
