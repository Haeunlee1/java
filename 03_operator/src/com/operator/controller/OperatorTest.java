package com.operator.controller;
import java.util.Scanner;
public class OperatorTest {

	//���׿��� 
	public void singleOp() {
		//��������
		// ! -> �������� ������Ŵ
		boolean flag = true;
		System.out.println(flag);
		boolean flag2 =!flag;
		System.out.println(flag2);
		System.out.println(!!flag);
		
		//���������� �񱳿���, ������ ����� ������ �� ���� ��� 
		
		
		//��������
		int a = 10;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a++ = "+a);
		
		a--;
		a--;
		a--;
		System.out.println("a-- : "+a);
		
		int b= 10;
		++b;
		++b;
		System.out.println("b : "+b);
		
		
		// �ٸ� ����� ���� ����Ǹ� ����, ������ ���� ���̹߻�
		int num = 10;
		int result = num++;
		System.out.println("result : "+result);
		System.out.println("num : "+num);
		// 1. int num=10; ���� / 2. int result=num �� ����(result�� 10�� ��) / 3. �� ������ num++;�� ���� => ���������� int num=11�� ����
		
		int num3 = 10;
		int result2 = ++num3;
		System.out.println(result2);
		System.out.println(num3);
		// 1. int num3 = 10;/ 2. ++num3 ���� > num3�� 11�� �ǰ� result2�� 11�� �� 
		// for���̳� �������� ���� ���
		
		//���ҵ� �غ���
		
		
		
	}
	
	//������� �����ϱ�
	public void calculator() {
		//���ϱ�
		int num = 10;
		int num2 = 20;
		System.out.println("���ͷ��̿� : "+(10+20));
		System.out.println("�����̿� : "+(num+num2));
		int result = num+num2;
		System.out.println(num+"+"+num2+"="+result);
		
		//���⿬��
		result = num-num2;
		System.out.println(result);
		
		result = num*num2;
		System.out.println(num+"*"+num2+"="+result);
		
		// �������� ���� ����ȯ�� ����
		int num3 = 5;
		int num4 = 9;
		System.out.println((double)num3/num4);
		System.out.println((double)(num3/num4));   //=> (num3/num4)�� ���� ó�� (0.5555 )=>int���̶� 0�� ��. => double�� �ٲ㵵 0.0 ��!! �̷��� ����������
		
		//����������
		System.out.println(num3%num4);
		
		//������ 3�� ������� Ȯ���ϱ�
		//������ ¦��, Ȧ������ Ȯ���ϱ�
		
		
		
	}
	
