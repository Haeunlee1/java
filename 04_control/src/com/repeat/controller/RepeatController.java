package com.repeat.controller;
import java.util.Scanner;
public class RepeatController {
	
	//��� for�� Ȱ������
	
	public void basicFor() {
		//for�� �ۼ��ϱ�
		//for(�ʱ��;���ǽ�;������){�ݺ��� �ڵ� �ۼ�}
		//�ʱ�� : �������� -> �ݺ��� �� ������ �Ǵ� ��
		//���ǽ� : �ݺ��� �ߴ��� �� �ִ� ���� => true�� �ݺ��� ����, false�� �ݺ��� �ߴ�
		//������ : �ʱ�Ŀ��� ������ ������ �����Ű�� ����
		
		//�ȳ��ϼ��並 5�� ����ϼ���
//		for(int i =0; i<5;i++) {
//			System.out.println("�ȳ��ϼ���");
//		}
//		for(int i = 0; i<100; i++) {
//			System.out.println("�ȳ��ϼ���"+i);
//		}
//		//1~50���� ���
//		for(int i = 1; i<=50; i++) {
//			System.out.println(i);
//		}
		
		//1~100������ �� �߿� ¦���� ����ϱ�
		for (int i=1;i<=100;i++) {
		//for(int i =2;i<=100;i+=2)			// �� ���� �� ���ٰ� ����
//			System.out.println(i);
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//1~100���� Ȧ���� ����ϱ�
		for (int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
//		for(int i =1; i<=100;i+=2) {
//			System.out.println(i);
//		}
		
		
		//�л����� �Է¹޾� ����ϴ� ���α׷�(�̸�,����,��)
		//5���� �л��� �Է¹޾� ����ϴ� ���α׷�
		
		//1. scanner����
		//2.
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i<=5;i++) {
//			if(i!=1) {			// nextInt������ ���� ����ֱ� ù��°���
//				sc.nextLine();
//			}
//			System.out.print("�̸��� �Է��ϼ��� :");
//			String name = sc.nextLine();
//			System.out.print("�л� ���� : ");
//			int age = sc.nextInt();
//			System.out.print("�л� �� : ");
//			int grade = sc.nextInt();
//			sc.nextLine();		//���ۺ��� 2��°���
//			System.out.println(name+" "+age+" "+grade);
		}
		
		
		//1���� 50���� �� �߿� ¦���� ¦, Ȧ���� Ȧ ����ϱ�
		
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				System.out.println(i+"= ¦!");
			}else {
				System.out.println(i+"= Ȧ!");
			}
		}
		
		//100���� 1���� ����ϱ�
		for(int i=100;i>=1;i--) {
			System.out.println(i);
			
		}
		
		//for�� Ȱ���ϱ�
		//for���� �ʱ��, ���ǽ�, �������� �� Ȱ���ؾ��ϴ°�
		String msg = "";
		for(;!msg.equals("0");) {		//Ư�����ǿ� ���� �ߴܵǴ� for��
			System.out.println("�Ǵ�?");
			msg=sc.next();
			
		}
		
