package com.vari.programstructure;
import java.util.Scanner;
//��� ������ Ŭ����
public class Funcational {
	
	public void inputData() {
		System.out.println("====ȸ������ �Է�====");
		Scanner sc = new Scanner(System.in);
		System.out.print("ȸ�� ���̵� : ");
		String id = sc.nextLine();
		System.out.print("ȸ�� �н����� : ");
		String password = sc.nextLine();
		System.out.print("ȸ�� ���� : ");
		int age = sc.nextInt();
		System.out.print("ȸ�� ���� : ");
		char gender = sc.next().charAt(0);
		
		System.out.println(id+" "+password+" "+age+" "+gender);
	}

}
