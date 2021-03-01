package com.operator.controller;
import java.util.Scanner;
public class OperatorTest {

	//단항연산 
	public void singleOp() {
		//부정연산
		// ! -> 진위형을 반전시킴
		boolean flag = true;
		System.out.println(flag);
		boolean flag2 =!flag;
		System.out.println(flag2);
		System.out.println(!!flag);
		
		//부정연산은 비교연산, 논리연산 결과를 부정할 때 많이 사용 
		
		
		//증감연산
		int a = 10;
		a++;
		a++;
		a++;
		a++;
		System.out.println("a++ = "+a);
		
		a--;
		a--;
		a--;
		System.out.println("a-- : "+a);
		
		int b= 10;
		++b;
		++b;
		System.out.println("b : "+b);
		
		
		// 다른 연산과 같이 실행되면 전위, 후위에 따라 차이발생
		int num = 10;
		int result = num++;
		System.out.println("result : "+result);
		System.out.println("num : "+num);
		// 1. int num=10; 대입 / 2. int result=num 을 실행(result는 10이 됨) / 3. 그 다음에 num++;를 실행 => 최종적으로 int num=11로 변경
		
		int num3 = 10;
		int result2 = ++num3;
		System.out.println(result2);
		System.out.println(num3);
		// 1. int num3 = 10;/ 2. ++num3 실행 > num3는 11이 되고 result2는 11이 됨 
		// for문이나 누적갯수 연산등에 사용
		
		//감소도 해보기
		
		
		
	}
	
	//산술연산 연습하기
	public void calculator() {
		//더하기
		int num = 10;
		int num2 = 20;
		System.out.println("리터럴이용 : "+(10+20));
		System.out.println("변수이용 : "+(num+num2));
		int result = num+num2;
		System.out.println(num+"+"+num2+"="+result);
		
		//빼기연산
		result = num-num2;
		System.out.println(result);
		
		result = num*num2;
		System.out.println(num+"*"+num2+"="+result);
		
		// 나누기할 때는 형변환에 유의
		int num3 = 5;
		int num4 = 9;
		System.out.println((double)num3/num4);
		System.out.println((double)(num3/num4));   //=> (num3/num4)를 먼저 처리 (0.5555 )=>int값이라 0이 됨. => double로 바꿔도 0.0 됨!! 이렇게 하지마세요
		
		//나머지연산
		System.out.println(num3%num4);
		
		//변수가 3의 배수인지 확인하기
		//변수가 짝수, 홀수인지 확인하기
		
		
		
	}
	
	//기본 더하기 계산기 만들기
	//1. OperatorTest 클래스에 ex_calculator() 메소드를 만들고
	//두개의 값을 입력받아 값을 더한 연산을 출력하기
	// 00+00=00 
	public void ex_calculator() {
		Scanner sc = new Scanner(System.in);
		System.out.println("각 더할 값을 입력하시오");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result = a+b;
		System.out.println(a+"+"+b+"="+result);
		
	}
	
	//비교연산자 확인
	public void compareOp() {
		//대소비교 => 수의 크기를 비교
		int age=19;
		int age2=27;
		boolean result = age<age2;
		System.out.println(result);
		
		//문자(char)에 대한 대소비교
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println(ch1<ch2);
		System.out.println('a'<'b');
		
		//나이를 입력받고 19살 이상인지 확인
//		Scanner sc = new Scanner(System.in);
//		System.out.println("당신의 나이를 입력하세요");
//		int age1 = sc.nextInt();
//		System.out.println(age1>19);
//		
		
		//동등비교
		// == -> 숫자, 문자 가능
		int num = 20;
		System.out.println(num==10);
		
		System.out.println("문자열을 비교하는 것은?");
		String msg = "오늘 수업은 여기까지~~";
		String msg1 = "오늘 수업은 여기까지~~";
		String msg3 = new String("오늘 수업은 여기까지~~");
		System.out.println(msg==msg1);
		System.out.println(msg==msg3);
		// 문자열은 참조형 = 클래스임 
		// 문자열.equals(비교문자);
		System.out.println(msg.equals(msg3));
		
		//동등비교 부정하기 => !
		System.out.println("동등비교 부정");
		System.out.println(!msg.equals(msg3));
		
		// 문자열 제외한 나머지 동등비교 !=
		int a = 20;
		int b = 30;
		System.out.println(a==b);
		System.out.println(a!=b);
		
	}
	
