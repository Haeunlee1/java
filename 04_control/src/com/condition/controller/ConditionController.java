package com.condition.controller;
import java.util.Scanner;


public class ConditionController {
	//�⺻ if Ȱ���ϱ�
	public void ifTest() {
		//�⺻ if�� Ȱ��
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		//�Է°��� ����� ����Դϴ� ���, �ƴϸ� �ƹ��͵� ��������
		int i = sc.nextInt();
		//���׿�����
		System.out.println(i>0?"����Դϴ�":"");
		
		if(i>0) {
			System.out.println("����Դϴ�");
			//�������� ����?
			String name = "�Ǵ�?";  //if���� ������ ������ �ܺο��� ����� �� ���� ( �������� ������)
			System.out.println(name);
			System.out.println("�̸��� : ");
			String email=sc.next();
		}
		
		//�̸��� �Է¹ް� �ڽ��� �̸��� ������ �̸��� �ԷµǸ� ���� �ڵ��� ���� �� �ִ� �� ���, �ٸ��̸��̸� �ƹ��͵� ��������
		
		System.out.println("�̸���? : ");
		sc.nextLine();
		String name = sc.nextLine();
		if (name.equals("������")) {
			System.out.println("���� �ڵ��� �� �� �� �ִ�.");
		}
		//������ ������ �Է¹ް� ����� 60���̻��̸� �հ��Դϴ� ���
//		System.out.print("�������� : ");
//		int a = sc.nextInt();
//		System.out.print("�������� : ");
//		int b = sc.nextInt();
//		System.out.print("�������� : ");
//		int c = sc.nextInt();
//		if((a+b+c)/3>=60) {
//			System.out.println("�հ��Դϴ�.");
//		}
		
		System.out.print("�������� : ");   //���տ����� �̿��� ���� �ϳ��� ����
		int total=sc.nextInt();			// �� ���� ������ ������ �ʿ䰡 ���� => ������ ����� ���Ұű� ��������
		System.out.print("�������� : ");
		total+=sc.nextInt();
		System.out.print("�������� : ");
		total+=sc.nextInt();
		System.out.println("�� �� : "+total);
		
		if(total/3.0>=60) {		// /3.0�ϴ� ������? �Ҽ����ڸ��� ������ �ϱ� ���� double���� �Է�
			System.out.println("�հ��Դϴ�.");
		}
		
		//���� �� ���� �Է¹ް� ������ ¦���� ¦����, 
		System.out.print("���� �Է� : ");
		i = sc.nextInt();
		if(i%2==0) {
			System.out.println("¦����");
		}
		
		//���̵�� �н����带 �Է¹޾� ���̵� admin, �н����尡 admin�϶� �α��μ���
		
		System.out.println("���̵� �Է� : ");
		String id = sc.next();
		System.out.println("�н����� �Է� : ");
		String password = sc.next();
		
		if(id.equals("admin")&&password.equals("admin")) {
			System.out.println("�α��� ����");
		}
		
		
		
	}
		
	public void ifelseTest() {
		//if~else���� �Ѱ��� �׷�.
		//else������ �տ� if���� ������ ���Ұ�
		//if else���� ���ǿ� ���� �ݵ�� �� �� �ϳ��� ����ȴ�
		
		//�Է¹��� ���� ����� ����Դϴ�, ������ �����Դϴ� ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("����Դϴ�.");
		}else {
			System.out.println("�����Դϴ�.");
		}
		
		//else ���� ���� ���Ұ� �� if�� ���� �����
		
