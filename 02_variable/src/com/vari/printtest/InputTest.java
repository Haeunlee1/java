package com.vari.printtest;

import java.util.Scanner;

public class InputTest {
	
	//키보드에서 입력한 값 가져오기
	
	public static void main(String[] args) {
		// 키보드에 입력한 값 ram에 저장하기
		// 자바에서 제공하는 Scanner를 이용한다
		// java.unil 패키지에 속해있음
		// 1.  java.util.Scanner를 import한다
		
		// 2. 클래스를 사용하려면 반드시 new를 이용하여 생성자 호출(인스턴스 만들기)
		//Scanner sc = new Scanner(System.in);
		
		// 3. Scanner가 제공하는 기능(매소드)을 이용해서 키보드의 입력값을 가져온다.
		// 3. Scanner가 제공하는 기능(매소드)을 이용해서 키보드의 입력값을 가져온다.		
		// nextInt(), nextDouble(), next(), nextLine();
		// nextInt() : int타입의 값을 가져오기
		// nextDouble() : Double 값
		// next(): 문자열을 가져옴  => 띄어쓰기를 기준으로 가져옴  
		// nextLine() : 문자열을 가져옴  => 줄바꿈(개행)앞의 문자열 가져옴
//		System.out.print("당신의 나이를 입력하세요.");
//		int age = sc.nextInt();
//		System.out.print("당신의 키를 입력하세요 : ");
//		double height = sc.nextDouble();
//		System.out.println("입력값 : " +age +" "+ height);
		
		
		//문자열 입력받기
//		System.out.print("당신의 주소를 입력하세요 : ");
//		String name = sc.next();
//		sc.nextLine();
//		System.out.println("next() : "+name);
//		
//		name = sc.nextLine();
//		System.out.println("당신의 주소는 "+name);
//		
		
		//정수 nextInt, 실수 nextDouble, 문자(next();)를 입력 받고 nextLine()을 입력받을 경우 buffer를 비워줘야함 
		// 저 3개의 매소드는 \n값이 자동으로 남게 됨 그래서 sc.nextLine()으로 한번 넘겨줘야함
		//buffer는 input 전의 값? 그래서 sc.nextLine()응 해줘야함
//		System.out.println("당신의 나이는?");
//		int age = sc.nextInt();
//		System.out.println("당신의 주소는?");
//		sc.nextLine();   // 버퍼를 비우는 것 
//		String add = sc.nextLine();
//		System.out.println("나이: "+age+"주소 :"+add);
		
		
		
		//나이를 입력받고 출력 그리고 이름 입력받고 출력
		System.out.println("안녕하세요");
		System.out.println("당신의 나이는? ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("당신의 나이 현재"+age+"살 입니다.");
		System.out.println("당신의 키는? ");
		double height = sc.nextDouble();
		System.out.println("당신의 키는 "+height+"cm 입니다.");
		System.out.println("당신의 이름은 ? ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("당신의 이름은 "+name+"입니다.");
		
		
		
	}

}
