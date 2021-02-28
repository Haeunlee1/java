package com.vari.dataover;

public class DataOverflow {

	public static void main(String[] args) {
		//데이터 오버플로우하기
		byte bnum = 125;
		// bnum++' 는 bnum변수의 값을 +1 시키는 연산자
		System.out.println(++bnum);
		System.out.println(++bnum);
		System.out.println(++bnum);		// byte 는 -128~+127까지임 근데 127이후엔 에러가 뜨는게 아니라 다시 맨처음 -128로 넘어가버림 (표현가능한 범위에서 계속 반복됨)
		System.out.println(++bnum);     // 정상값이 안 나오면 자료형 데이터타입을 큰 범위로 변경해주기 
		
	
		
	}
}
