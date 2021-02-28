package com.vari.programstructure;
import java.util.Scanner;
//기능 제공형 클래스
public class Funcational {
	
	public void inputData() {
		System.out.println("====회원정보 입력====");
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 아이디 : ");
		String id = sc.nextLine();
		System.out.print("회원 패스워드 : ");
		String password = sc.nextLine();
		System.out.print("회원 나이 : ");
		int age = sc.nextInt();
		System.out.print("회원 성별 : ");
		char gender = sc.next().charAt(0);
		
		System.out.println(id+" "+password+" "+age+" "+gender);
	}

}
