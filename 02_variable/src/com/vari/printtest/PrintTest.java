package com.vari.printtest;

public class PrintTest {
	
	public static void main(String[] args) {
		//print 와 println의 차이
		
		String name="이하은";
		int age =26;
		double height = 166;
		double weight = 100;
		char gender = 'F';
		//print
		System.out.print(name);
		System.out.print(age);
		System.out.print(height);
		System.out.print(weight);
		System.out.print(gender);
		System.out.println();
		//println
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(gender);
		
		//printf("%형식",변수) -> 일정한 형태를 유지시켜주는 메소드
		//이름은 name변수값입니다 출력하기
		System.out.println("이름은 "+name+"입니다.");
		System.out.printf("이름은 %s입니다",name);
		System.out.printf("이름은 %s입니다",age);  // %s(문자)지만 숫자가 가능한 이유는 자동으로 string 타입 형변환 됨
		System.out.printf("이름은 %d입니다",age);
		System.out.printf("이름은 %s이고, 나이는 %d입니다.",name,age);
		//printf매소드는 값의 정렬, 소수점표현을 쉽게 할 수 있다
		//이름 이하은 이하이 이하일
		System.out.println("이하은 20");
		System.out.println("이하이 22");
		System.out.println("이하일 24");
		//printf를 이용하면 정렬해서 출력가능
		System.out.printf("%5s %d \n", "이하은", 20);
		System.out.printf("%-5s %d \n", "이이", 22);
		System.out.printf("%-5s %d \n", "이하일", 24);
		
		//소수점 표시에 대해 설정가능
		System.out.printf("%f\n", height);
		System.out.printf("%.2f", height);
		System.out.println();
		
		//몸무게를 소수점 3자리까지 출력
		System.out.printf("%.3f", weight);
		System.out.println();
		
		//printf로 나는 000이고, 나이는 00이고, 성별은 0, 키는 000.00 몸무게는 00.0 입니다 
		System.out.printf("나는 %s이고, 나이는 %d이고, 성별은 %s, 키는 %.2f, 몸무게는 %.1f 입니다\n", name, age, gender, height, weight);
		
		System.out.printf("나는 %s이고, 나이는 %d이고,\n성별은 %s, 키는 %.2f, 몸무게는 %.1f 입니다", name, age, gender, height, weight);
		System.out.println();
		
		//escape문 ( 문자열안에서 특정기능을 수행하는 문자)
		// \t 일정 간격의 띄어쓰끼
		System.out.println();
		System.out.println();
		
		String msg = "안녕하세요";
		System.out.println(msg);
		msg="안녕\t하세요";
		System.out.println(msg);
		
		msg = "\"야 너 똑바로해\" 라고 말했다.";
		System.out.println(msg);
		
		
		System.out.printf("이름은 %s이고, \n%d살입니다.",name,age);
		
		String b = "\"안녕\"이라고 말했다";

		String c = "c:\\";

		System.out.println(b);

		System.out.println(c);
		
		
		
		
		
	
	}

}
