package com.obj.controller;

public class FieldTest {
	//�ʵ� �����ϱ�
	//����������(public / protected / default/ private) [�����] �ڷ��� ������;
	public String name;
	int age;
	private String email;
	
	//���������� ����� �ڷ��� ������
	//static =>��ü�� �������� �ʰ� �� �� ���� / Ŭ������.������ �� �������ٰ��� ��, ���������ڰ� public�϶� (new ���� ���ص� ��)
	//static ����(�ʵ�)�����ϱ�
	public static String nickName;
	private static double height;
	
	//final ����� => ���, ����Ұ�
	public final char ch; 
	
	//�ʵ�(�������) �ʱ�ȭ ���, �����ڸ� �̿��ؼ� �ʱ�ȭ ����
	{
		ch='c';
	}//=>�ʱ�ȭ��

	
	
	
	
	
	
}
