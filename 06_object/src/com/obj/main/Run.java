package com.obj.main;
import com.obj.controller.*;

public class Run {
	public static void main(String[] args) {
		new BasicObjTest();		//BasicObjTest클래스 객체 생성!
		//new DefaultTest();		//Default는 다른 패키지에서 접근불가! 같은 패키지에서만 가능
		
		//FieldTest클래스 필드에 접근하기
		//1. 클래스를 생성해야함 => new 연산자 사용
		//2. 생성된 클래스의 주소를 가지고 접근 => 접근연산자(.)
		FieldTest fieldTest = new FieldTest();
		//생성된 객체의 필드 접근하기
		System.out.println(fieldTest.name);
		//필드에 값 넣기
		fieldTest.name="이하은";
		System.out.println(fieldTest.name);
//		System.out.println(fieldTest.age);   //default제어자로 에러남
//		System.out.println(fieldTest.email); //private제어자
		
		//static변수 접근하기
		FieldTest.nickName="박명수"; //public일때 어디서든 접근가능
		//FieldTest.name="이하은";  // name이 static이 아니면 static으로 접근불가 => new 생성해야지만 가능
		//FieldTest.height=180.5; // private이니까 접근불가 (같은 클래스에서만 가능)
		
		
		//초기화블럭이해하기
		InitblockTest ib = new InitblockTest();  // new로 생성하게 되면 초기화블럭이 자동으로 생성됨 그래서 밑에꺼보다 초기화블록안이 먼저 실행됨
		System.out.println(ib.name+ib.age+ib.height);
		
		//Student클래스를 만들어 보자
		//접근제한자는 어디서나 접근가능하게 설정
		//이름, 나이, 학년, 반, 주소, 키
		//필드를 출력해보자
		//본인의 정보가 출력되게 설정하세요
		//학년, 반 맘대로
		Student st = new Student(); //ctrl+shift+o =>자동import
		System.out.println(st.name+st.age+st.grade+st.group+st.add+st.height);
		System.out.println("st : "+st);
		
		// 다른 학생의 정보를 출력한다
		Student st1 = new Student();
		st1.name="이하은";
		System.out.println(st1.name+st1.age+st1.grade+st1.group+st1.add+st1.height);
		System.out.println("st1 : "+st1);
		
		
		//매개변수있는 생성자를 이용
		//생성시부터 원하는 데이터를 객체에 대입가능
//		Student s2 = new Student("이하은",26,1,3,"서울",190.3);
//		System.out.println(s2.name+s2.age+s2.grade+s2.group+s2.add+s2.height);
		
		Student s3 = new Student("김예진",26,"서울",190.5);
		System.out.println(s3.name+s3.age+s3.grade+s3.group+s3.add+s3.height);
		//-> 학년,반 안 넣었는데 출력된 이유 => 초기화블럭에서 값을 넣어놨기 때문
		// 기본생성자의 초기화값이 출력 안된 이유? => 생성자는 한개만 갖고올 수 있음 !!!! => 매개변수가 있는 생성자를 출력했으니 기본생성자는 불러오지 않는다 ㅏ
		// 초기화블럭에 초기화를 안 했다면 => int의 default값인 0이 출력됨
		
		
		
		//Animal클래스 만들어서 출력하기
		//종류, 이름, 나이, 서식지, 다리개수, 성별
		//개 바둑이 9 동네골목 4 남->출력
		//원숭이 원순이 10 일본 2 여 ->
		//코끼리 코돌이 77 냉장고 4 여 ->출력
		
		Animal dog = new Animal();
		System.out.println(dog.animal+" "+dog.name+" "+dog.age+" "+dog.place+" "+dog.legs+" "+dog.gender+" ");
		
		Animal monkey = new Animal("원숭이","원순이",10,"일본",2,'여');
		System.out.println(monkey.animal+" "+monkey.name+" "+monkey.age+" "+monkey.place+" "+monkey.legs+" "+monkey.gender+" ");
		
		Animal ele = new Animal("코끼리","코돌이",77,"냉장고",4,'여');
		System.out.println(ele.animal+" "+ele.name+" "+ele.age+" "+ele.place+" "+ele.legs+" "+ele.gender+" ");
		
		//만약 클래스에 매개변수있는 생성자를 만들고 default생성자를 만들지 않으면??
		//dafault생성자를 자동으로 생성해주지 않음
	}
	
}
