package com.vari.printtest;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�л� ������ �Է��ϰ� ���
		//�л����� -> �̸�, ����, ����, �ּ�, �г�, Ű
//		System.out.println("===�л����� �Է� ���α׷�===");
//		System.out.println("����� �̸��� �Է��ϼ���");
//		String name = sc.nextLine();
//		System.out.println("����� ���̸� �Է��ϼ���");
//		int age = sc.nextInt();
//		System.out.println("����� ������ �Է��ϼ���");
//		sc.nextLine();   // Line�� �Է¹ޱ� ���� ���� �ʱ�ȭ �ؾ���
//		String gender = sc.nextLine();
//		//sc.nextLine(); �� ���⼭ �ع����� gender�� ���� ���� ���� => \n�� ������ �� �������� ���� sc.nextLine();�� �����ϱ�
//		System.out.println("����� �ּҸ� �Է��ϼ���");
//		String addr = sc.nextLine();
//		System.out.println("����� �г��� �Է��ϼ���");
//		int grade = sc.nextInt();
//		sc.nextLine();
//		System.out.println("����� Ű�� �Է��ϼ���");
//		double height = sc.nextDouble();
//		System.out.println("�л����� \n�̸� : "+name+"\n���� : "+age+"\n���� : "+gender+"\n�ּ� : "+addr+"\n�г� : "+grade+"\nŰ : "+height);
//		//printf�ε� �Ẹ��
		
		
		//���Ϲ��� �Է¹ޱ� -> char��
		// Scanner���� char�� �Է¹޴� �޼ҵ�� ���� String�� �����ϴ� �޼ҵ带 ���� �Ѱ��� ���ڸ� ������ �� ���� => .charAt();
		char first = "ABC".charAt(0);
		System.out.println("first = "+first);
		String name1 = "������";
		first = name1.charAt(1);
		System.out.println("first = "+first);
		
		//Scanner�� ���� �Է¹��� ���� char������ ����������
		System.out.println("key ���� �Է��ϼ���");
		char key = sc.nextLine().charAt(0); // key�� ������Ÿ���� string�� �ƴ� char�� �ؾ��� / �������ڸ� �Է��ص� �ε���0��°���ڸ� ����
		//key = sc.next().charAt(1);
		System.out.println(key);
		// key�� ���ڷ� �ٲ۴�
		System.out.println((int)key);
		
		
		
	}
}
