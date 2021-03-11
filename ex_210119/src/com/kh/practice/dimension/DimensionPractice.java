package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		System.out.println("====1번====");
		String[][] arr = new String[3][3];
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]="("+i+","+j+")";
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
			
		}
	}
	
	public void practice2() {
		System.out.println("====2번====");
		int num=1;
		int[][] arr = new int[4][4];
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=num;
				num+=1;
			}
		}
		for(int i=0; i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.printf("%3d",arr[i][j]);		//%5d=>오른쪽정렬
			}System.out.println();
		}
	}
	
	public void practice3() {
		System.out.println("====3번====");
		int num=16;
		int[][] numbers = new int[4][4];
		for(int i=0; i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				numbers[i][j]=num;
				num--;
			}
		}
		for(int i=0; i<numbers.length;i++) {
			for(int j=0;j<numbers.length;j++) {
				System.out.printf("%3d",numbers[i][j]);
			}System.out.println();
		}
		
	}
	
//	public void practice4() {
//		System.out.println("====4번====");
//		int[][] arr = new int[4][4];
//		int sum=0;
//		for(int i=0; i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				arr[i][j]=(int)(Math.random()*10)+1;
//				if(j==0) {
//					arr[i][0]+=sum;
//				}
//
//			}
//		}
////		for(int i=3;i>=0;i--) {
////			int j=0;
////			if(j==0) {
////				sum+=arr[i][j];
////			}
////		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.printf("%3d",arr[i][j]);
//			}System.out.println();
//		}
//	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		System.out.println("====5번====");
		while(true) {
			System.out.print("행 크기 : ");
			a = sc.nextInt();
			System.out.print("열 크기 : ");
			b = sc.nextInt();
			if(a<1||a>10||b<1||b>10) {
				System.out.println("반드시 1~10사이의 정수를 입력해야합니다");
			}else {
				break;
			}
		}
		int[][] numbers = new int[a][b];
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				numbers[i][j]=(int)(Math.random()*25)+66;
			}
		}
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print((char)numbers[i][j]+" ");
			}System.out.println();
		}
	}
	
	public void practice6() {
		System.out.println("====6번====");
		String[][] strArr = new String[][] {{"이","까","왔","앞","힘"},{"차","지","습","으","냅"},{"원","열","니","로","시"},{"배","심","다","좀","다"},{"열","히","!","더","!!"}};
		for(int i=0; i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				System.out.print(strArr[j][i]+" ");
			}System.out.println();
		}
	}
	
//	public void practice7() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("====7번====");
//		System.out.print("행의 크기 : ");
//		int a = sc.nextInt();
//		char[][] arr = new char[a][];
//		for(int i=0; i<a;i++) {
//			System.out.print(i+"행의 열 크기 : ");
//			int first = sc.nextInt();
//			arr[i]=new char[first];
//		}
//	}
	
	public void practice8() {
		
		String[] student = {"강건강","남나나","도대담","류라라","문미미","박보배","송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		String[] student1 = {"강건강","남나나","도대담","류라라","문미미","박보배"};
		String[] student2 = {"송성실","윤예의","진재주","차천축","피풍표","홍하하"};
		
		
	}
}
