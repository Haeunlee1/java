package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class LoopPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("===숫자입력하기===");
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i=1;i<=num;i++) {
				System.out.print(i+" ");
			}
		}else{
			System.out.println("1이상의 숫자를 입력하세요.");
		}System.out.println();
	}
	
	public void practice2() {
		System.out.println("===숫자입력하기2===");
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num>0) {
				for(int i=1;i<=num;i++) {
					System.out.print(i+" ");
				}
				break;
			}else{
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		}System.out.println();
		
	}
	public void practice3() {
		System.out.println("===숫자 거꾸로 출력하기===");
		System.out.print("1이상의 숫자를 입력하세요. : ");
		int num = sc.nextInt();
		if(num>0) {
			for(int i=num;i>0;i--) {
				System.out.print(i+" ");
			}
		}else{
			System.out.println("1이상의 숫자를 입력하세요.");
		}
		System.out.println();
	}
	public void practice4() {
		System.out.println("===숫자 거꾸로 출력하기2===");
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if(num>0) {
				for(int i=num;i>0;i--) {
					System.out.print(i+" ");
				}
				break;
			}else{
				System.out.println("1이상의 숫자를 입력하세요.");
			}
		
		}System.out.println();
	}
	
	public void practice5() {
		System.out.println("===정수들의 합 출력===");
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;
		int i;
		for(i=1;i<num;i++) {
			sum+=i;
			System.out.print(i+"+");
		}
		System.out.println(i+"="+(sum+i));
		
	}
	
	public void practice6() {
		System.out.println("===두 개의 값 사이의 숫자 출력===");
		System.out.print("첫 번째 숫자 : ");
		int num = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		if(num<1||num2<1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else if(num>num2){
			for(int i=num2;i<=num;i++) {
				System.out.print(i+" ");
			}
		}else {
			for(int i=num;i<=num2;i++) {
				System.out.print(i+" ");
			}
		}System.out.println();
		
	}
	public void practice7() {
		System.out.println("===두 개의 값 사이의 숫자 출력2===");
		while(true) {
			System.out.print("첫 번째 숫자 : ");
			int num = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();
			if(num<1||num2<1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else if(num>num2){
				for(int i=num2;i<=num;i++) {
					System.out.print(i+" ");
				}
			}else {
				for(int i=num;i<=num2;i++) {
					System.out.print(i+" ");
				}break;
			}System.out.println();
		}
	}
	
	public void practice8() {
		System.out.println("===구구단 출력===");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("====="+num+"단=====");
		for(int j=1;j<10;j++) {
			System.out.println(num+"*"+j+"="+(num*j));
		}
		
	}
	public void practice9() {
		System.out.println("===구구단 출력2===");
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if(num<10) {
			for(int i=num;i<10;i++) {
				System.out.println("===== "+i+"단=====");
				for(int j=1;j<10;j++) {
					System.out.println(i+"*"+j+"="+(num*j));
				}
			}
		}else {
		System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice10() {
		System.out.println("===구구단 출력3===");
		
		while(true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();	
			if(num<10) {
				for(int i=num;i<10;i++) {
					System.out.println("===== "+i+"단=====");
					for(int j=1;j<10;j++) {
						System.out.println(i+"*"+j+"="+(num*j));
					}
				}break;
			}else {
			}System.out.println("9 이하의 숫자만 입력해주세요.");
		}
	}
	
	public void practice11() {
		System.out.println("===공차 입력===");
		System.out.print("시작 숫자 : ");
		int num = sc.nextInt();
		System.out.print("공차 : ");
		int num2 = sc.nextInt();
		for(int i=0;i<10;i++) {
			System.out.print(num+" ");
			num+=num2;
		}
		System.out.println();
	}
	public void practice12() {
		System.out.println("===연산자계산===");
		while(true) {
			System.out.print("연산자(+, -, *, /, %) : ");
			String op = sc.next();
			if(op.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.print("정수1 : ");
			int num = sc.nextInt();
			System.out.print("정수2 : ");
			int num2= sc.nextInt();
			switch(op) {
				case "+" : System.out.println(num+"+"+num2+"="+(num+num2)); break;
				case "-" : System.out.println(num+"-"+num2+"="+(num-num2)); break;
				case "*" : System.out.println(num+"*"+num2+"="+(num*num2)); break;
				case "/" : 
					if(num2==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요."); break;
					}else {
						System.out.println(num+"/"+num2+"="+(num/num2)); break;
					}
				case "%" : System.out.println(num+"%"+num2+"="+(num%num2));break;
				default : System.out.println("없는 연산자입니다. 다시입력해주세요."); break;
			}
			
		}
	}
	public void practice13() {
		System.out.println("===별찍기===");
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}
	public void practice14() {
		System.out.println("===별찍기2===");
		System.out.println("정수 입력 : ");
		int num=sc.nextInt();
		for(int i=0;i<num;i++) {
			for(int j=num;j>i;j--) {
				System.out.print("*");
			}System.out.println("");
		}//System.out.println("");
	}
	
//	public void practice15() {
//		//1. 숫자 입력받기
//		//2. 소수인지 아닌지 판별/
//		//3. 2보다 작으면 잘못입력 출력
//		boolean b= true;
//		System.out.println("=====소수판별=====");
//		System.out.print("숫자 : ");
//		int num = sc.nextInt();				//숫자 입력받기
//		if(num<2) {
//			System.out.println("잘못 입력하셨습니다");		//입력값이 2보다 작으면 출력
//		}else {
//			for(int i=2;i<=num;i++) {
//				b=true;						//소수는 1과 자기자신을 약수로 가지니 i가 num일때까지 for문 돌리기
//				for(int j=2; j<i;j++) {		//1부터 num까지 나눴을 때 1이랑 num일때만 0이 나오고 그 외엔 다 0으로 떨어지면 안됨 / j가 i되기 전까지 돌리기
//					if(num%i==0) {			//j는 i보다 작은수고 i~num까지의 수들로 나눴을 때 0이 나오면 약수가 있다는 것이니 그러면 소수가 아니다 출력!
//						b=false;
//						break;
//					}
//				}
//
//			}
//		}
//		System.out.println(b?"소수입니다.":"소수가 아닙니다.");
//	}
//
//	public void practice16() {
//		while(true) {
//			System.out.println("=====소수판별=====");
//			System.out.print("숫자 : ");
//			int num = sc.nextInt();				//숫자 입력받기
//			if(num<2) {
//				System.out.println("잘못 입력하셨습니다");		//입력값이 2보다 작으면 출력
//			}else {
//				for(int i=2;i<=num;i++) {		//소수는 1과 자기자신을 약수로 가지니 i가 num일때까지 for문 돌리기
//					for(int j=2; j<i;j++) {		//1부터 num까지 나눴을 때 1이랑 num일때만 0이 나오고 그 외엔 다 0으로 떨어지면 안됨 / j가 i되기 전까지 돌리기
//						if(num%i==0) {			//j는 i보다 작은수고 i~num까지의 수들로 나눴을 때 0이 나오면 약수가 있다는 것이니 그러면 소수가 아니다 출력!
//							System.out.println("소수가 아닙니다");
//							break;
//						}else {
//							System.out.println("소수입니다.");
//							return;
//						}
//					}
//
//				}
//			}
//		}
//		
//	}
	
	public void practice17() {
		//소수의 갯수를 구하라
		System.out.print("수 입력 : ");
		int cho=sc.nextInt();
		boolean flag = true;		//기본적으로 모든 수는 소수라고 가정하기 
		if(cho<2) {
			System.out.println("잘못입력하셨습니다");
		}else {
			//5 입력시 -> 1 소수니? 2 소수니? 3 소수니? 4 소수니? 5 소수니? 계속 물어봐야하는 것
			int prime=0;
			String primen="";
			for(int i=2;i<=cho;i++) {
				flag=true;
				for(int j=2;j<i;i++) {
					if(cho%i==0) {
						flag=false;
						break;
					}
				}
				if(flag) {
					prime++;
					primen+=i+" ";
				}
			}
			System.out.println(prime);
			System.out.println("소수의 개수 : "+primen);
		}
		
	}
	
	public void practice18() {
		//자연수 입력받기
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		for(int i=2; i<=num;i++) {
			if(i%2==0||i%3==0) {
				System.out.print(i+" ");
			}
		}
		int count=0;
		for(int i=2;i<=num;i++) {
			if(i%2==0&&i%3==0) {
				count++;
			}
		}
		System.out.println();
		System.out.print("count : "+count);
		
		
	}
	
	
	public void practice19() {
		System.out.print("정수입력 : ");
		int k=0;
		int num = sc.nextInt();
		for(int j=0;j<num;j++) {
			for(int m=num-1;m>j;m--) {
				System.out.print(" ");
			}
			for(int i=0;i<=k;i++) {
				System.out.print("*");
			}
			k++;
			System.out.println();
		}
		
	}
	
	public void practice20() {
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		int k=0;
		for(int i=0; i<num*2;i++) {
			for(int j=0;j<k;j++) {
				System.out.print("*");
			}System.out.println();
			if(i<num) {
				k++;
			}else {
				k--;
			}
		}
	}
}
