package com.obj.main;

import com.obj.controller.FunctionalTest;

public class Run2 {
	public static void main(String[] args) {
		double result = new FunctionalTest().cal1();
		//double result = ��갪
		System.out.println(result);
//		System.out.println(new FunctionalTest().cal1());		//�ٷ� ����ǰ� ��
//		double result2 = new FunctionalTest().cal1()+300;	
		//new FunctionalTest().cal1()�� ������� �����ϱ� �׷��� ���굵 ������ (return �޼ҵ�ϱ�!!)
		
		//�Ű����� �ִ� ������ ȣ��
		FunctionalTest f = new FunctionalTest();
		f.cal2(10, 5, '/');			//�Ű����� ������ �ٷ� �޼ҵ� ���డ�� 
//		System.out.println(f.cal2(10, 4, '+')); => ��ȯ���� ������ syso�ε� ��� �Ұ� �׳� ���ٿ�����(.)���� ȣ���ϱ�
		//�Ű������� �ִ� �޼ҵ带 ȣ���� ���� 
		//�ݵ�� ����� �Ű��������� ��� �����ؾ���
		
		//��ȯ���� ���� �Ű������� ���� �޼ҵ� 
		f.cal3();
		
		//��ȯ���� �ְ� �Ű������� �ִ� �޼ҵ�
		double result3 = f.cal4(10, 2, '/');
		System.out.println("cal4 ����� ��� : "+result3);
		
		//�� �޼ҵ��� ���� ����ϱ� ���ؼ� ��ȯ�� �޼ҵ� => ����� �� syso�� ���� ������������
		// ��ȯx�޼ҵ� => �޼ҵ� �����ÿ� ������ sys���� �־��ֱ�
		
		
		
	}

}
