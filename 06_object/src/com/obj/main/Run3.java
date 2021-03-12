package com.obj.main;

import com.obj.controller.Person;

public class Run3 {

	public static void main(String[] args) {

		Person p = new Person();
		
		Person p1 = new Person("유병승",19,"경기도 시흥",180.5,65.5);
		
		//p에는 데이터가 없음
//		p.name="이하은"; //=> 캡슐화,,private => 함부로 수정금지, 원하는 데이터만 받기위한것
//		System.out.println(p1.name); => 캡슐화,,private => 함부로 수정금지, 원하는 데이터만 받기위한것
		
//		p.age=20;  // int를 public으로 변경하고 대입했음
//		System.out.println(p.age);
		//private 선언된 필드(멤버변수)에 접근할 수 있게 메소드를 추가함
		//setter()=>값을 필드에 넣는 것 & getter()=> 저장된 값을 가져오는 것
		System.out.println(p.getAge()); //=>0 출력됨 왜? p엔 age값이 없으니까
		System.out.println(p1.getAge()); //=> 19 출력됨, p1엔 19로 매개변수가 들어가있으니까
		
		//p의 age에 값 넣기
		p.setAge(-20); //=>조건문 넣었음, , false조건이면 기본값 0이 출력
		System.out.println(p.getAge());
		
		//생성되어있는 p를 내 데이터로 넣기
		p.setName("이하은");
		p.setAge(26);
		p.setAddr("서울");
		p.setHeight(166);
		p.setWeight(10);
		
		//객체 p 출력하기
		 System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddr()+" "+p.getHeight()+" "+p.getWeight());
	}

}