	public void logiccompare() {
		//일반 논리연산 AND && / OR ||
		//사는 곳이 서울이고 이름이 이하은 
		String name = "이하은";
		String addr = "서울";
		String name1 ="홍길동";
		String addr2="서울";
		
		System.out.println(name.equals("이하은")&&addr.equals("서울"));
		
		// 나이가 20대인 사람을 구하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하시오");
		int age = sc.nextInt();
		System.out.println(20<=age&&age<=29);
		
		//id가 admin이고 password가 1234면 id,password 입력받아 처리
		String id = "admin";
		String password = "1234";
		System.out.println("id와 password를 입력하시오");
		String id2 = sc.next();
		String password2 = sc.next();
		System.out.println(id2.equals(id)&&password2.equals(password));
		// 위에선id,password의 값을 지정해줬으니 .equals에서 변수명으로 가능
		// 따로 값을 지정하지 않았으면 .equals(비교값)넣어주면 됨
		
		//당신의 나이가 10대 이면서, 성별이 여자인 사람
		System.out.println("나이를 입력하세요");
		int a = sc.nextInt();
		System.out.println("성별(M/F)을 입력하세요");
		char b = sc.next().charAt(0);
		System.out.println(10<=a&&a<=19&&b=='F');
		sc.nextLine();
		
		//입력받은 주소가 경기도나 강원도인 사람
		System.out.println("주소를 입력하세요");
		String add = sc.nextLine();
		System.out.println(add.equals("경기도")||add.equals("강원도"));
		
		
		//사는곳이 광주이거나 서울살고 나이가 30대인 남성
		System.out.println("주소지 입력");
		String add4 = sc.nextLine();
		System.out.println("나이 입력");
		int num = sc.nextInt();
		System.out.println("성별입력");
		sc.nextLine();
		char cc = sc.nextLine().charAt(0);
		System.out.println(add4.equals("광주")||add4.equals("서울")&&30<=num&&num<40&&cc=='남');
		//광주, 19, 여자 => 하면 true가 나옴 		
		//or가 껴있으면 or 뒷 연산자를 먼저 실행함 (우선순위가 &&보다||가  낮음)
		// 이 상황에서 주소 광주 입력시엔 add4.equals("서울")이 먼저 실행되어 false가 뜨고 뒤에 && 연산식은 계산 ㄴㄴ
		// 그래서 add4.equals("광주") || false가 되어 => true가 뜸
		// 그래서 주소 비교부분을 괄호로 묶어준다
		// &&와 || 같이 실행시엔 괄호로 묶어주는게 좋다! 유의하기
		
		
		
		
		
	}
	
	
	//복합대입 연산자
	public void complexOp() {
		//변수 값에 특정연산을 한 후 다시 재대입하는 연산자
		int su=100;
		//su++; //su=su+1
		//변수 += 수 => 변수= 변수+수
		su+=200;
		su+=100;
		su+=300;
		System.out.println(su); //=>300;
		//su+=200 => su=100+200
		//누적합계가능 (통장 잔고 등 합산이 필요할 경우)
		int total = 0;
		total = 100000;
		total+=200000;
		System.out.println(total);
		
		total *=3;
		System.out.println(total);
		
		//문자열 누적연산
		String msg = " ";
		msg+="안녕하세요";
		System.out.println(msg);
		
		//사용자에게 5번 입력받고 받은 값 한번에 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("메시지 입력 : ");
		String a = sc.nextLine();
		System.out.println("메시지 입력 : ");
		a+=sc.nextLine();
		System.out.println("메시지 입력 : ");
		a+=sc.nextLine();
		System.out.println("메시지 입력 : ");
		a+=sc.nextLine();
		System.out.println("메시지 입력 : ");
		a+=sc.nextLine();
		System.out.println(a);
		
		
	}
	
