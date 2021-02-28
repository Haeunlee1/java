package com.vari.printtest;

public class PrintTest {
	
	public static void main(String[] args) {
		//print �� println�� ����
		
		String name="������";
		int age =26;
		double height = 166;
		double weight = 100;
		char gender = 'F';
		//print
		System.out.print(name);
		System.out.print(age);
		System.out.print(height);
		System.out.print(weight);
		System.out.print(gender);
		System.out.println();
		//println
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(gender);
		
		//printf("%����",����) -> ������ ���¸� ���������ִ� �޼ҵ�
		//�̸��� name�������Դϴ� ����ϱ�
		System.out.println("�̸��� "+name+"�Դϴ�.");
		System.out.printf("�̸��� %s�Դϴ�",name);
		System.out.printf("�̸��� %s�Դϴ�",age);  // %s(����)���� ���ڰ� ������ ������ �ڵ����� string Ÿ�� ����ȯ ��
		System.out.printf("�̸��� %d�Դϴ�",age);
		System.out.printf("�̸��� %s�̰�, ���̴� %d�Դϴ�.",name,age);
		//printf�żҵ�� ���� ����, �Ҽ���ǥ���� ���� �� �� �ִ�
		//�̸� ������ ������ ������
		System.out.println("������ 20");
		System.out.println("������ 22");
		System.out.println("������ 24");
		//printf�� �̿��ϸ� �����ؼ� ��°���
		System.out.printf("%5s %d \n", "������", 20);
		System.out.printf("%-5s %d \n", "����", 22);
		System.out.printf("%-5s %d \n", "������", 24);
		
		//�Ҽ��� ǥ�ÿ� ���� ��������
		System.out.printf("%f\n", height);
		System.out.printf("%.2f", height);
		System.out.println();
		
		//�����Ը� �Ҽ��� 3�ڸ����� ���
		System.out.printf("%.3f", weight);
		System.out.println();
		
		//printf�� ���� 000�̰�, ���̴� 00�̰�, ������ 0, Ű�� 000.00 �����Դ� 00.0 �Դϴ� 
		System.out.printf("���� %s�̰�, ���̴� %d�̰�, ������ %s, Ű�� %.2f, �����Դ� %.1f �Դϴ�\n", name, age, gender, height, weight);
		
		System.out.printf("���� %s�̰�, ���̴� %d�̰�,\n������ %s, Ű�� %.2f, �����Դ� %.1f �Դϴ�", name, age, gender, height, weight);
		System.out.println();
		
		//escape�� ( ���ڿ��ȿ��� Ư������� �����ϴ� ����)
		// \t ���� ������ ����
		System.out.println();
		System.out.println();
		
		String msg = "�ȳ��ϼ���";
		System.out.println(msg);
		msg="�ȳ�\t�ϼ���";
		System.out.println(msg);
		
		msg = "\"�� �� �ȹٷ���\" ��� ���ߴ�.";
		System.out.println(msg);
		
		
		System.out.printf("�̸��� %s�̰�, \n%d���Դϴ�.",name,age);
		
		String b = "\"�ȳ�\"�̶�� ���ߴ�";

		String c = "c:\\";

		System.out.println(b);

		System.out.println(c);
		
		
		
		
		
	
	}

}
