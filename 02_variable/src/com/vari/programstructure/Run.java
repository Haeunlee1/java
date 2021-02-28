package com.vari.programstructure;
import com.vari.programstructure.func.*;
public class Run {
	//실행클래스
	public static void main(String[] args) {
		//외부클래스에 있는 기능 이용하기 = 메소드호출
		new Funcational().inputData();   //클래스이름.메소드이름
		new Functional2().printData();  //다른 패키지에 있는 클래스를 불러올땐 import 써주기 
		
	}

}