		//���� ���� �Ұ����� ��������
		// �ڵ��� �� �� ���ǿ� ���� ���� �� �����ϱ� !!!! ������ ����?? ��ư �׷��� �� �߿���
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		if(age>19) {
			System.out.println("���԰���");
			System.out.println("====ȸ������====");
			System.out.print("���̵� : ");
			String id = sc.next();
			System.out.print("�н����� : ");
			String pw = sc.next();
			System.out.print("�г��� : ");
			String nickName = sc.next();
			System.out.printf("���̵� %s, �н����� %s, �г��� %s",id,pw,nickName);
		}else {
			System.out.println("���ԺҰ���");
		}
		//if���� �ΰ� ����ϴ� �Ͱ� else�� ���̴�? 
		//if�� ���� �����̴� 
	}		
	
	public void ifelseifTest() {	
		//������ �Է¹޾� �Է¹��� ������ ���� a,b,c,d,f ��� ������
		//a = 90�̻� b=80~89 c=79~70 d= 69~60 f=60�̸�
		
		// ���� �Է� ���� �� ��տ� ���� ��޺ο�
		//100~90 :��
		//89~80 : ��
		//79~70 : ��
		//69~60 : ��
		// ������ : ��
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �Է� : ");
		double avg = sc.nextDouble();
		String grade;
		if(avg>=90) {
			grade ="��";
		}else if(avg>=80) {		//(avg<=100&&avg>=)%%avg>=80 ��ȣ�� �����Ȱ�. �������� ������ 
			grade ="��";
		}else if(avg>=70) {
			grade = "��";
		}else if(avg>=60) {
			grade = "��";
		}else {
			grade = "��";
		}
		System.out.println(grade);
		
		//���� if���� ���� �� ����ϴ°� �����ϱ� (elseif�� ����if�� ����)
		
		//���ɺ� �޼��� ����ϱ�
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		if(age>=50) {
			System.out.println("������ ���ؾ���");
			System.out.println("���ֵ麸��");
		}else if(age>40) {
			System.out.println("������ ���ؾ���");
			System.out.println("�ڽĵ� ������");
		}else if(age>=30) {
			System.out.println("������ ���ؾ���");
			System.out.println("��ȥ����");
		}else if(age>=20) {
			System.out.println("������ �����ؾ���");
			System.out.println("�������");
		}else {
			System.out.println("������ �����ؾ���");
			System.out.println("���� ���� ����");
		}
		
		
		//���̵��ϰ� �н����� �Է¹ް�
		//���̵� user01 ��� user01 �α��μ���
		// ���̵� user01 ��� user01 �н����� Ʋ��
		// ���̵� user01�ƴϰ� ��� user01 ���̵�Ʋ��
		// ���̵�, ��� user01�� �ƴ�  �Ѵ� ��� Ʋ���ϴ�.
		
		String id = "user01";
		String pw = "user01";
		System.out.print("���̵� �Է��ϼ��� : ");
		String a = sc.next();
		System.out.print("�н����带 �Է��ϼ��� : ");
		String b = sc.next();
		
		if(a.equals(id)&&b.equals(pw)) {
			System.out.println("�α��� ����");
		}else if(a.equals(id)&&!b.equals(pw)) {
			System.out.println("�н����尡 Ʋ���ϴ�");
		}else if(!a.equals(id)&&b.equals(pw)) {
			System.out.println("���̵� Ʋ���ϴ�");
		}else {
			System.out.println("��� Ʋ�Ƚ��ϴ�.");
		}
		
	}
	public void doubleifTest() {
		//��øif��
		// �������ǿ� ���� �����ϰ� �� �ȿ��� if�� �ٽ� ���
		//���̰� �����̸鼭 ������ �׳�ȸ������, �ܱ����� �ܱ��ε�Ϲ�ȣ
		//������ �ƴϸ� ������ �� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====khŬ�� ȸ������====");
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		if(age>=20) {				// if�������� ���� �����̸� ����� �����ϴ� ��? ���ǹ��� true�� false�� ����� ���� ������ elseif�� ������ �������� ����. �������� �ʴ´�.
			System.out.print("1. ������, 2. �ܱ��� :  ");
			String choice = sc.next();
			if(choice.equals("1")) {
				System.out.println("ȸ�������� �����մϴ�");
				System.out.print("�̸� : ");
				sc.nextLine();
				String name = sc.nextLine();
				
			}else if(choice.equals("2")){
				System.out.println("�ܱ��� ��Ϲ�ȣ (1.�ִ� 2.����) : ");
				int n = sc.nextInt();
				if(n==1) {
					System.out.print("�ܱ��� ��Ϲ�ȣ �Է� : ");
					int num = sc.nextInt();
					System.out.println("ȸ�������� �����մϴ�");
					System.out.print("�̸� : ");
					sc.nextLine();
					String name = sc.nextLine();             // ��������!! ������!! 
				}else {
					System.out.println("�ܱ��� ��Ϲ�ȣ ��� �� �и� ȸ������ �����մϴ�.");
				}
			}else {
				System.out.println("�߸� �����̽��ϴ�.");
			}
		}else {
			System.out.println("ȸ�������� �Ұ��մϴ�.");
		}
		
	}
	
	//switch ��
	public void switchTest() {
		//switch���� ���ǹ����� ����Ǵ� ���� ���� �б�ó���ϴ� ���
		// ����� ����
		Scanner sc = new Scanner(System.in);
		System.out.println("====������ ����====");
		System.out.println("1.�Ľ�Ÿ 2.����Ұ�� 3.������ġ 4.�ø�");
		int choice =sc.nextInt();    //���ǹ��� ���鶩 ��������� ���� �Է��ϴ� ���̽��� �����ؾ��� (=default / else)
		switch (choice) {
			case 1 : System.out.println("�����ϳ�~"); break;  
			case 2 : System.out.println("��!��!"); break;
			case 3 : System.out.println("������ ������"); break;
			case 4 : System.out.println("���� ����"); break;
			default : System.out.println("����� ��� ");break;
		}
		
		//switch(���)�ȿ� �� �� �ִ� ����?
		//����, ���ڿ�
		//case�� ������Ÿ�� ���缭 ����
		String name =sc.next();
		switch(name) {
			case "�Ľ�Ÿ" : System.out.println("���� �԰�;�"); break;
			case "����Ұ��" : System.out.println("�Ĵ����� ���碌");break;
		}
		//char ����?
		System.out.println("��.�ڹ� ��.����Ŭ ��.htmlcss");
		char cho = sc.next().charAt(0);
		switch(cho) {		// case�� �鿩���� ���ֱ�~~
			case '��' : System.out.println("�ڹٴ� ���� ��� ���ϰ� �ʹ�");break;
			case '��' : System.out.println("����Ŭ�� db");break;
			case '��' : System.out.println("html / css ȭ�鱸��"); break;
		}
		
		//boolean �� => �Ұ���
//		int su = 100;
//		switch(su>50) {
//			case true : break;
//			case false : break;
//		}
		
		//�Ǽ��� => �Ұ���
//		double dnum=3.14;
//		switch(dnum) {
//		
//		}
		int num = 100;
		switch(num%5) { //(num%5==0)���� boolean���� �� �ȴ�!!!!! 
		
		}
		
		//break�� ����ϴ°� why?
		//break ���� ������ �ش� case���� ������ case���� �� ���� ��
		
		System.out.println("������ ���ɸ޴�");
		System.out.print("1.������, 2.����, 3.«��, 4.���");
		int cho2=sc.nextInt();
		switch(cho2) {
			case 1 : 
				System.out.println("�������� �ſ�");
//				ifTest();    // ���� Ŭ������ �ִ� �޼ҵ� ȣ��
//				new OtherTest().test();    //�ٸ� Ŭ������ �ִ� �޼ҵ� ȣ��
				System.out.println("��ȭ��Ǫ����");break;
			case 2 : System.out.println("���ڴ� ġ��������");
			case 3 : System.out.println("�߱��� ����");
			case 4 : System.out.println("����� ������");
			default : System.out.println("����� ��� ^^ ");
		}
		
		
	}
	
	
	

}
