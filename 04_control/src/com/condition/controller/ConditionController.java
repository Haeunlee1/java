package com.condition.controller;
import java.util.Scanner;


public class ConditionController {
	//기본 if 활용하기
	public void ifTest() {
		//기본 if문 활용
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		//입력값이 양수면 양수입니다 출력, 아니면 아무것도 하지않음
		int i = sc.nextInt();
		//삼항연산자
		System.out.println(i>0?"양수입니다":"");
		
		if(i>0) {
			System.out.println("양수입니다");
			//변수선언 가능?
			String name = "되니?";  //if에서 선언한 변수는 외부에서 사용할 수 없음 ( 지역변수 스코프)
			System.out.println(name);
			System.out.println("이메일 : ");
			String email=sc.next();
		}
		
		//이름을 입력받고 자신의 이름과 동일한 이름이 입력되면 나는 코딩을 잘할 수 있다 를 출력, 다른이름이면 아무것도 하지않음
		
		System.out.println("이름은? : ");
		sc.nextLine();
		String name = sc.nextLine();
		if (name.equals("이하은")) {
			System.out.println("나는 코딩을 잘 할 수 있다.");
		}
		//국영수 성적을 입력받고 평균이 60점이상이면 합격입니다 출력
//		System.out.print("국어점수 : ");
//		int a = sc.nextInt();
//		System.out.print("영어점수 : ");
//		int b = sc.nextInt();
//		System.out.print("수학점수 : ");
//		int c = sc.nextInt();
//		if((a+b+c)/3>=60) {
//			System.out.println("합격입니다.");
//		}
		
		System.out.print("국어점수 : ");   //복합연산자 이용해 변수 하나로 쓰기
		int total=sc.nextInt();			// 각 개별 점수를 저장할 필요가 없음 => 어차피 평균을 구할거기 ㄸㅐ문에
		System.out.print("영어점수 : ");
		total+=sc.nextInt();
		System.out.print("수학점수 : ");
		total+=sc.nextInt();
		System.out.println("총 점 : "+total);
		
		if(total/3.0>=60) {		// /3.0하는 이유는? 소수점자리로 나오게 하기 위해 double형을 입력
			System.out.println("합격입니다.");
		}
		
		//정수 한 개를 입력받고 정수가 짝수면 짝수다, 
		System.out.print("정수 입력 : ");
		i = sc.nextInt();
		if(i%2==0) {
			System.out.println("짝수다");
		}
		
		//아이디와 패스워드를 입력받아 아이디가 admin, 패스워드가 admin일때 로그인성공
		
		System.out.println("아이디 입력 : ");
		String id = sc.next();
		System.out.println("패스워드 입력 : ");
		String password = sc.next();
		
		if(id.equals("admin")&&password.equals("admin")) {
			System.out.println("로그인 성공");
		}
		
		
		
	}
		
	public void ifelseTest() {
		//if~else문은 한개의 그룹.
		//else예약어는 앞에 if문이 없으면 사용불가
		//if else문은 조건에 따라 반드시 둘 중 하나만 실행된다
		
		//입력받은 수가 양수면 양수입니다, 음수면 음수입니다 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("양수입니다.");
		}else {
			System.out.println("음수입니다.");
		}
		
		//else 문은 개별 사용불가 꼭 if랑 같이 써야함
		
