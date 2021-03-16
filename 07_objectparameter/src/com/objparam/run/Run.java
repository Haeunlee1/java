package com.objparam.run;

import com.objparam.controller.ObjectParam;
import com.objparam.model.vo.Lunch;

public class Run {

	public static void main(String[] args) {

		ObjectParam op = new ObjectParam();
		int a = 10;
		String str ="출발";
		
		op.basicParam(a, str);
		System.out.println(a+" : "+str);
		
		// 100 : 호호호 출력됨
		//main과 basicParam의 저장공간이 각각생김
		//main 실행 => basicParam실행 => basic저장공간에선 a++, str+=이 됨/ 근데 return값이 없으니 basicParam 실행 후 소멸됨(syso은 main에서만 실행했으니 출력도 안되고 소멸)
		//기본자료형 원본값 수정 불가
		//main의 변수 a와 basic변수 a는 다른 것이라는걸 인지하자
		//메소드 실행했을 때 basic의 매개변수로는 들어가지만 basic 내에서의 로직 실행 후 return이 없으면 main에서 백날 실행해봐야 main에서 초기화한 값만 나옴
		//기본자료형 수정하려면 return 메소드로 변형하고 그 값을 main 변수에 넣어서 출력하기 => a=op.basicParam(a,str);
		
		//배열은 어떨까
		int[] numbers = {1,2,3,4};
		op.arrParam(numbers);
		System.out.println(numbers);
		for(int i=0; i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}System.out.println();
		//100 200 3 4 출력
		//왜? 배열은 arrParam의 매개변수에 arr의 주소값이 들어감 => 배열은 주소를 참조하니까 값이 수정되고 (arrParam메소드의 로직대로) 출력됨
		
		//객체는 어떨까
//		Lunch l = new Lunch();
//		l.setCapacity(1);
//		l.setName("짜글이");
//		l.setPrice(5000);
//		l.setType("한식");
//		System.out.println(l.getType()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
//		//한식 짜글이 5000 1 출력
//		op.objParam(l);
//		System.out.println(l.getType()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
		// 한식 햄버거 8000 1 출력
		// 배열과 같은 이치로 같은 주소를 참조하게 되니 메소드 안에서 값을 바꾸면 main에서 적용이 됨
		
		//주소값을 알면 어느 클래스, 어느 메소드에서도 접근 가능!
		//*1번
		Lunch lunch = new Lunch();
		lunch.setMenu("볶음밥");
		lunch.setPrice(5000);
		lunch.setPlace("김밥천국");
		System.out.print(lunch.getMenu()+" "+lunch.getPrice()+" "+lunch.getPlace()+"\n");

		//*2번
		op.food(lunch);
		System.out.print(lunch.getMenu()+" "+lunch.getPrice()+" "+lunch.getPlace()+"\n");

		//*3번
		lunch.setCheck("체크테스트");
		lunch.checkTest();
		
		//*4번
		new Lunch().setCheck("이건뭘까?");
		new Lunch().checkTest();
		
		
		
		
		op.setCheck("대입값");
		op.checkTest();
		//대입값10 출력
		new ObjectParam().setCheck("이건"); //new로 새로운 객체를 만든 것이니 setCheck에 값을 넣어도 밑에 checkTest랑은 별개임
		new ObjectParam().checkTest();
		//null10 출력
		
		
		
		
		
		
		
		
		
	}

}
