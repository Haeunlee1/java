package com.vari.printtest;

import java.util.Scanner;

public class InputTest {
	
	//Ű���忡�� �Է��� �� ��������
	
	public static void main(String[] args) {
		// Ű���忡 �Է��� �� ram�� �����ϱ�
		// �ڹٿ��� �����ϴ� Scanner�� �̿��Ѵ�
		// java.unil ��Ű���� ��������
		// 1.  java.util.Scanner�� import�Ѵ�
		
		// 2. Ŭ������ ����Ϸ��� �ݵ�� new�� �̿��Ͽ� ������ ȣ��(�ν��Ͻ� �����)
		//Scanner sc = new Scanner(System.in);
		
		// 3. Scanner�� �����ϴ� ���(�żҵ�)�� �̿��ؼ� Ű������ �Է°��� �����´�.
		// 3. Scanner�� �����ϴ� ���(�żҵ�)�� �̿��ؼ� Ű������ �Է°��� �����´�.		
		// nextInt(), nextDouble(), next(), nextLine();
		// nextInt() : intŸ���� ���� ��������
		// nextDouble() : Double ��
		// next(): ���ڿ��� ������  => ���⸦ �������� ������  
		// nextLine() : ���ڿ��� ������  => �ٹٲ�(����)���� ���ڿ� ������
//		System.out.print("����� ���̸� �Է��ϼ���.");
//		int age = sc.nextInt();
//		System.out.print("����� Ű�� �Է��ϼ��� : ");
//		double height = sc.nextDouble();
//		System.out.println("�Է°� : " +age +" "+ height);
		
		
		//���ڿ� �Է¹ޱ�
//		System.out.print("����� �ּҸ� �Է��ϼ��� : ");
//		String name = sc.next();
//		sc.nextLine();
//		System.out.println("next() : "+name);
//		
//		name = sc.nextLine();
//		System.out.println("����� �ּҴ� "+name);
//		
		
		//���� nextInt, �Ǽ� nextDouble, ����(next();)�� �Է� �ް� nextLine()�� �Է¹��� ��� buffer�� �������� 
		// �� 3���� �żҵ�� \n���� �ڵ����� ���� �� �׷��� sc.nextLine()���� �ѹ� �Ѱ������
		//buffer�� input ���� ��? �׷��� sc.nextLine()�� �������
//		System.out.println("����� ���̴�?");
//		int age = sc.nextInt();
//		System.out.println("����� �ּҴ�?");
//		sc.nextLine();   // ���۸� ���� �� 
//		String add = sc.nextLine();
//		System.out.println("����: "+age+"�ּ� :"+add);
		
		
		
		//���̸� �Է¹ް� ��� �׸��� �̸� �Է¹ް� ���
		System.out.println("�ȳ��ϼ���");
		System.out.println("����� ���̴�? ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("����� ���� ����"+age+"�� �Դϴ�.");
		System.out.println("����� Ű��? ");
		double height = sc.nextDouble();
		System.out.println("����� Ű�� "+height+"cm �Դϴ�.");
		System.out.println("����� �̸��� ? ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("����� �̸��� "+name+"�Դϴ�.");
		
		
		
	}

}
