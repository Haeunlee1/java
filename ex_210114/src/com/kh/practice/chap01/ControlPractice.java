package com.kh.practice.chap01;
import java.util.Scanner;
public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("===�޴�����===");
		System.out.println("1.�Է�"+"\n"+"2.����"+"\n"+"3.��ȸ"+"\n"+"4.����"+"\n"+"7.����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1 : System.out.println("�Է� �޴��Դϴ�."); break;
			case 2 : System.out.println("���� �޴��Դϴ�."); break;
			case 3 : System.out.println("��ȸ �޴��Դϴ�."); break;
			case 4 : System.out.println("���� �޴��Դϴ�."); break;
			case 7 : System.out.println("���� �޴��Դϴ�."); break;
			default : System.out.println("�˸��� ���ڸ� �Է��ϼ���");
		}
	
	}
	public void practice2() {
		System.out.println("===����� Ȧ¦Ȯ��===");
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		if(num>0) {
			if(num%2==0) {
				System.out.println("¦����");
			}else {
				System.out.println("Ȧ����");
			}
		}else {
			System.out.println("����� �Է����ּ���");
		}
		
	}
	public void practice3() {
		System.out.println("===���� �հ�Ȯ��===");
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		System.out.print("�������� : ");
		int math = sc.nextInt();
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		int sum = kor+eng+math;
		if(kor>=40&&eng>=40&&math>=40&&(sum/3.0)>=60) {
			System.out.println("���� : "+kor);
			System.out.println("���� : "+math);
			System.out.println("���� : "+eng);
			System.out.println("�հ� : "+sum);
			System.out.println("��� : "+(sum/3.0));
			System.out.println("�����մϴ�, �հ��Դϴ�!");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		System.out.println("===��������ϱ�===");
		System.out.print("1~12 ������ ���� �Է� : ");
		int month = sc.nextInt();
		switch(month) {
			case 1: case 2: case 12 :
				System.out.println(month+"���� �ܿ��Դϴ�.");break;
			case 3: case 4: case 5 :
				System.out.println(month+"���� ���Դϴ�.");break;
			case 6: case 7: case 8 :
				System.out.println(month+"���� �����Դϴ�.");break;
			case 9: case 10: case 11 :
				System.out.println(month+"���� �����Դϴ�.");break;
			default : 
				System.out.println(month+"���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	public void practice5() {
		String id = "user001";
		String pw = "aa123";
		System.out.println("===�α��� ����===");
		System.out.print("���̵� : ");
		String inputId = sc.next();
		System.out.print("��к�ȣ : ");
		String inputPw = sc.next();
		
		if(inputId.equals(id)&&inputPw.equals(pw)) {
			System.out.println("�α��� ����");		
		}else if(inputId.equals(id)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(inputPw.equals(pw)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else {
			System.out.println("���̵�� ��й�ȣ�� Ȯ���Ͽ��ֽʽÿ�.");
		}
			
	}
	public void practice6() {
		System.out.println("===��޺� ����Ȯ��===");
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� (������/ȸ��/��ȸ��) : ");
		String grade = sc.next();
		switch (grade) {
			case "������" : 
				System.out.println("ȸ�� ����, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
			case "ȸ��" : 
				System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�"); break;
			case "��ȸ��" : 
				System.out.println("�Խñ� ��ȸ"); break;
			default : 
				System.out.println("�ùٸ� ����� �Է����ּ���.");
		}
	}
	public void practice7() {
		System.out.println("===�ιٵ� ����===");
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI���� : "+bmi);
		if(bmi<18.5) {
			System.out.println("��ü��");		
		}else if(bmi<23) {
			System.out.println("����ü��");
		}else if(bmi<25) {
			System.out.println("��ü��");
		}else if(bmi<30) {
			System.out.println("��");
		}else{
			System.out.println("�� ��");
		}
		
	}
	public void practice8() {
		System.out.println("===�����ϱ�===");
		System.out.print("�ǿ�����1 �Է� : ");
		int num = sc.nextInt();
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		System.out.println("������ �Է� (+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		if(num>0&&num2>0) {
			switch(op) {
				case '+' : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case '-' : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case '*' : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case '/' : System.out.println(num+"/"+num2+"="+((double)num/num2)); break;
				case '%' : System.out.println(num+"%"+num2+"="+(num%num2)); break;
				default : System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}

	}
	
	public void practice9() {
		System.out.println("===pass,failȮ���ϱ�===");
		System.out.print("�߰� ��� ���� : ");
		int first = sc.nextInt();
		first *=0.2;
		System.out.print("�⸻ ��� ���� : ");
		int second = sc.nextInt();
		second *=0.3;
		System.out.print("���� ���� : ");
		int homework = sc.nextInt();
		homework *=0.3;
		System.out.print("�⼮ Ƚ�� : ");
		int check = sc.nextInt();
		int sum = first+second+homework+check;
		System.out.println("==========���==========");
		if(sum>=70&&check>20-(20*0.3)) {
			System.out.println("�߰� ��� ����(20) : "+(double)first);
			System.out.println("�⸻ ��� ����(30) : "+(double)second);
			System.out.println("���� ����    (30) : "+(double)homework);
			System.out.println("�⼮ ����    (20) : "+(double)check);
			System.out.println("���� : "+(double)sum);
			System.out.println("PASS!!!!");
		}else if(check<=20-(20*0.3)) {
			System.out.println("FAIL [�⼮ Ƚ�� ���� "+check+"/20)]");
		}else if(sum<70){
			System.out.println("�߰� ��� ����(20) : "+(double)first);
			System.out.println("�⸻ ��� ����(30) : "+(double)second);
			System.out.println("���� ����    (30) : "+(double)homework);
			System.out.println("�⼮ ����    (20) : "+(double)check);
			System.out.println("���� : "+(double)sum);
			System.out.println("FAIL [���� �̴�]");
		}
		
	}
	public void practice10() {
		System.out.println("====���α׷� �����ϱ�====");
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");
		int choice = sc.nextInt();
		switch (choice) {
			case 1 : practice1(); break;
			case 2 : practice2(); break;
			case 3 : practice3(); break;
			case 4 : practice4(); break;
			case 5 : practice5(); break;
			case 6 : practice6(); break;
			case 7 : practice7(); break;
			case 8 : practice8(); break;
			case 9 : practice9(); break;
			default : System.out.println("�ùٸ� ��ȣ�� �Է��ϼ���");
		}
		
	}
	
	public void practice11() {
		System.out.println("===��й�ȣ �����===");
		System.out.print("��й�ȣ �Է� : ");
		String pw = sc.next();
		if(pw.length()<5) {
			System.out.println("���� ����");
		}else if(pw.charAt(0)==0) {
			System.out.println("1~9������ ������ �Է��ϼ���");
		}else {
			System.out.println("�ڸ��� �� ����");
		}
		
	}
	
}
