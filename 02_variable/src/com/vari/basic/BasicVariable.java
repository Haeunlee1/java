package com.vari.basic;
//변수 선언!
public class BasicVariable {

	public static void main(String[] args) {
		//변수선언하기 -> 저장공간 확보하기
		boolean i;
		// 변수에 대한 명칭을 지정할 때의 규약
		// 1. 대소문자 구분이 되고 길이 제한이 없음 (하지만 첫글자는 소문자로)
		char fwfrfe;
		//2. 예약어 사용불가
		//3. 변수의 첫 글자는 숫자불가
		// 4. 특수문자는 _ 와 $ 만 사용가능
		int b_sum;
		double s$num;
		String memberName;
		int arrayName;
		
		double j = 3.21;
		int mathRecode = 40;
		int mathScore = 5;
	    mathRecode = mathScore;
	    mathRecode = 100;
		System.out.println(mathRecode);
		System.out.println(mathScore);
		
		double height = 165;
		float weight;
		weight = 100;
		
		long longNum = 100;
		
		int age = 1, age1=2,age2=3;
		
		String nickName ="양하치";
		System.out.println(nickName);
		
		String nickName1 = new String("양하치");
		System.out.println(nickName1);
		
		String msg="오늘은"+"금요일";
		System.out.println(msg);
		
		System.out.println(nickName+msg);
		
		System.out.println("헤이"+5);
		
		System.out.println(height+weight+nickName);   
		System.out.println(""+height+weight+nickName);  // 숫자/숫자/문자 이렇게 따로따로 출력되길 원한다면 앖에 빈칸 ""을 넣어주면 된다 or 중간에 "" 넣어준다 (숫자와숫자사이에 문자열을 넣어준다)  
		System.out.println((height+weight)+nickName);   
		
		
		//상수 = 변하지 않는 값, 대문자로 써야함
		final String ADMIN = "master";
		System.out.println(ADMIN);
		
		int a=0,b=1;
		
		
	}
}
