package com.obj.main;

import com.obj.model.vo.Animal;

public class Run4 {

	public static void main(String[] args) {

		//Animal monkey = new Animal();
		
		//같은 변수에 값만 바꾸는 것은 인스턴스를 각각 만들어 이름으로 구분해주는게 좋다 
		Animal cat = new Animal();
		Animal dog = new Animal();
		Animal monkey = new Animal();
		
		
		cat.setType("Cat");
		cat.setName("야옹이");
		cat.setAge(20);
		cat.setLegs(4);
		System.out.println(cat.getType()+" "+cat.getName()+" "+cat.getAge()+" "+cat.getLegs());
		
		dog.setType("Dog");
		dog.setName("뽀삐");
		dog.setAge(3);
		dog.setLegs(4);
		System.out.println(dog.getType()+" "+dog.getName()+" "+dog.getAge()+" "+dog.getLegs());
		
		monkey.setType("Monkey");
		monkey.setName("숭이");
		monkey.setAge(6);
		monkey.setLegs(2);
		System.out.println(monkey.getType()+" "+monkey.getName()+" "+monkey.getAge()+" "+monkey.getLegs());
		
//		Animal.temp; // static이니까 클래스명.변수명 으로 접근이 가능 근데 접근제한자가 private이니까 접근 불가 , 접근하려면 get,set만들기
		//static 접근
		//클래스명.필드(or 메소드);
		Animal.setTemp(20);  // static은 공용값
		
//		System.out.println(cat.getTemp());
//		cat.setTemp(30);
//		System.out.println(dog.getTemp());  // static은 공용이라서 cat에서 30으로 바꿨어도 dog에서 똑같이 30으로 나옴
		// 좋은 접근은 아님 위처럼 클래스명으로 접근하기
	}

}
