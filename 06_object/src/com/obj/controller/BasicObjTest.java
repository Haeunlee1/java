package com.obj.controller;

public class BasicObjTest {	//Ŭ���� �����
	//1.�ʵ�(�������) ->������ ���� / ��������
	//2. ������ -> Ŭ������ �ν��Ͻ�ȭ ��ų �� ����, ��ü�� ������ �� ���
	//3. �޼ҵ� -> ��� //��������
	
	
	DefaultTest d = new DefaultTest();
	
	public void fieldTest() {
		FieldTest f = new FieldTest();
		System.out.println(f.name);
		System.out.println(f.age);
		//System.out.println(f.email);
	}
}
