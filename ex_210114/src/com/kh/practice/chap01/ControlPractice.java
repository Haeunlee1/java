package com.kh.practice.chap01;
import java.util.Scanner;
public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		System.out.println("===메뉴실행===");
		System.out.println("1.입력"+"\n"+"2.수정"+"\n"+"3.조회"+"\n"+"4.삭제"+"\n"+"7.종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int choice = sc.nextInt();
		switch(choice) {
			case 1 : System.out.println("입력 메뉴입니다."); break;
			case 2 : System.out.println("수정 메뉴입니다."); break;
			case 3 : System.out.println("조회 메뉴입니다."); break;
			case 4 : System.out.println("삭제 메뉴입니다."); break;
			case 7 : System.out.println("종료 메뉴입니다."); break;
			default : System.out.println("알맞은 숫자를 입력하세요");
		}
	
	}
	public void practice2() {
		System.out.println("===양수의 홀짝확인===");
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if(num>0) {
			if(num%2==0) {
				System.out.println("짝수다");
			}else {
				System.out.println("홀수다");
			}
		}else {
			System.out.println("양수만 입력해주세요");
		}
		
	}
	public void practice3() {
		System.out.println("===성적 합격확인===");
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		int sum = kor+eng+math;
		if(kor>=40&&eng>=40&&math>=40&&(sum/3.0)>=60) {
			System.out.println("국어 : "+kor);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+eng);
			System.out.println("합계 : "+sum);
			System.out.println("평균 : "+(sum/3.0));
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		System.out.println("===계절출력하기===");
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch(month) {
			case 1: case 2: case 12 :
				System.out.println(month+"월은 겨울입니다.");break;
			case 3: case 4: case 5 :
				System.out.println(month+"월은 봄입니다.");break;
			case 6: case 7: case 8 :
				System.out.println(month+"월은 여름입니다.");break;
			case 9: case 10: case 11 :
				System.out.println(month+"월은 가을입니다.");break;
			default : 
				System.out.println(month+"월은 잘못 입력된 달입니다.");
		}
	}
	public void practice5() {
		String id = "user001";
		String pw = "aa123";
		System.out.println("===로그인 데모===");
		System.out.print("아이디 : ");
		String inputId = sc.next();
		System.out.print("비밀변호 : ");
		String inputPw = sc.next();
		
		if(inputId.equals(id)&&inputPw.equals(pw)) {
			System.out.println("로그인 성공");		
		}else if(inputId.equals(id)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}else if(inputPw.equals(pw)) {
			System.out.println("아이디가 틀렸습니다.");
		}else {
			System.out.println("아이디와 비밀번호를 확인하여주십시오.");
		}
			
	}
	public void practice6() {
		System.out.println("===등급별 권한확인===");
		System.out.print("권한을 확인하고자 하는 회원 등급 (관리자/회원/비회원) : ");
		String grade = sc.next();
		switch (grade) {
			case "관리자" : 
				System.out.println("회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성"); break;
			case "회원" : 
				System.out.println("게시글 작성, 게시글 조회, 댓글 작성"); break;
			case "비회원" : 
				System.out.println("게시글 조회"); break;
			default : 
				System.out.println("올바른 등급을 입력해주세요.");
		}
	}
	public void practice7() {
		System.out.println("===인바디 측정===");
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		double bmi = weight/(height*height);
		System.out.println("BMI지수 : "+bmi);
		if(bmi<18.5) {
			System.out.println("저체중");		
		}else if(bmi<23) {
			System.out.println("정상체중");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi<30) {
			System.out.println("비만");
		}else{
			System.out.println("고도 비만");
		}
		
	}
	public void practice8() {
		System.out.println("===연산하기===");
		System.out.print("피연산자1 입력 : ");
		int num = sc.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		System.out.println("연산자 입력 (+, -, *, /, %) : ");
		char op = sc.next().charAt(0);
		if(num>0&&num2>0) {
			switch(op) {
				case '+' : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case '-' : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case '*' : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case '/' : System.out.println(num+"/"+num2+"="+((double)num/num2)); break;
				case '%' : System.out.println(num+"%"+num2+"="+(num%num2)); break;
				default : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
		}else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}

	}
	
	public void practice9() {
		System.out.println("===pass,fail확인하기===");
		System.out.print("중간 고사 점수 : ");
		int first = sc.nextInt();
		first *=0.2;
		System.out.print("기말 고사 점수 : ");
		int second = sc.nextInt();
		second *=0.3;
		System.out.print("과제 점수 : ");
		int homework = sc.nextInt();
		homework *=0.3;
		System.out.print("출석 횟수 : ");
		int check = sc.nextInt();
		int sum = first+second+homework+check;
		System.out.println("==========결과==========");
		if(sum>=70&&check>20-(20*0.3)) {
			System.out.println("중간 고사 점수(20) : "+(double)first);
			System.out.println("기말 고사 점수(30) : "+(double)second);
			System.out.println("과제 점수    (30) : "+(double)homework);
			System.out.println("출석 점수    (20) : "+(double)check);
			System.out.println("총점 : "+(double)sum);
			System.out.println("PASS!!!!");
		}else if(check<=20-(20*0.3)) {
			System.out.println("FAIL [출석 횟수 부족 "+check+"/20)]");
		}else if(sum<70){
			System.out.println("중간 고사 점수(20) : "+(double)first);
			System.out.println("기말 고사 점수(30) : "+(double)second);
			System.out.println("과제 점수    (30) : "+(double)homework);
			System.out.println("출석 점수    (20) : "+(double)check);
			System.out.println("총점 : "+(double)sum);
			System.out.println("FAIL [점수 미달]");
		}
		
	}
	public void practice10() {
		System.out.println("====프로그램 실행하기====");
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");
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
			default : System.out.println("올바른 번호를 입력하세요");
		}
		
	}
	
	public void practice11() {
		System.out.println("===비밀번호 만들기===");
		System.out.print("비밀번호 입력 : ");
		String pw = sc.next();
		if(pw.length()<5) {
			System.out.println("생성 성공");
		}else if(pw.charAt(0)==0) {
			System.out.println("1~9사이의 정수를 입력하세요");
		}else {
			System.out.println("자리수 안 맞음");
		}
		
	}
	
}
