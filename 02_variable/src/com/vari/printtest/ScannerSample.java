package com.vari.printtest;

import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//학생 정보를 입력하고 출력
		//학생정보 -> 이름, 나이, 성별, 주소, 학년, 키
//		System.out.println("===학생정보 입력 프로그램===");
//		System.out.println("당신의 이름을 입력하세요");
//		String name = sc.nextLine();
//		System.out.println("당신의 나이를 입력하세요");
//		int age = sc.nextInt();
//		System.out.println("당신의 성별을 입력하세요");
//		sc.nextLine();   // Line값 입력받기 전에 버퍼 초기화 해야함
//		String gender = sc.nextLine();
//		//sc.nextLine(); 을 여기서 해버리면 gender로 받은 값이 날라감 => \n만 남았을 때 변수지정 없이 sc.nextLine();을 했으니까
//		System.out.println("당신의 주소를 입력하세요");
//		String addr = sc.nextLine();
//		System.out.println("당신의 학년을 입력하세요");
//		int grade = sc.nextInt();
//		sc.nextLine();
//		System.out.println("당신의 키를 입력하세요");
//		double height = sc.nextDouble();
//		System.out.println("학생정보 \n이름 : "+name+"\n나이 : "+age+"\n성별 : "+gender+"\n주소 : "+addr+"\n학년 : "+grade+"\n키 : "+height);
//		//printf로도 써보기
		
		
		//단일문자 입력받기 -> char형
		// Scanner에서 char를 입력받는 메소드는 없음 String이 제공하는 메소드를 통해 한개의 문자만 가져올 수 있음 => .charAt();
		char first = "ABC".charAt(0);
		System.out.println("first = "+first);
		String name1 = "이하은";
		first = name1.charAt(1);
		System.out.println("first = "+first);
		
		//Scanner를 통해 입력받은 값을 char형으로 가져오려면
		System.out.println("key 값을 입력하세요");
		char key = sc.nextLine().charAt(0); // key의 데이터타입을 string이 아닌 char로 해야함 / 여러글자를 입력해도 인덱스0번째글자만 받음
		//key = sc.next().charAt(1);
		System.out.println(key);
		// key를 숫자로 바꾼다
		System.out.println((int)key);
		
		
		
	}
}