		for(;;) {			//���ѷ���
			System.out.println("�����̴�!");
		}
	
	}
	
	public void extraFor() {
		Scanner sc= new Scanner(System.in);
		
		//����ڰ� �Է��� ����ŭ �ݺ��ϴ� for�� �����ϱ�
		//�������� �� �� �ִ�! ���
		System.out.print("���� �Է��ϼ���");
		int num = sc.nextInt();
		for (int i = 1;i<=num;i++) {
			System.out.println("�������� �� �� �ִ�! "+ i);
		}
		
		//�л����� �Է¹޾� ����ϴ� ���α׷�
		//5�� �Է¹ޱ�
		// �Է��� �л��� ���� �Է¹ް� �� ����ŭ �л������� ������ϴ� �ý���
		System.out.print("�л� ���� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		String print="";   // ������ ����ϱ� ���� �ʱ�ȭ(������ �־���)
		for(int i =0;i<num1;i++) {
			System.out.print("�л� �̸� : ");
			String name = sc.next();
			System.out.println("�л� ���� : ");
			int age = sc.nextInt();
			sc.nextLine();
			print+= name+" "+age+'\n';		//string print�� ���� �����ϱ�
			
		}System.out.println(print);
		
		//������ �հ�, ����� �����ִ� ���α׷� �ۼ�
		//�л��� �Է¹ް�, �л��� ���� ������ ���� �Է¹ް�
		// �л����� �հ�� ����� ���ϴ� ���α׷� �ۼ�
		
		System.out.print("���� ��� �� �л� �� �Է� : ");
		int number = sc.nextInt();
		int sum=0;
		for (int i = 0;i<number;i++) {
			//int sum=0;		//1. sum�� for������ �����ϸ� ��� ���� ������(+=) / �׷��� for�� �ȿ��� �ٽ� �ʱ�ȭ ���ָ� ����! 
			System.out.println("���� : ");
			sum += sc.nextInt();
			System.out.println("���� : ");
			sum += sc.nextInt();
			System.out.println("���� : ");
			sum += sc.nextInt();
			System.out.println("������ �հ�� : "+sum+" ����� "+sum/3.0);
			sum=0;		//2. for�� ���� ���� ������ ���ְ� for�� ���������� �ʱ�ȭ���൵ ����! 
		}
		
		//���� ������ �� for���� i���� Ȱ���� �� ������?
		//�������� �������� ���� �Ұ�. 
//		for (int i=0;i<5;i++) {
//			int ����+i0; 		// for������ ���� �ٲ�� i�� ������ �� �� ����. ������ ���� �Ұ�!
//		}
		
		
	}
	//���� ���α׷�
	// 1. �ѹ��� �����ϴ� ���� ����� => 2�� �� �Է¹ް�, ������ �Է¹޾Ƽ� ó��
	// 2. ���� �Է��� �� ��ŭ ���ư��� ���� ����� => 1�� �Է°��� �߰������� ����� �� �Է¹ޱ�
	//������Ʈ �ϳ� ����� 
	
	public void calculator1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰� ������ ���ڸ� �Է��ϼ���");
		int num3 = sc.nextInt();
		for (int i=0;i<num3;i++) {
	// ���� ���� ex_calculator�� ����		
		}
	}
	
	//while ���� ����= ���ѹݺ� ��ų ��, Ư�����ǿ� ���� �ݺ����� �������� ��
	public void whileTest() {
		//�⺻ while
		//1~100���� ���
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<100) {
			System.out.println(i+1);
			i++;
		}
		System.out.println("====����====");
		while(true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			System.out.println("������ �Է� : ");
			char op = sc.next().charAt(0);
			System.out.print("���� ���� �Է� : ");
			int num2 = sc.nextInt();
			
			switch(op) {
				case '+' : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case '-' : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case '*' : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case '/' : System.out.println(num+"/"+num2+"="+((double)num/num2)); break;
				default : System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�"); break;
			}
			System.out.println("����� ��� �Ͻðھ��? (1.�� 2.�ƴ�) : ");
			int cho =sc.nextInt();
			if (cho==2) {
				break;
			}
		}
		int cho1 = 1;
		while(cho1==1) {		//
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			System.out.println("������ �Է� : ");
			char op = sc.next().charAt(0);
			System.out.print("���� ���� �Է� : ");
			int num2 = sc.nextInt();
			
			switch(op) {
				case '+' : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case '-' : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case '*' : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case '/' : System.out.println(num+"/"+num2+"="+((double)num/num2)); break;
				default : System.out.println("�����ڸ� �߸� �Է��ϼ̽��ϴ�"); break;
			}
			System.out.println("����� ��� �Ͻðھ��? (1.�� 2.�ƴ�) : ");
			cho1 =sc.nextInt();
		}
		// �żҵ带 ���ǿ� �־ ó���ϴ� ���
		// ������ ������ ������ ��
	
		
		//do while��
		// ������ �ݺ��� �ڵ带 �ѹ� �����ϰ� �� �� ������ ���� ��� �������� ����
		int a =10;
		while(a>10) {
			System.out.println("a : "+a);
		}
		//�ݺ����� �ڵ带 ������ �ѹ��� �����ؾ��� �� (�޴� ���� ���� �� ���)
		do {
			//�ߺ��� �ڵ�
			System.out.println("a : "+a);
		}while (a>10);
	}
	public void doubleForTest() {
		//��ø�ݺ��� Ȱ���ϱ�
		for(int i=0;i<10;i++) {
			System.out.println("�ܰ� : "+i);
			for (int j=0;j<10;j++) {
				System.out.println("���� : "+j);
			}
			System.out.println();
		}
		//������ ���
		for(int i=2;i<10;i++) {
			System.out.println(i+"��");
			for(int j=1;j<10;j++) {
				System.out.println(i+"*"+j+"="+(i*j));
			}
			System.out.println();
		}
		for(int i=0;i<10;i++) {
			for(int j=0;i<10;i++) {
				System.out.println(i+" "+j);
			}
		}
		
		// apple�� �Է¹޾� �� ���ں� �ߺ����� Ȯ��
		Scanner sc = new Scanner(System.in);
		String str = sc.next();   //���ڿ��� ������ �˷��ִ� �żҵ� => str.length();
		for (int i =0; i<str.length();i++) {
			int count =0;
			//System.out.println(str.charAt(i));
			for (int j =0; j<str.length();j++) {
				//System.out.print(str.charAt(j));
				if(i!=j&&str.charAt(i)==str.charAt(j)) {	//i!=j => �ڱ��ڽ��� ����
					count++;
				}
			}System.out.println(str.charAt(i)+" : "+count+"�ߺ�");
		}
		//i=0 �� a�϶� apple �ȿ��� a�� ���� ���� ���� �ֳĸ� apple�� ���� �������� �����ϱ�
		//i=1 �� p�϶� apple �ȿ��� p�� ���� ���� 3��°�� p�̴� �׷��� app�ߺ�!le�ΰ�
		//i=2 �� p�϶� apple �ȿ��� p�� ���� ���� 2��°�� p�̴� �׷��� ap�ߺ�!ple �ΰ�
		// apple�� apple / 2���� apple���� ���ϴ°� �ƴ϶� apple �ȿ��� a�� �ߺ��Ǵ°�, p�� �ߺ��Ǵ°��� ã�� ����1!! ���� �� �ϱ� �ƴϸ� �׸��׷���
		//int count�� ��� �ߺ��ƴ��� ã�� ��
		// �ٽ�Ǯ� �� 1.str������ ���ͷ��� ���س��� �ߺ��� ã�� , 2. str ���� �Է¹ް� �� �߿��� �ߺ��� ã��
		
		
		//�����
		for (int i=0;i<3;i++) {		// �� ^
			for(int j=0;j<3;j++) {   //�� >
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//�б⹮�� ���� �˾ƺ���
	public void breakContinueTest() {
		//�б⹮�� ����Ǵ� ������ �߰��� �ߴܽ�Ű�� ������̴�.
		//break = ����Ǵ� {}������ �ߴ�=> switch / �ݺ���(���ѷ���)���� ���
		//continue = ����Ǵ� {}���� �� continue�� ������ �ǳʶ�
		//break���̳� continue���� �Ϲ������� ���ǹ��� ���� ����
		Scanner sc = new Scanner(System.in);
		//����for������ ������ �ߴܽ�ų �� ���
//		String orderMenu="";
//		while(true) {
//			System.out.println("====�����ֹ� ���α׷�====");
//			System.out.println("1. ȸ");
//			System.out.println("2. �����");
//			System.out.println("3. ������");
//			System.out.println("4. ������ġ");
//			System.out.print("�Է� : ");
//			int cho = sc.nextInt();
//			switch(cho) {
//				case 1: orderMenu+="ȸ\n"; break;
//				case 2: orderMenu+="�����\n"; break;
//				case 3: orderMenu+="������\n"; break;
//				case 4: orderMenu+="������ġ\n"; break;
//			}
//			System.out.println("��� �ֹ��Ͻðڽ��ϱ�? (Y/N)");
//			char answer = sc.next().charAt(0);
//			if(answer=='N') {
//				System.out.println("�ֹ����� ====");
//				System.out.println(orderMenu);
//				break;
//			}
//			
//		}///while����
//		System.out.println("�ֹ����α׷� ����");
		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
				
			}System.out.println(i);
		}
		for(int i =2; i<10;i++) {
//			if(i%2==1) {			//¦���ܸ� ��� ��
//				continue;
//			}
			System.out.println(i+"�� ���?(1.�� 2.�ƴ�)");
			if(sc.nextInt()==2) {
				continue;
			}
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		//���� for������ break��
		//����for���� break���� ������ for���� ����
		//�ܺ�for������ �����Ű���� �̸��� �ִ� break;
		gugu:	// for���� �̸��� �ο��� ��
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j>5) {
					break;
					//break gugu; => �̸��ִ� break�� 
				}
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		//���ڿ��� �Է� �ް� ���ڿ� ������ �ߺ����� ������ �ߺ��� �߻�! �� ����ϰ� �ߴܽ�Ű�� ������ �ߺ��� ���� ���
		System.out.print("���ڿ� �Է� : ");
		String str = sc.next();
		boolean flag = false;
		stop:
		for (int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			for(int j=0;j<str.length();j++) {
				System.out.print(str.charAt(j));
				if(i!=j&&str.charAt(i)==str.charAt(j)) {
					System.out.print("�ߺ����߻�! ");
				    flag=true;
					break stop;
				}						// if���� �ߺ��������� ���� �Ǹ� for�� �ȿ� �ִ� �Ŷ� �ߺ��������� ��~�� ��µ�
				
			}System.out.println();
		}
		System.out.println(flag?"":"�ߺ��� ����");
	}
	
	
	
	
}