	//삼항연산자
	public void third() {
		//삼항연산자는 조건식에 의해 실행된 구문을 결정하는 연산
		// 조건문? A : B ; => A=> true / B=>false
		// 삼항연산자는 단독으로 못써서 변수를 지정해주거나 syso로 묶어줘야함
		int su = 12;
		String msg = su==10?"10이다":"10이 아니다";
		System.out.println(su==10?"10이다":"10이 아니다");
		System.out.println(msg);
		
		//숫자 입력받아 100보다 큰 수면 우와크다 출력, 아니면 에이 작다 출력
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자 입력");
		int a = sc.nextInt();
		String b = a>=100?"우와~크다!":"에이,,작다";
		System.out.println(b);
		
		//미성년이면 공부하세요 . 아니면 돈버세요
		System.out.println("나이입력");
		int i = sc.nextInt();
		b=i<=19?"공부하세요":"돈버세요";
		System.out.println(b);  // 변수에 담지 않고 syso에 바로 넣으면 됨
		
		//kh학생이면 코딩하세요, 아니면 취업하세요
		// kh학생여부를 확인했어야함 => 간단하게 예,아니오로 받는 것... 조건에 대해 생각을 많이 해야한다 
		sc.nextLine();
		System.out.println("소속입력");
		String s = sc.nextLine();
		b= s.equals("kh")?"코딩하세요":"취업하세요";
		System.out.println(b);
		//예 아니오로 해보기
		System.out.println("kh학생입니까? (Y/N)");
		char c = sc.next().charAt(0);
		System.out.println(c=='Y'?"코딩하세요":"취업하세요");
		
		//미성년인지 확인하고 미성년이 아니고 남자면 왼쪽으로 가세요, 아니면 오른쪽으로 가세요
		// 미성년이면 나이 더 먹고와
		//삼항연산 안에 또 삼항연산 가능
		sc.nextLine();
		System.out.println("나이를 입력하세요 : ");
		int num = sc.nextInt();
		System.out.println("성별을 입력하세요 (남/여)");
		char c1 =sc.next().charAt(0);
		String msg2 = num>19?c1=='남'?"왼쪽으로 가세요~":"오른쪽으로 가세요~":17<=num&&num<=19?"고등학생 안돼":"그 밑은 더 안돼"; 
		//char의 값 맞는지 확인할 때 꼭!!! 작은따옴표 주의
		System.out.println(msg2);
		
		
		
	
		
	}
	//비트연산실습
	public void bitOp() {
		//비트연산 실행하기
		//저장소에 있는 비트끼리의 연산을 의미
		// A&B : 각 비트자리끼리 비교함 / 비교값이 1,1 일때만 1이 표시됨
		// A|B : 각 비트자리끼리 비교 / 비교값중 하나만 1이면  1 표시
		// A^B(XOR) : 두 자리값이 같으면 0, 다르면 1
		// ~A : 1일때 0, 0일때 1
		
		int a= 10, b=22;
		String basic ="";
		for (int i = 0;i<32;i++) {
			basic+="0";
		}
		String bit = basic+Integer.toBinaryString(a);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" -> a 비트값");
		bit = basic+Integer.toBinaryString(b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" -> b 비트값");
		
		bit = basic+Integer.toBinaryString(a&b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" -> a&b값");
		
		bit = basic+Integer.toBinaryString(a|b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" ->a|b");
		
		bit = basic+Integer.toBinaryString(a^b);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit+" ->a^b");
		
		bit = basic+Integer.toBinaryString(~a);
		bit = bit.substring(bit.length()-32);
		System.out.println(bit +" -> ~a");
		
	}
	
	
	
}





