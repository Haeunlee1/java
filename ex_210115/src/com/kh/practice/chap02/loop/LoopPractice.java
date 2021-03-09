package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("===�����Է��ϱ�===");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");
			}
		}else{
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		}System.out.println();
	}
	
	public void practice2() {
		System.out.println("===�����Է��ϱ�2===");
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			if(num>0) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
				}
				break;
			}else{
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			}
		}System.out.println();
		
	}
	public void practice3() {
		System.out.println("===���� �Ųٷ� ����ϱ�===");
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���. : ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i=num;i>0;i--) {
				System.out.print(i+" ");
			}
		}else{
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		}
		System.out.println();
	}
	public void practice4() {
		System.out.println("===���� �Ųٷ� ����ϱ�2===");
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
			int num = sc.nextInt();
			if(num>0) {
				for(int i=num;i>0;i--) {
					System.out.print(i+" ");
				}
				break;
			}else{
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
			}
		
		}System.out.println();
	}
	
	public void practice5() {
		System.out.println("===�������� �� ���===");
		System.out.print("������ �ϳ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		int i;
		for(i=1;i<num;i++) {
			sum+=i;
			System.out.print(i+"+");
		}
		System.out.println(i+"="+(sum+i));
		
	}
	
	public void practice6() {
		System.out.println("===�� ���� �� ������ ���� ���===");
		System.out.print("ù ��° ���� : ");
		int num = sc.nextInt();
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		if(num<1||num2<1) {
			System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
		}else if(num>num2){
			for(int i=num2;i<=num;i++) {
				System.out.print(i+" ");
			}
		}else {
			for(int i=num;i<=num2;i++) {
				System.out.print(i+" ");
			}
		}System.out.println();
		
	}
	public void practice7() {
		System.out.println("===�� ���� �� ������ ���� ���2===");
		while(true) {
			System.out.print("ù ��° ���� : ");
			int num = sc.nextInt();
			System.out.print("�� ��° ���� : ");
			int num2 = sc.nextInt();
			if(num<1||num2<1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			}else if(num>num2){
				for(int i=num2;i<=num;i++) {
					System.out.print(i+" ");
				}
			}else {
				for(int i=num;i<=num2;i++) {
					System.out.print(i+" ");
				}break;
			}System.out.println();
		}
	}
	
	public void practice8() {
		System.out.println("===������ ���===");
		System.out.print("���� : ");
		int num = sc.nextInt();
		System.out.println("====="+num+"��=====");
		for(int j=1;j<10;j++) {
			System.out.println(num+"*"+j+"="+(num*j));
		}
		
	}
	public void practice9() {
		System.out.println("===������ ���2===");
		System.out.print("���� : ");
		int num = sc.nextInt();
		if(num<10) {
			for(int i=num;i<10;i++) {
				System.out.println("===== "+i+"��=====");
				for(int j=1;j<10;j++) {
					System.out.println(i+"*"+j+"="+(num*j));
				}
			}
		}else {
		System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice10() {
		System.out.println("===������ ���3===");
		
		while(true) {
			System.out.print("���� : ");
			int num = sc.nextInt();	
			if(num<10) {
				for(int i=num;i<10;i++) {
					System.out.println("===== "+i+"��=====");
					for(int j=1;j<10;j++) {
						System.out.println(i+"*"+j+"="+(num*j));
					}
				}break;
			}else {
			}System.out.println("9 ������ ���ڸ� �Է����ּ���.");
		}
	}
	
	public void practice11() {
		System.out.println("===���� �Է�===");
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.print(num+" ");
			num+=num2;
		}
		System.out.println();
	}
	public void practice12() {
		System.out.println("===�����ڰ��===");
		while(true) {
			System.out.print("������(+, -, *, /, %) : ");
			String op = sc.next();
			if(op.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�");
				break;
			}
			System.out.print("����1 : ");
			int num = sc.nextInt();
			System.out.print("����2 : ");
			int num2= sc.nextInt();
			switch(op) {
				case "+" : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case "-" : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case "*" : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case "/" : 
					if(num2==0) {
						System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���."); break;
					}else {
						System.out.println(num+"/"+num2+"="+(num/num2)); break;
					}
				case "%" : System.out.println(num+"%"+num2+"="+(num%num2));break;
				default : System.out.println("���� �������Դϴ�. �ٽ��Է����ּ���."); break;
			}
			
		}
	}
	public void practice13() {
		System.out.println("===�����===");
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	public void practice14() {
		System.out.println("===�����2===");
		System.out.println("���� �Է� : ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}System.out.println("");
		}//System.out.println("");
	}
	
//	public void practice15() {
//		//1. ���� �Է¹ޱ�
//		//2. �Ҽ����� �ƴ��� �Ǻ�/
//		//3. 2���� ������ �߸��Է� ���
//		boolean b= true;
//		System.out.println("=====�Ҽ��Ǻ�=====");
//		System.out.print("���� : ");
//		int num = sc.nextInt();				//���� �Է¹ޱ�
//		if(num<2) {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�");		//�Է°��� 2���� ������ ���
//		}else {
//			for(int i=2;i<=num;i++) {
//				b=true;						//�Ҽ��� 1�� �ڱ��ڽ��� ����� ������ i�� num�϶����� for�� ������
//				for(int j=2; j<i;j++) {		//1���� num���� ������ �� 1�̶� num�϶��� 0�� ������ �� �ܿ� �� 0���� �������� �ȵ� / j�� i�Ǳ� ������ ������
//					if(num%i==0) {			//j�� i���� �������� i~num������ ����� ������ �� 0�� ������ ����� �ִٴ� ���̴� �׷��� �Ҽ��� �ƴϴ� ���!
//						b=false;
//						break;
//					}
//				}
//
//			}
//		}
//		System.out.println(b?"�Ҽ��Դϴ�.":"�Ҽ��� �ƴմϴ�.");
//	}
//
//	public void practice16() {
//		while(true) {
//			System.out.println("=====�Ҽ��Ǻ�=====");
//			System.out.print("���� : ");
//			int num = sc.nextInt();				//���� �Է¹ޱ�
//			if(num<2) {
//				System.out.println("�߸� �Է��ϼ̽��ϴ�");		//�Է°��� 2���� ������ ���
//			}else {
//				for(int i=2;i<=num;i++) {		//�Ҽ��� 1�� �ڱ��ڽ��� ����� ������ i�� num�϶����� for�� ������
//					for(int j=2; j<i;j++) {		//1���� num���� ������ �� 1�̶� num�϶��� 0�� ������ �� �ܿ� �� 0���� �������� �ȵ� / j�� i�Ǳ� ������ ������
//						if(num%i==0) {			//j�� i���� �������� i~num������ ����� ������ �� 0�� ������ ����� �ִٴ� ���̴� �׷��� �Ҽ��� �ƴϴ� ���!
//							System.out.println("�Ҽ��� �ƴմϴ�");
//							break;
//						}else {
//							System.out.println("�Ҽ��Դϴ�.");
//							return;
//						}
//					}
//
//				}
//			}
//		}
//		
//	}
	
	public void practice17() {
		//�Ҽ��� ������ ���϶�
		System.out.print("�� �Է� : ");
		int cho=sc.nextInt();
		boolean flag = true;		//�⺻������ ��� ���� �Ҽ���� �����ϱ� 
		if(cho<2) {
			System.out.println("�߸��Է��ϼ̽��ϴ�");
		}else {
			//5 �Է½� -> 1 �Ҽ���? 2 �Ҽ���? 3 �Ҽ���? 4 �Ҽ���? 5 �Ҽ���? ��� ��������ϴ� ��
			int prime=0;
			String primen="";
			for(int i=2;i<=cho;i++) {
				flag=true;
				for(int j=2;j<i;i++) {
					if(cho%i==0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					prime++;
					primen+=i+" ";
				}
			}
			System.out.println(prime);
			System.out.println("�Ҽ��� ���� : "+primen);
		}
		
	}
	
	public void practice18() {
		//�ڿ��� �Է¹ޱ�
		System.out.print("�ڿ��� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		for(int i=2; i<=num;i++) {
			if(i%2==0||i%3==0) {
				System.out.print(i+" ");
			}
		}
		int count=0;
		for(int i=2;i<=num;i++) {
			if(i%2==0&&i%3==0) {
				count++;
			}
		}
		System.out.println();
		System.out.print("count : "+count);
		
		
	}
	
	
	public void practice19() {
		System.out.print("�����Է� : ");
		int k=0;
		int num = sc.nextInt();
		for(int j=0;j<num;j++) {
			for(int m=num-1;m>j;m--) {
				System.out.print(" ");
			}
			for(int i=0;i<=k;i++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
		
	}
	
	public void practice20() {
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		int k=0;
		for(int i=0; i<num*2;i++) {
			for(int j=0;j<k;j++) {
				System.out.print("*");
			}System.out.println();
			if(i<num) {
				k++;
			}else {
				k--;
			}
		}
	}
}
