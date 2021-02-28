package com.vari.casting;

public class CastingTest {

	public static void main(String[] args) {
		//자료형변환 알아보기
		//byte bnum = 200;
		byte bnum = 100;
		System.out.println(bnum);
		
		long lnum = 10000;
		System.out.println(3.14+100);
		
		double weight = 65.5;
		int weightInt;
		weightInt=(int)weight;
		System.out.println("변환한 값 : "+weightInt);
		System.out.println("원본값 : "+weight);
		
		
		//데이터 손실 발생상황
		int num = 290;
		bnum=(byte)num;
		System.out.println("원본값 : "+ num);
		System.out.println("형변환값 : "+ bnum);
		
		//자동형변환의 특이점 (정수형)
		byte num1 = 100;
		byte num2 = 10;
		byte result = (byte)(num1+num2);   // 기본적인 산술연산에 대한 값은 int형으로 처리 됨 그래서 연산식을 괄호로 묶고 앞에 강제형변환 시켜줌
		System.out.println(result);
		//char형에 대한 자료형변환
		//유니코드 -> 숫자와 문자를 매핑시켜놓은 코드
		char ch='A';
		int alpha = 66;
		System.out.println(alpha);
		System.out.println((char)alpha);
		System.out.println(ch+1);
		char ch2 = (char)(ch+1);
		
		
	}
}
