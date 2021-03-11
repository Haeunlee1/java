package com.kh.practice.array;
import java.util.Scanner;
import java.util.Random;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("===1~10까지===");
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			number[i]=i+1;
			System.out.println(number[i]);
			
		}
	}
	
	public void practice2() {
		System.out.println("===10~1까지===");
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			for(int j=number.length;j>0;j--) {
				number[i]=j;
				System.out.println(number[i]);
			}
		}
	}
	
	public void practice3() {
		System.out.println("===입력받은 수로 배열 생성 후 1부터 출력===");
		System.out.print("양의 정수 : ");
		int num = sc.nextInt();
		int[] numbers = new int[num];
		for(int i=0; i<numbers.length;i++) {
			numbers[i]=i+1;
		}
		for(int i=0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
	}
	
	public void practice4() {
		System.out.println("===귤 출력하기===");
		String[] fruits = new String[5];
		fruits[0]="사과";
		fruits[1]="귤";
		fruits[2]="포도";
		fruits[3]="복숭아";
		fruits[4]="참외";
		
		System.out.println(fruits[1]);
		
		
	}
	public void practice5() {
		System.out.println("===문자열의 같은 문자개수 찾기===");
		System.out.print("문자열 : ");
		String word = sc.next();
		System.out.print("문자 : ");
		char c = sc.next().charAt(0);
		char[] k = new char[word.length()];
		int count=0;
		for(int i=0;i<word.length();i++) {
			k[i]=word.charAt(i);		//word의 문자열을 각각 저장
		}
		System.out.print(word+"에 "+c+"가 존재하는 위치(인덱스) : ");
		for(int i=0;i<k.length;i++) {
			if(k[i]==c) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print(c+" 개수 : "+count);
		
	}
		
		

	public void practice6() {
		String[] days = {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"};
		System.out.println("===요일출력===");
		System.out.print("0~6사이 숫자 입력 : ");
		int num = sc.nextInt();
		if(num>=0&&num<7)	{	
			System.out.println(days[num]);
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	public void practice7() {
		System.out.println("===배열선언===");
		System.out.print("정수 : ");
		int num = sc.nextInt();
		int[] numbers;
		numbers = new int[num];
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			System.out.print("배열 "+i+"번째 인덱스에 넣을 값 : ");
			numbers[i]=sc.nextInt();	
		}
		for(int i=0; i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			sum+=numbers[i];
		}
		System.out.println();
		System.out.println("총 합 : "+sum);
			
	}
//	public void practice8() {
//		System.out.println("===오름,내림차순===");
//		while(true) {
//			System.out.print("정수 : ");
//			int num = sc.nextInt();
//			if(num%2==0||num<3) {
//				System.out.println("다시입력하세요");
//			}
//		}for(int i=1; i<;i++)
//	
//		
//	}
	
	
	public void practice9() {
		boolean check=false;
		String[] menu = {"양념","후라이드","파닭","뿌링클","허니콤보"};
		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.next();
		for(int i=0;i<menu.length;i++) {
			if(menu[i].equals(chicken)) {
				check=true;
			}
		}System.out.println(chicken+"은 "+(check?"배달 가능":"없는 메뉴 입니다."));
		
		
	}
	
//	public void practice10() {
//		String[] num;
//		System.out.print("주민등록번호(-포함) : ");
//		num =new String[sc.next();]
//		number=new String[num.length];
//		
//	}
	
	public void practice11() {
		int[] lotto = new int[10];
		for(int i=0; i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*10)+1;
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	public void practice12() {
		int[] nums = new int[10];
		
		for(int i=0; i<nums.length;i++) {
			nums[i]=(int)(Math.random()*10)+1;
		}
		int max = nums[0];
		int min = nums[0];
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		for(int i=1;i<nums.length;i++) {
			if(max<nums[i]) {
				max=nums[i];
			}
			if(min>nums[i]) {
				min=nums[i];
			}
		}System.out.println();
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
	}
	
	public void practice13() {
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		} 
	}
	
	public void practice14() {
		int[] lotto = new int[6];
		for(int i =0; i<lotto.length;i++) {
			lotto[i]=(int)(Math.random()*45)+1;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
				}
				if(lotto[i]<lotto[j]) {
					int t = lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=t;
				}
			}
		}
		for(int i=0;i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
	}
	
	public void practice15() {
		
		System.out.print("문자열 : ");
		String str = sc.next();
		char[] a = new char[str.length()];
		int count =0;
		for(int i=0;i<str.length();i++) {
			a[i]=str.charAt(i);			//문자열 str의 문자를 a배열에 넣기
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
					i--;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	
		
	}
	
	public void practice16() {
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		String[] numArr = new String[num];
		for(int i=0; i<numArr.length;i++) {
			System.out.print(i+"번째 문자열 : ");
			String a = sc.next();
			numArr[i]=a;
		}
		System.out.print("추가로 입력하시겠습니까?(Y/N) : ");
		char answer = sc.next().charAt(0);
		if(answer=='N'||answer=='n') {
			for(int i=0;i<)
		}
		System.out.print("추가 입력 할 개수 : ");
		int add = sc.nextInt();
		for(int i=num+1; i<add;i++) {
			System.out.print(i+"번째 문자열 : ");
			String a = sc.next();
			numArr[i]=a;
		}
		System.out.print("추가로 입력하시겠습니까?(Y/N) : ");
		char answer2 = sc.next().charAt(0);
		System.out.print("추가 입력 할 개수 : ");
		int add2 = sc.nextInt();
	}
}
