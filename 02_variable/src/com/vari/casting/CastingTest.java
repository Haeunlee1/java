package com.vari.casting;

public class CastingTest {

	public static void main(String[] args) {
		//�ڷ�����ȯ �˾ƺ���
		//byte bnum = 200;
		byte bnum = 100;
		System.out.println(bnum);
		
		long lnum = 10000;
		System.out.println(3.14+100);
		
		double weight = 65.5;
		int weightInt;
		weightInt=(int)weight;
		System.out.println("��ȯ�� �� : "+weightInt);
		System.out.println("������ : "+weight);
		
		
		//������ �ս� �߻���Ȳ
		int num = 290;
		bnum=(byte)num;
		System.out.println("������ : "+ num);
		System.out.println("����ȯ�� : "+ bnum);
		
		//�ڵ�����ȯ�� Ư���� (������)
		byte num1 = 100;
		byte num2 = 10;
		byte result = (byte)(num1+num2);   // �⺻���� ������꿡 ���� ���� int������ ó�� �� �׷��� ������� ��ȣ�� ���� �տ� ��������ȯ ������
		System.out.println(result);
		//char���� ���� �ڷ�����ȯ
		//�����ڵ� -> ���ڿ� ���ڸ� ���ν��ѳ��� �ڵ�
		char ch='A';
		int alpha = 66;
		System.out.println(alpha);
		System.out.println((char)alpha);
		System.out.println(ch+1);
		char ch2 = (char)(ch+1);
		
		
	}
}