		//미자 가입 불가능한 로직구성
		// 코딩을 할 때 조건에 대해 먼저 꼭 생각하기 !!!! 조건을 구상?? 암튼 그런게 젤 중요함
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		if(age>19) {
			System.out.println("가입가능");
			System.out.println("====회원가입====");
			System.out.print("아이디 : ");
			String id = sc.next();
			System.out.print("패스워드 : ");
			String pw = sc.next();
			System.out.print("닉네임 : ");
			String nickName = sc.next();
			System.out.printf("아이디 %s, 패스워드 %s, 닉네임 %s",id,pw,nickName);
		}else {
			System.out.println("가입불가능");
		}
		//if문을 두개 사용하는 것과 else의 차이는? 
		//if는 별도 구문이다 
	}		
	
	public void ifelseifTest() {	
		//성적을 입력받아 입력받은 성적에 따라 a,b,c,d,f 등급 나누기
		//a = 90이상 b=80~89 c=79~70 d= 69~60 f=60미만
		
		// 성적 입력 했을 때 평균에 따라 등급부여
		//100~90 :수
		//89~80 : 우
		//79~70 : 미
		//69~60 : 양
		// 나머지 : 가
		Scanner sc = new Scanner(System.in);
		
		System.out.print("평균 입력 : ");
		double avg = sc.nextDouble();
		String grade;
		if(avg>=90) {
			grade ="수";
		}else if(avg>=80) {		//(avg<=100&&avg>=)%%avg>=80 괄호가 생략된것. 가독성이 좋아짐 
			grade ="우";
		}else if(avg>=70) {
			grade = "미";
		}else if(avg>=60) {
			grade = "양";
		}else {
			grade = "가";
		}
		System.out.println(grade);
		
		//여러 if문을 썼을 때 사용하는것 주의하기 (elseif와 여러if의 차이)
		
		//연령별 메세지 출력하기
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age>=50) {
			System.out.println("열심히 일해야지");
			System.out.println("손주들보지");
		}else if(age>40) {
			System.out.println("열심히 일해야지");
			System.out.println("자식들 먹이지");
		}else if(age>=30) {
			System.out.println("열심히 일해야지");
			System.out.println("결혼하지");
		}else if(age>=20) {
			System.out.println("열심히 공부해야지");
			System.out.println("취업하지");
		}else {
			System.out.println("열심히 공부해야지");
			System.out.println("좋은 대학 가지");
		}
		
		
		//아이디하고 패스워드 입력받고
		//아이디 user01 비번 user01 로그인성공
		// 아이디 user01 비번 user01 패스워드 틀림
		// 아이디 user01아니고 비번 user01 아이디틀림
		// 아이디, 비번 user01이 아님  둘다 모두 틀립니다.
		
		String id = "user01";
		String pw = "user01";
		System.out.print("아이디를 입력하세요 : ");
		String a = sc.next();
		System.out.print("패스워드를 입력하세요 : ");
		String b = sc.next();
		
		if(a.equals(id)&&b.equals(pw)) {
			System.out.println("로그인 성공");
		}else if(a.equals(id)&&!b.equals(pw)) {
			System.out.println("패스워드가 틀립니다");
		}else if(!a.equals(id)&&b.equals(pw)) {
			System.out.println("아이디가 틀립니다");
		}else {
			System.out.println("모두 틀렸습니다.");
		}
		
	}
	public void doubleifTest() {
		//중첩if문
		// 전제조건에 대해 설정하고 그 안에서 if문 다시 사용
		//나이가 성인이면서 내국인 그냥회원가입, 외국인은 외국인등록번호
		//성인이 아니면 가입할 수 없음
		
		Scanner sc = new Scanner(System.in);
		System.out.println("====kh클럽 회원가입====");
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		if(age>=20) {				// if문에서의 같은 변수이름 사용은 가능하다 왜? 조건문이 true면 false는 실행될 일이 없으니 elseif의 변수는 생성되지 않음. 문제되지 않는다.
			System.out.print("1. 내국인, 2. 외국인 :  ");
			String choice = sc.next();
			if(choice.equals("1")) {
				System.out.println("회원가입을 시작합니다");
				System.out.print("이름 : ");
				sc.nextLine();
				String name = sc.nextLine();
				
			}else if(choice.equals("2")){
				System.out.println("외국인 등록번호 (1.있다 2.없다) : ");
				int n = sc.nextInt();
				if(n==1) {
					System.out.print("외국인 등록번호 입력 : ");
					int num = sc.nextInt();
					System.out.println("회원가입을 시작합니다");
					System.out.print("이름 : ");
					sc.nextLine();
					String name = sc.nextLine();             // 지역변수!! 스코프!! 
				}else {
					System.out.println("외국인 등록번호 등록 된 분만 회원가입 가능합니다.");
				}
			}else {
				System.out.println("잘못 누르셨습니다.");
			}
		}else {
			System.out.println("회원가입이 불가합니다.");
		}
		
	}
	
	//switch 문
	public void switchTest() {
		//switch문은 조건문으로 예상되는 값에 따라 분기처리하는 방식
		// 동등비교 실행
		Scanner sc = new Scanner(System.in);
		System.out.println("====오늘의 점심====");
		System.out.println("1.파스타 2.오삼불고기 3.샌드위치 4.냉면");
		int choice =sc.nextInt();    //조건문을 만들땐 예상범위의 값을 입력하는 케이스도 생각해야함 (=default / else)
		switch (choice) {
			case 1 : System.out.println("봉골레하나~"); break;  
			case 2 : System.out.println("오!삼!"); break;
			case 3 : System.out.println("오늘은 섭웨이"); break;
			case 4 : System.out.println("나는 물냉"); break;
			default : System.out.println("제대로 골라 ");break;
		}
		
		//switch(요기)안에 들어갈 수 있는 값은?
		//정수, 문자열
		//case에 데이터타입 맞춰서 쓰기
		String name =sc.next();
		switch(name) {
			case "파스타" : System.out.println("빠네 먹고싶어"); break;
			case "오삼불고기" : System.out.println("식당으로 오삼ㅋ");break;
		}
		//char 형은?
		System.out.println("가.자바 나.오라클 다.htmlcss");
		char cho = sc.next().charAt(0);
		switch(cho) {		// case문 들여쓰기 해주기~~
			case '가' : System.out.println("자바는 쉽다 라고 말하고 싶다");break;
			case '나' : System.out.println("오라클은 db");break;
			case '다' : System.out.println("html / css 화면구현"); break;
		}
		
		//boolean 형 => 불가능
//		int su = 100;
//		switch(su>50) {
//			case true : break;
//			case false : break;
//		}
		
		//실수형 => 불가능
//		double dnum=3.14;
//		switch(dnum) {
//		
//		}
		int num = 100;
		switch(num%5) { //(num%5==0)같은 boolean형은 안 된다!!!!! 
		
		}
		
		//break문 사용하는것 why?
		//break 쓰지 않으면 해당 case문과 나머지 case문이 다 실행 됨
		
		System.out.println("오늘의 점심메뉴");
		System.out.print("1.마라탕, 2.피자, 3.짬뽕, 4.돈까스");
		int cho2=sc.nextInt();
		switch(cho2) {
			case 1 : 
				System.out.println("마라탕은 매워");
//				ifTest();    // 같은 클래스에 있는 메소드 호출
//				new OtherTest().test();    //다른 클래스에 있는 메소드 호출
				System.out.println("탕화쿵푸가자");break;
			case 2 : System.out.println("피자는 치즈피자지");
			case 3 : System.out.println("중국집 ㄱㄱ");
			case 4 : System.out.println("생선까스 먹을래");
			default : System.out.println("제대로 골라 ^^ ");
		}
		
		
	}
	
	
	

}
