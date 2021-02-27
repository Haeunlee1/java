package com.kh.run;

import java.util.ArrayList;
import java.util.Date;
// 다른 패키지에 있는 클래스를 가져올 때 사용
public class FirstMyObject {
	// java project가 실행이 되려면 반드시 public static void main(String[] args) 메소드가 있어야한다
	
	public static void main(String[] args) {
		System.out.println("안녕 Rclass 자바 화이팅!"); 
		//console창에 ()안에 있는 것을 출력
		// ctrl+f11 누르면 실행
		// 여러줄 주석처리 하려면 드래그 하고 ctrl+/
		
		// 외부클래스 불러와서 날짜 출력하기
		System.out.println(new Date());
	}
}
