package com.repeat.controller;
import java.util.Scanner;
public class RepeatController {
	
	//기뵌 for문 활용하지
	
	public void basicFor() {
		//for문 작성하기
		//for(초기식;조건식;증감식){반복할 코드 작성}
		//초기식 : 변수선언 -> 반복할 때 기준이 되는 값
		//조건식 : 반복을 중단할 수 있는 조건 => true면 반복문 실행, false면 반복문 중단
		//증감식 : 초기식에서 선언한 변수를 변경시키는 연산
		
		//안녕하세요를 5번 출력하세요
//		for(int i =0; i<5;i++) {
//			System.out.println("안녕하세요");
//		}
//		for(int i = 0; i<100; i++) {
//			System.out.println("안녕하세요"+i);
//		}
//		//1~50까지 출력
//		for(int i = 1; i<=50; i++) {
//			System.out.println(i);
//		}
		
		//1~100까지ㅏ 수 중에 짝수만 출력하기
		for (int i=1;i<=100;i++) {
		//for(int i =2;i<=100;i+=2)			// 이 식이 더 낫다고 생각
//			System.out.println(i);
			if(i%2==0) {
				System.out.println(i);
			}
		}
		//1~100까지 홀수만 출력하기
		for (int i=1;i<=100;i++) {
			if(i%2==1) {
				System.out.println(i);
			}
		}
//		for(int i =1; i<=100;i+=2) {
//			System.out.println(i);
//		}
		
		
		//학생정보 입력받아 출력하는 프로그램(이름,나이,반)
		//5명의 학생을 입력받아 출력하는 프로그램
		
		//1. scanner실행
		//2.
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i<=5;i++) {
//			if(i!=1) {			// nextInt다음에 버퍼 비워주기 첫번째방법
//				sc.nextLine();
//			}
//			System.out.print("이름을 입력하세요 :");
//			String name = sc.nextLine();
//			System.out.print("학생 나이 : ");
//			int age = sc.nextInt();
//			System.out.print("학생 반 : ");
//			int grade = sc.nextInt();
//			sc.nextLine();		//버퍼비우기 2번째방법
//			System.out.println(name+" "+age+" "+grade);
		}
		
		
		//1부터 50까지 수 중에 짝수면 짝, 홀수면 홀 출력하기
		
		for (int i=1; i<=50; i++) {
			if(i%2==0) {
				System.out.println(i+"= 짝!");
			}else {
				System.out.println(i+"= 홀!");
			}
		}
		
		//100부터 1까지 출력하기
		for(int i=100;i>=1;i--) {
			System.out.println(i);
			
		}
		
		//for문 활용하기
		//for문의 초기식, 조건식, 증감식을 다 활용해야하는가
		String msg = "";
		for(;!msg.equals("0");) {		//특정조건에 의해 중단되는 for문
			System.out.println("되니?");
			msg=sc.next();
			
		}
		
