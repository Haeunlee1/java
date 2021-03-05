package com.ex.homework.inherit.run;

import com.ex.homework.inherit.model.Employee;
import com.ex.homework.inherit.model.Student;


public class Run {

	public static void main(String[] args) {

		//Student, Employee 매개변수 값넣어서 출력하기
		
		Student s1 = new Student("이하은",26,"여자",3,2,"11011");
		Student s2 = new Student(1,2,"22022");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		// 출력값
		//이하은 26 여자 3 2 11011
		//null 0 null 1 2 22022 => 이름, 나이, 성별에는 값이 안 들어갔기 때문에 default값이 출력됨
		//toString은 모든 매개변수가 출력되게 해놨기 때문
		
		Employee e1 = new Employee("이하은",26,"여자","개발팀","대리",100);
		Employee e2 = new Employee("개발팀","사원",20);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		//출력값
		//이하은 26 여자 개발팀 대리 100
		//null 0 null 개발팀 사원 20 => 위랑 같은이유
		
		
		//동등비교하기
		//s2에 이름,나이,성별값을 s1과 맞춰줬음
		s2.setName("이하은");
		s2.setAge(26);
		s2.setGender("여자");
		
		if(s1.equals(s2)) {
			System.out.println("s1:s2는 같다");
		}else {
			System.out.println("다르다");
		}
		//출력 => 같다
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		Student s3 = new Student("이하은",26,"여자",3,2,"11011");
		Student s4 = new Student("이하은",26,"여자",3,2,"11011");
		
		if(s3.equals(s4)) {
			System.out.println("s3:s4 같다");
		}else {
			System.out.println("다르다");
		}
		System.out.println("s3 : "+s3.hashCode());
		System.out.println("s4 : "+s4.hashCode());
	}

}
