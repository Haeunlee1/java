package com.kh.practice.func;
import java.util.Scanner;
public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====��� Ȯ��=====");
		System.out.print("���� : ");
		int i = sc.nextInt();
		System.out.println(i>=0?"�����":"����� �ƴϴ�");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���, ���� Ȯ��=====");
		System.out.print("���� : ");
		int i = sc.nextInt();
		System.out.println(i>0?"�����":i==0?"0�̴�":"������");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====¦��, Ȧ�� Ȯ��=====");
		System.out.print("���� : ");
		int i = sc.nextInt();
		System.out.println(i%2==0?"¦����":"Ȧ����");
		
		}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� ������=====");
		System.out.print("�ο� ��? : ");
		int i = sc.nextInt();
		System.out.print("���� ����? : ");
		int j = sc.nextInt();
		System.out.println("1�δ� ���� ���� : "+(j/i));
		System.out.println("���� ���� ���� : "+(j%i));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====�����Է�=====");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("�г�(���ڸ�) :" );
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int gradeClass = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("����(�Ҽ����Ʒ���°�ڸ�����) : ");
		double level = sc.nextDouble();
		String result = gender=='M'?"���л�":"���л�";
		System.out.printf("%d�г� %d�� %d�� %s %s�� ������ %.2f�̴�.",grade, gradeClass, num, name, result, level);
		System.out.println();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====����Ȯ��=====");
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println(age<=13?"���":(13<age&&age<20)?"û�ҳ�":"����");
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====������ �հ�� ��ձ��ϱ�=====");
		System.out.print("���� : ");
		int a = sc.nextInt();
		System.out.print("���� : ");
		int b = sc.nextInt();
		System.out.print("���� : ");
		int c = sc.nextInt();
		int sum = a+b+c;
		int avr = (a+b+c)/3;
		System.out.println("�հ� : "+sum);
		System.out.println("��� : "+avr);
		System.out.println((a>=40&&b>=40&&c>=40)&&avr>=60?"�հ�":"���հ�");
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====��������=====");
		System.out.print("�ֹι�ȣ�� �Է��ϼ��� (-����) : ");
		char gender = sc.next().charAt(7);
		System.out.println((gender=='1'||gender=='3')?"����":"����");
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====���� ��=====");
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int input = sc.nextInt();
		System.out.println(input<=num1||input>num2);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====3���� �� �Է�=====");
		System.out.print("�Է�1 : ");
		int a = sc.nextInt();
		System.out.print("�Է�2 : ");
		int b = sc.nextInt();
		System.out.print("�Է�3 : ");
		int c = sc.nextInt();
		System.out.println(a==b&&b==c);
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====������ �Է��ϼ���=====");
		System.out.print("A����� ���� : ");
		int a = sc.nextInt();
		System.out.print("B����� ���� : ");
		int b = sc.nextInt();
		System.out.print("C����� ���� : ");
		int c = sc.nextInt();

		System.out.printf("A��� ����/����+a : %d/%.1f",a,(double)(a*=1.4));
		System.out.println();
		System.out.println(a>=3000?"3000 �̻�":"3000 �̸�");
		System.out.printf("B��� ����/����+a : %d/%.1f",b,(double)(b));
		System.out.println();
		System.out.println(b>=3000?"3000 �̻�":"3000 �̸�");
		System.out.printf("C��� ����/����+a : %d/%.1f",c,(double)(c*=1.15));
		System.out.println();
		System.out.println(c>=3000?"3000 �̻�":"3000 �̸�");
		
	}
}