		for(;;) {			//무한루프
			System.out.println("무한이다!");
		}
	
	}
	
	public void extraFor() {
		Scanner sc= new Scanner(System.in);
		
		//사용자가 입력한 수만큼 반복하는 for문 구성하기
		//여러분은 할 수 있다! 출력
		System.out.print("숫자 입력하세요");
		int num = sc.nextInt();
		for (int i = 1;i<=num;i++) {
			System.out.println("여러분은 할 수 있다! "+ i);
		}
		
		//학생정보 입력받아 출력하는 프로그램
		//5명 입력받기
		// 입력할 학생의 수를 입력받고 그 수만큼 학생정보를 입출력하는 시스템
		System.out.print("학생 수를 입력하세요 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		String print="";   // 변수를 사용하기 위해 초기화(공값을 넣어줌)
		for(int i =0;i<num1;i++) {
			System.out.print("학생 이름 : ");
			String name = sc.next();
			System.out.println("학생 나이 : ");
			int age = sc.nextInt();
			sc.nextLine();
			print+= name+" "+age+'\n';		//string print에 값을 누적하기
			
		}System.out.println(print);
		
		//성적의 합계, 평균을 구해주는 프로그램 작성
		//학생수 입력받고, 학생에 대한 국영수 점수 입력받고
		// 학생수별 합계와 평균을 구하는 프로그램 작성
		
		System.out.print("성적 계산 할 학생 수 입력 : ");
		int number = sc.nextInt();
		int sum=0;
		for (int i = 0;i<number;i++) {
			//int sum=0;		//1. sum을 for문위에 선언하면 계속 값이 누적됨(+=) / 그래서 for문 안에서 다시 초기화 해주면 가능! 
			System.out.println("국어 : ");
			sum += sc.nextInt();
			System.out.println("영어 : ");
			sum += sc.nextInt();
			System.out.println("수학 : ");
			sum += sc.nextInt();
			System.out.println("국영수 합계는 : "+sum+" 평균은 "+sum/3.0);
			sum=0;		//2. for문 위에 변수 선언을 해주고 for문 마지막에서 초기화해줘도 가능! 
		}
		
		//변수 선언할 때 for문의 i값을 활용할 수 있을까?
		//변수명은 동적으로 선언 불가. 
//		for (int i=0;i<5;i++) {
//			int 변수+i0; 		// for문에서 값이 바뀌는 i를 변수명에 쓸 수 없다. 동적인 선언 불가!
//		}
		
		
	}
	//계산기 프로그램
	// 1. 한번만 실행하는 계산기 만들기 => 2개 수 입력받고, 연산자 입력받아서 처리
	// 2. 내가 입력한 수 만큼 돌아가는 계산기 만들기 => 1번 입력값에 추가적으로 계산할 수 입력받기
	//프로젝트 하나 만들기 
	
	public void calculator1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 연산할 숫자를 입력하세요");
		int num3 = sc.nextInt();
		for (int i=0;i<num3;i++) {
	// 계산기 예제 ex_calculator에 있음		
		}
	}
	
	//while 쓰는 이유= 무한반복 시킬 때, 특정조건에 의해 반복문을 빠져나갈 때
	public void whileTest() {
		//기본 while
		//1~100까지 출력
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i<100) {
			System.out.println(i+1);
			i++;
		}
		System.out.println("====계산기====");
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			System.out.println("연산자 입력 : ");
			char op = sc.next().charAt(0);
			System.out.print("다음 숫자 입력 : ");
			int num2 = sc.nextInt();
			
			switch(op) {
				case '+' : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case '-' : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case '*' : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case '/' : System.out.println(num+"/"+num2+"="+((double)num/num2)); break;
				default : System.out.println("연산자를 잘못 입력하셨습니다"); break;
			}
			System.out.println("계산을 계속 하시겠어요? (1.응 2.아니) : ");
			int cho =sc.nextInt();
			if (cho==2) {
				break;
			}
		}
		int cho1 = 1;
		while(cho1==1) {		//
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			System.out.println("연산자 입력 : ");
			char op = sc.next().charAt(0);
			System.out.print("다음 숫자 입력 : ");
			int num2 = sc.nextInt();
			
			switch(op) {
				case '+' : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case '-' : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case '*' : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case '/' : System.out.println(num+"/"+num2+"="+((double)num/num2)); break;
				default : System.out.println("연산자를 잘못 입력하셨습니다"); break;
			}
			System.out.println("계산을 계속 하시겠어요? (1.응 2.아니) : ");
			cho1 =sc.nextInt();
		}
		// 매소드를 조건에 넣어서 처리하는 경우
		// 파일의 내용을 가져올 때
	
		
		//do while문
		// 무조건 반복될 코드를 한번 실행하고 그 후 조건을 통해 계속 진행할지 결정
		int a =10;
		while(a>10) {
			System.out.println("a : "+a);
		}
		//반복문의 코드를 무조건 한번은 실행해야할 때 (메뉴 등을 만들 때 사용)
		do {
			//중복할 코드
			System.out.println("a : "+a);
		}while (a>10);
	}
	public void doubleForTest() {
		//중첩반복문 활용하기
		for(int i=0;i<10;i++) {
			System.out.println("외곽 : "+i);
			for (int j=0;j<10;j++) {
				System.out.println("내곽 : "+j);
			}
			System.out.println();
		}
		//구구단 출력
		for(int i=2;i<10;i++) {
			System.out.println(i+"단");
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
		
		// apple을 입력받아 각 문자별 중복갯수 확인
		Scanner sc = new Scanner(System.in);
		String str = sc.next();   //문자열의 갯수를 알려주는 매소드 => str.length();
		for (int i =0; i<str.length();i++) {
			int count =0;
			//System.out.println(str.charAt(i));
			for (int j =0; j<str.length();j++) {
				//System.out.print(str.charAt(j));
				if(i!=j&&str.charAt(i)==str.charAt(j)) {	//i!=j => 자기자신을 뺐음
					count++;
				}
			}System.out.println(str.charAt(i)+" : "+count+"중복");
		}
		//i=0 즉 a일때 apple 안에서 a랑 같은 값은 없다 왜냐면 apple내 에선 같은값이 없으니까
		//i=1 즉 p일때 apple 안에서 p랑 같은 값은 3번째의 p이다 그래서 app중복!le인것
		//i=2 즉 p일때 apple 안에서 p랑 같은 값은 2번째의 p이다 그래서 ap중복!ple 인것
		// apple과 apple / 2개의 apple에서 비교하는게 아니라 apple 안에서 a랑 중복되는것, p랑 중복되는것을 찾는 것임1!! 이해 잘 하기 아니면 그림그려봐
		//int count는 몇개가 중복됐는지 찾는 것
		// 다시풀어볼 것 1.str변수의 리터럴값 정해놓고 중복값 찾기 , 2. str 값을 입력받고 그 중에서 중복값 찾기
		
		
		//별찍기
		for (int i=0;i<3;i++) {		// 열 ^
			for(int j=0;j<3;j++) {   //행 >
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//분기문에 대해 알아보기
	public void breakContinueTest() {
		//분기문은 실행되는 로직을 중간에 중단시키는 예약어이다.
		//break = 실행되는 {}로직을 중단=> switch / 반복문(무한루프)에서 사용
		//continue = 실행되는 {}로직 중 continue를 만나면 건너뜀
		//break문이나 continue문은 일반적으로 조건문에 같이 쓰임
		Scanner sc = new Scanner(System.in);
		//무한for문에서 루프를 중단시킬 때 사용
//		String orderMenu="";
//		while(true) {
//			System.out.println("====점심주문 프로그램====");
//			System.out.println("1. 회");
//			System.out.println("2. 연어덮밥");
//			System.out.println("3. 감자탕");
//			System.out.println("4. 샌드위치");
//			System.out.print("입력 : ");
//			int cho = sc.nextInt();
//			switch(cho) {
//				case 1: orderMenu+="회\n"; break;
//				case 2: orderMenu+="연어덮밥\n"; break;
//				case 3: orderMenu+="감자탕\n"; break;
//				case 4: orderMenu+="샌드위치\n"; break;
//			}
//			System.out.println("계속 주문하시겠습니까? (Y/N)");
//			char answer = sc.next().charAt(0);
//			if(answer=='N') {
//				System.out.println("주문내역 ====");
//				System.out.println(orderMenu);
//				break;
//			}
//			
//		}///while종료
//		System.out.println("주문프로그램 종료");
		
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				continue;
				
			}System.out.println(i);
		}
		for(int i =2; i<10;i++) {
//			if(i%2==1) {			//짝수단만 출력 됨
//				continue;
//			}
			System.out.println(i+"단 출력?(1.응 2.아니)");
			if(sc.nextInt()==2) {
				continue;
			}
			for(int j=1;j<10;j++) {
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		//이중 for문에서 break문
		//내부for문의 break문은 내부의 for문만 종료
		//외부for문까지 종료시키려면 이름이 있는 break;
		gugu:	// for문에 이름을 부여한 것
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				if(j>5) {
					break;
					//break gugu; => 이름있는 break문 
				}
				System.out.println(i+"X"+j+"="+(i*j));
			}
		}
		
		//문자열을 입력 받고 문자열 내에서 중복값이 있으면 중복값 발생! 을 출력하고 중단시키기 없으면 중복값 없음 출력
		System.out.print("문자열 입력 : ");
		String str = sc.next();
		boolean flag = false;
		stop:
		for (int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			for(int j=0;j<str.length();j++) {
				System.out.print(str.charAt(j));
				if(i!=j&&str.charAt(i)==str.charAt(j)) {
					System.out.print("중복값발생! ");
				    flag=true;
					break stop;
				}						// if끝에 중복값없음을 쓰게 되면 for문 안에 있는 거라 중복값없음이 계~속 출력됨
				
			}System.out.println();
		}
		System.out.println(flag?"":"중복값 없음");
	}
	
	
	
	
}
