package com.obj.controller;

import java.util.Scanner;

public class FunctionalTest {
	//��������� Ŭ����
	// �޼ҵ常 ������ �ִ� Ŭ����
	
	//���� ����� �߰�
	//�� 2��, ������, �����
	//1. ��ȯ���� �ְ� �Ű����� x
	//��ȯ���� ������ �Ѱ��� �����ϴ�
	//���� �ڷ����� ������ �������� => �迭�� ��� �ѱ��
	// �ٸ� �ڷ����� ������ �������� => Ŭ������ ��� ��
	public double cal1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su=sc.nextInt();
		System.out.print("�����Է� : ");
		int su2 = sc.nextInt();
		System.out.print("������ : ");
		char op = sc.next().charAt(0);
		
		double result=0.0; 		//���������� ������ �ʱ�ȭ ���Ѿ���
		
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}
		
		return result;		//�ڽ��� ȣ���� ������ return���� ������
	}
	
	
	//�Ű������� �ְ� ��ȯ���� ���� �޼ҵ� �����ϱ�
	//���� => ���� 2��, ������, �����
	public void cal2(int su, int su2, char op) {
		double result=0.0;
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}
		System.out.println("cal2 = "+result);
	}
	
	
	public void cal3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int su=sc.nextInt();
		System.out.print("�����Է� : ");
		int su2 = sc.nextInt();
		System.out.print("������ : ");
		char op = sc.next().charAt(0);
		double result=0.0;
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}
		System.out.println("cal3 = "+result);
		
	}
	
	//��ȯ���� �ֲ� �Ű������� ����
	public double cal4(int su, int su2, char op) {
		double result=0.0;
		switch(op) {
			case '+' : result = su+su2;break;
			case '-' : result = su-su2;break;
			case '/' : result = (double)su/su2;break;
			case '*' : result = su*su2;break;
		}return result;
	}
	
}
