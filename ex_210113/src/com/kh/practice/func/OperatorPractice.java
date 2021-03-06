package com.kh.practice.func;
import java.util.Scanner;
public class OperatorPractice {
	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====양수 확인=====");
		System.out.print("정수 : ");
		int i = sc.nextInt();
		System.out.println(i>=0?"양수다":"양수가 아니다");
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====양수, 음수 확인=====");
		System.out.print("정수 : ");
		int i = sc.nextInt();
		System.out.println(i>0?"양수다":i==0?"0이다":"음수다");
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====짝수, 홀수 확인=====");
		System.out.print("정수 : ");
		int i = sc.nextInt();
		System.out.println(i%2==0?"짝수다":"홀수다");
		
		}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====사탕 나누기=====");
		System.out.print("인원 수? : ");
		int i = sc.nextInt();
		System.out.print("사탕 개수? : ");
		int j = sc.nextInt();
		System.out.println("1인당 사탕 개수 : "+(j/i));
		System.out.println("남는 사탕 개수 : "+(j%i));
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====정보입력=====");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) :" );
		int grade = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int gradeClass = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점아래둘째자리까지) : ");
		double level = sc.nextDouble();
		String result = gender=='M'?"남학생":"여학생";
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade, gradeClass, num, name, result, level);
		System.out.println();
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====연령확인=====");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		System.out.println(age<=13?"어린이":(13<age&&age<20)?"청소년":"성인");
		
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====국영수 합계와 평균구하기=====");
		System.out.print("국어 : ");
		int a = sc.nextInt();
		System.out.print("영어 : ");
		int b = sc.nextInt();
		System.out.print("수학 : ");
		int c = sc.nextInt();
		int sum = a+b+c;
		int avr = (a+b+c)/3;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avr);
		System.out.println((a>=40&&b>=40&&c>=40)&&avr>=60?"합격":"불합격");
		
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====성별구분=====");
		System.out.print("주민번호를 입력하세요 (-포함) : ");
		char gender = sc.next().charAt(7);
		System.out.println((gender=='1'||gender=='3')?"남자":"여자");
		
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====정수 비교=====");
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int input = sc.nextInt();
		System.out.println(input<=num1||input>num2);
		
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====3개의 수 입력=====");
		System.out.print("입력1 : ");
		int a = sc.nextInt();
		System.out.print("입력2 : ");
		int b = sc.nextInt();
		System.out.print("입력3 : ");
		int c = sc.nextInt();
		System.out.println(a==b&&b==c);
		
	}
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=====연봉을 입력하세요=====");
		System.out.print("A사원의 연봉 : ");
		int a = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int b = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int c = sc.nextInt();

		System.out.printf("A사원 연봉/연봉+a : %d/%.1f",a,(double)(a*=1.4));
		System.out.println();
		System.out.println(a>=3000?"3000 이상":"3000 미만");
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f",b,(double)(b));
		System.out.println();
		System.out.println(b>=3000?"3000 이상":"3000 미만");
		System.out.printf("C사원 연봉/연봉+a : %d/%.1f",c,(double)(c*=1.15));
		System.out.println();
		System.out.println(c>=3000?"3000 이상":"3000 미만");
		
	}
}
