package com.array.controller;
import java.util.Scanner;
import java.util.Random;
public class ArrayController {

	public void basicArray() {
		// 배열은 동일한 자료형의 변수 여러개를 관리하는 것
		// 배열의 선언은 변수와 비슷함, 대신 대괄호를 붙여줘야함
		// 배열은 선언한다고 해서 바로 사용할 수는 없고 할당까지 해줘야함
		//배열의 할당 -> new 라는 연산자를 통해 함
		// 자료형[] 변수명ㅁ = new 자료형[생성할 변수의 갯수];
		
		//배열선언
		int[] nums;
		nums = new int[5];
		int[] nums2 = new int[3];
		
		//배열 저장공간에 접근하기
		//인덱스 번호로 접근
		//배열명[인덱스번호];
		//nums[0];//nums배열의 0번째(첫번째) 값
		System.out.println("nums[1] : "+nums[1]);
		//배열은 할당을 통해 저장공간을 만들게 되면 default 값으로 초기화됨.
		//default값 int->0 / char->' ' / double->0.0 / String->null
		
		//배열 저장공간에 값 대입하기
		nums[0]=100;
		System.out.println(nums[0]);
		
		//index 최대값을 넘어서 접근시
		//System.out.println(nums[5]);
		
		
		//배열의 각 변수에 대입을 해보자
		String[] names = new String[3];
		names[0]="이하은";
		names[1]="정유정";
		names[2]="권설영";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//for문으로 배열 출력하기
		for(int i=0;i<3;i++) {
			System.out.println(names[i]);
		}
		
		//대입에 for문 적용하기
		for(int i=0;i<names.length;i++) {
			names[i]="힘내요 잠깨고~";
			System.out.println(names[i]);
		}
		
		//배열로 생성된 저장공간(변수) 자료형이 고정됨
		int[] ages = new int[5];
		ages[0] = 100;
		
		//저장공간이 3개인 String배열을 만들고 입력받은 값을 저장하고 출력
		String[] str = new String[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<str.length;i++) {
			System.out.print("문자열을 입력하세요");
			str[i] = sc.nextLine();
		}
		for(int i=0; i<3;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println(str);
		System.out.println(names);
		
		String[] studentName = new String[5];
		studentName[0]="지수현";
		studentName[1]="이하은";
		studentName[2]="이진주";
		studentName[3]="이우식";
		studentName[4]="이우정";
		
		//학생 이름 중 신충현이 있는지 확인
		boolean check = false;
		for(int i=0; i<studentName.length;i++) {
			if(studentName[i].equals("신충현")) {
				check = true;
			}
		}System.out.println(check?"있어":"없어");		//삼항연산자 쓰려면 boolean값으로 해야하니까 check변수 만들고 지정해줌
		
		//입력받은 이름이 있는지 찾는 로직구현
		//내가 한거
		System.out.print("이름 입력");
		String name = sc.next();
		for(int i=0;i<studentName.length;i++) {
			if(studentName[i].equals(name)) {
				System.out.println(i+"번째에"+name+" 있다");
			}
		}
		
		//쌤이 하신거
		check = false;
		for(int i=0; i<studentName.length;i++) {
			if(studentName[i].equals(name)) {
				check=true;
			}
		}System.out.println(name+"은 "+(check?"있어":"없어"));
		
		//배열 생성과 동시에 초기화하기(값을 바로 대입한다)
		
		double[] height2 = {180.5,166,157.3,180.0};		//생성과 동시에 초기화하기 1번
		for(int i=0;i<height2.length;i++) {
			System.out.println(height2[i]);
		}
		
		double[] height = new double[10];
		height = new double[] {10.2,20,32}; //=> 생성하고 그 후에 값을 넣으려면 new 데이터타입[] 한 후에 값 넣어주기
	}
	
	
	//배열 저장공간 활용하기
	public void changeData() {
		//배열에 저장된 데이터들간의 위치조정 
		//배열 순서 변경하기
		int[] num = {1,3,4,5,10};
		//2번 인덱스의 4와 4번인덱스 10번을 바꾸고싶다
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int temp = num[2]; //임의변수를 만들어서 옮길값을 저장해놓음 왜? 변수는 한가지의 값만 가질 수 있으니까 아래처럼 선언하면 2,4랑 같은 값이 저장됨
		num[2]=num[4];
		num[4]=temp;
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}System.out.println();
		
		//배열의 값들을 순차적으로 정렬하기
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(j+" "+num[i]+" : "+num[j]+" ");
				//오름차순변경
				if(num[i]<num[j]) {		
					//변경하기
					int t=num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
			System.out.println();
		}
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		// 1,3,10,5,4 순 => i=0일때 j=0, 그치만 0<0 false 넘어감
		// i=1, j=0, 0<1 true, num[1]=3&num[0]=1 => if문 false 넘어감 쭉쭉 넘어가다가
		
		// 손그림 그려보기 or 다시!!! 꼭 복습하기 
		
	}
	public void test() {
		//int 10개짜리 배열을 선언하고 임의의 값을 넣어라
		//4,5,9,10,22,4,53,12,16,88 을 대입하고
		//그 안에서 짝수, 홀수의 갯수 출력하기
		
		int[] nums = {4,5,9,10,22,4,53,12,16,88};
		int count =0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]%2==0) {
				count++;
				System.out.print(nums[i]);
			}
		}
		System.out.println("짝수 갯수 : "+count);
		System.out.println("홀수 갯수 : "+(nums.length-count));
		
		
	}
	
	//랜덤 숫자값 출력
	public void randomTest() {
		//Math클래스에서 제공하는 random()기능을 이용한다
		System.out.println(Math.random()); //메소드가 실행될 때 마다 랜덤값을 출력 => 소숫점으로 나옴
		//random을 정수로 변경하려면?
		//Math.random()*10;   *10 =>0~9까지 / 
		System.out.println((int)(Math.random()*10)); //(int)Math.random()*10 << 주의하기 Math.random()*10을 전체 괄호로 묶어줘야함
		System.out.println((int)(Math.random()*5)+1); //*5까지 하면 0~4까지임, +1하면 1~5까지
		//1~45까지 로또번호 출력해보기
		System.out.println((int)(Math.random()*44)+1);
		//6개 자리에 각 번호가 들어감 -> 중복값이 없어야함
		
		//배열 int 6개짜리 배열을 만들고 각 인덱스에 랜덤값을 넣어라 단, 1~28까지
		int[] lotto = new int[6];
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*28)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
			}
			//System.out.print(lotto[i]+" ");
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
		//중복값 제거하기 => 함 해보기
		
		
		
		//랜덤값출력
		//Random객체를 이용하는 방법
		//Random객제의 nextInt() 기능을 이용함
		System.out.println();
		System.out.println(new Random().nextInt());
		//nextInt(범위값) -> 0~9 nextInt(10);
		System.out.println(new Random().nextInt(10)+1);
		
		
	}
	
	//배열복사
	public void copyArray() {
		
		//두가지 방식
		//1. 얕은 복사 -> 배열명의 주소값을 복사
		String[] hobby = {"스마트폰","축구","낚시","청소"};
		String[] hobby2 = hobby; //얕은복사 => 주소값 복사 => 인덱스 값을 바꿀 수 있음 =>참조되는 것!! (생활코딩 '참조'영상)
		System.out.println(hobby2);
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		hobby2[0]="사진찍기";
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		
		
		//2. 깊은 복사 -> 배열에 연결된 공간복사
		String[] hobby3= new String[hobby.length]; 	//아예 hobby3라는 새 배열을 만들어서 
		for(int i=0;i<hobby.length;i++) {
			hobby3[i]=hobby[i];						//값을 넣음 like복제
		}
		for(int i=0; i<hobby.length;i++) {
			System.out.println("hobby"+hobby[i]);
		}
		for(int i=0; i<hobby3.length;i++) {
			System.out.println("hobby3"+hobby3[i]);
		}
		
		hobby[0]="수영";								// 주소값 복사가 아닌 hobby3에 복사를 한거기 때문에 hobby 값들을 바꾸더라도 hobby3의 값은 바뀌지않는다.
		for(int i=0; i<hobby.length;i++) {
			System.out.println("hobby"+hobby[i]);
		}
		for(int i=0; i<hobby3.length;i++) {
			System.out.println("hobby3"+hobby3[i]);
		}
		
		//배열 카피하는 메소드(기준배열,시작인덱스 ,복사할배열,시작인덱스,길이)
		String[] hobby4=new String[5];					//new를 통해 생성된 것은 별도의 저장공간이 생긴다는 점 
		System.arraycopy(hobby, 0, hobby4, 0, 3);		//배열hobby 0번인덱스를 시작점으로 hobby4배열의 0번째부터 3개를 복사하겠다
		
		for(int i=0;i<hobby4.length;i++) {				//수영(0),축구(1),낚시(2) => 총 3개를 hobby4의 0번 인덱스부터 차례대로 넣었고 값이 없는 3,4인덱스는 null로 출력됨
			System.out.println(hobby4[i]);
		}
		hobby4[2]="농구";
		System.out.println();
	}
	
	
	
	
	
	
}