	//�⺻ ���ϱ� ���� �����
	//1. OperatorTest Ŭ������ ex_calculator() �޼ҵ带 �����
	//�ΰ��� ���� �Է¹޾� ���� ���� ������ ����ϱ�
	// 00+00=00 
	public void ex_calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ���� �Է��Ͻÿ�");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a+b;
		System.out.println(a+"+"+b+"="+result);
		
	}
	
	//�񱳿����� Ȯ��
	public void compareOp() {
		//��Һ� => ���� ũ�⸦ ��
		int age=19;
		int age2=27;
		boolean result = age<age2;
		System.out.println(result);
		
		//����(char)�� ���� ��Һ�
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println(ch1<ch2);
		System.out.println('a'<'b');
		
		//���̸� �Է¹ް� 19�� �̻����� Ȯ��
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����� ���̸� �Է��ϼ���");
//		int age1 = sc.nextInt();
//		System.out.println(age1>19);
//		
		
		//�����
		// == -> ����, ���� ����
		int num = 20;
		System.out.println(num==10);
		
		System.out.println("���ڿ��� ���ϴ� ����?");
		String msg = "���� ������ �������~~";
		String msg1 = "���� ������ �������~~";
		String msg3 = new String("���� ������ �������~~");
		System.out.println(msg==msg1);
		System.out.println(msg==msg3);
		// ���ڿ��� ������ = Ŭ������ 
		// ���ڿ�.equals(�񱳹���);
		System.out.println(msg.equals(msg3));
		
		//����� �����ϱ� => !
		System.out.println("����� ����");
		System.out.println(!msg.equals(msg3));
		
		// ���ڿ� ������ ������ ����� !=
		int a = 20;
		int b = 30;
		System.out.println(a==b);
		System.out.println(a!=b);
		
	}
	
	public void logiccompare() {
		//�Ϲ� ������ AND && / OR ||
		//��� ���� �����̰� �̸��� ������ 
		String name = "������";
		String addr = "����";
		String name1 ="ȫ�浿";
		String addr2="����";
		
		System.out.println(name.equals("������")&&addr.equals("����"));
		
		// ���̰� 20���� ����� ���Ͻÿ�
		Scanner sc = new Scanner(System.in);
		System.out.println("���̸� �Է��Ͻÿ�");
		int age = sc.nextInt();
		System.out.println(20<=age&&age<=29);
		
		//id�� admin�̰� password�� 1234�� id,password �Է¹޾� ó��
		String id = "admin";
		String password = "1234";
		System.out.println("id�� password�� �Է��Ͻÿ�");
		String id2 = sc.next();
		String password2 = sc.next();
		System.out.println(id2.equals(id)&&password2.equals(password));
		// ������id,password�� ���� ������������ .equals���� ���������� ����
		// ���� ���� �������� �ʾ����� .equals(�񱳰�)�־��ָ� ��
		
		//����� ���̰� 10�� �̸鼭, ������ ������ ���
		System.out.println("���̸� �Է��ϼ���");
		int a = sc.nextInt();
		System.out.println("����(M/F)�� �Է��ϼ���");
		char b = sc.next().charAt(0);
		System.out.println(10<=a&&a<=19&&b=='F');
		sc.nextLine();
		
		//�Է¹��� �ּҰ� ��⵵�� �������� ���
		System.out.println("�ּҸ� �Է��ϼ���");
		String add = sc.nextLine();
		System.out.println(add.equals("��⵵")||add.equals("������"));
		
		
		//��°��� �����̰ų� ������ ���̰� 30���� ����
		System.out.println("�ּ��� �Է�");
		String add4 = sc.nextLine();
		System.out.println("���� �Է�");
		int num = sc.nextInt();
		System.out.println("�����Է�");
		sc.nextLine();
		char cc = sc.nextLine().charAt(0);
		System.out.println(add4.equals("����")||add4.equals("����")&&30<=num&&num<40&&cc=='��');
		//����, 19, ���� => �ϸ� true�� ���� 		
		//or�� �������� or �� �����ڸ� ���� ������ (�켱������ &&����||��  ����)
		// �� ��Ȳ���� �ּ� ���� �Է½ÿ� add4.equals("����")�� ���� ����Ǿ� false�� �߰� �ڿ� && ������� ��� ����
		// �׷��� add4.equals("����") || false�� �Ǿ� => true�� ��
		// �׷��� �ּ� �񱳺κ��� ��ȣ�� �����ش�
		// &&�� || ���� ����ÿ� ��ȣ�� �����ִ°� ����! �����ϱ�
		
		
		
		
		
	}
	
	
	//���մ��� ������
	public void complexOp() {
		//���� ���� Ư�������� �� �� �ٽ� ������ϴ� ������
		int su=100;
		//su++; //su=su+1
		//���� += �� => ����= ����+��
		su+=200;
		su+=100;
		su+=300;
		System.out.println(su); //=>300;
		//su+=200 => su=100+200
		//�����հ谡�� (���� �ܰ� �� �ջ��� �ʿ��� ���)
		int total = 0;
		total = 100000;
		total+=200000;
		System.out.println(total);
		
		total *=3;
		System.out.println(total);
		
		//���ڿ� ��������
		String msg = " ";
		msg+="�ȳ��ϼ���";
		System.out.println(msg);
		
		//����ڿ��� 5�� �Է¹ް� ���� �� �ѹ��� ���
		Scanner sc = new Scanner(System.in);
		System.out.println("�޽��� �Է� : ");
		String a = sc.nextLine();
		System.out.println("�޽��� �Է� : ");
		a+=sc.nextLine();
		System.out.println("�޽��� �Է� : ");
		a+=sc.nextLine();
		System.out.println("�޽��� �Է� : ");
		a+=sc.nextLine();
		System.out.println("�޽��� �Է� : ");
		a+=sc.nextLine();
		System.out.println(a);
		
		
	}
	
	//���׿�����
	public void third() {
		//���׿����ڴ� ���ǽĿ� ���� ����� ������ �����ϴ� ����
		// ���ǹ�? A : B ; => A=> true / B=>false
		// ���׿����ڴ� �ܵ����� ���Ἥ ������ �������ְų� syso�� ���������
		int su = 12;
		String msg = su==10?"10�̴�":"10�� �ƴϴ�";
		System.out.println(su==10?"10�̴�":"10�� �ƴϴ�");
		System.out.println(msg);
		
		//���� �Է¹޾� 100���� ū ���� ���ũ�� ���, �ƴϸ� ���� �۴� ���
		Scanner sc= new Scanner(System.in);
		System.out.println("���� �Է�");
		int a = sc.nextInt();
		String b = a>=100?"���~ũ��!":"����,,�۴�";
		System.out.println(b);
		
		//�̼����̸� �����ϼ��� . �ƴϸ� ��������
		System.out.println("�����Է�");
		int i = sc.nextInt();
		b=i<=19?"�����ϼ���":"��������";
		System.out.println(b);  // ������ ���� �ʰ� syso�� �ٷ� ������ ��
		
		//kh�л��̸� �ڵ��ϼ���, �ƴϸ� ����ϼ���
		// kh�л����θ� Ȯ���߾���� => �����ϰ� ��,�ƴϿ��� �޴� ��... ���ǿ� ���� ������ ���� �ؾ��Ѵ� 
		sc.nextLine();
		System.out.println("�Ҽ��Է�");
		String s = sc.nextLine();
		b= s.equals("kh")?"�ڵ��ϼ���":"����ϼ���";
		System.out.println(b);
		//�� �ƴϿ��� �غ���
		System.out.println("kh�л��Դϱ�? (Y/N)");
		char c = sc.next().charAt(0);
		System.out.println(c=='Y'?"�ڵ��ϼ���":"����ϼ���");
		
		//�̼������� Ȯ���ϰ� �̼����� �ƴϰ� ���ڸ� �������� ������, �ƴϸ� ���������� ������
		// �̼����̸� ���� �� �԰��
		//���׿��� �ȿ� �� ���׿��� ����
		sc.nextLine();
		System.out.println("���̸� �Է��ϼ��� : ");
		int num = sc.nextInt();
		System.out.println("������ �Է��ϼ��� (��/��)");
		char c1 =sc.next().charAt(0);
		String msg2 = num>19?c1=='��'?"�������� ������~":"���������� ������~":17<=num&&num<=19?"����л� �ȵ�":"�� ���� �� �ȵ�"; 
		//char�� �� �´��� Ȯ���� �� ��!!! ��������ǥ ����
		System.out.println(msg2);
		
		
		
	
		
	}
	//��Ʈ����ǽ�
	public void bitOp() {
		//��Ʈ���� �����ϱ�
		//����ҿ� �ִ� ��Ʈ������ ������ �ǹ�
		// A&B : �� ��Ʈ�ڸ����� ���� / �񱳰��� 1,1 �϶��� 1�� ǥ�õ�
		// A|B : �� ��Ʈ�ڸ����� �� / �񱳰��� �ϳ��� 1�̸�  1 ǥ��
		// A^B(XOR) : �� �ڸ����� ������ 0, �ٸ��� 1
		// ~A : 1�϶� 0, 0�϶� 1
		
		int a= 10, b=22;
		String basic ="";
		for (int i = 0;i<32;i++) {
			basic+="0";
		}
		String bit = basic+Integer.toBinaryString(a);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" -> a ��Ʈ��");
		bit = basic+Integer.toBinaryString(b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" -> b ��Ʈ��");
		
		bit = basic+Integer.toBinaryString(a&b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" -> a&b��");
		
		bit = basic+Integer.toBinaryString(a|b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" ->a|b");
		
		bit = basic+Integer.toBinaryString(a^b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" ->a^b");
		
		bit = basic+Integer.toBinaryString(~a);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit +" -> ~a");
		
	}
	
	
	
}





