package com.kh.practice.dimension;

import java.util.Scanner;

public class DimensionPractice {

	public void practice1() {
		System.out.println("====1��====");
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
		System.out.println("====2��====");
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
				System.out.printf("%3d",arr[i][j]);		//%5d=>����������
			}System.out.println();
		}
	}
	
	public void practice3() {
		System.out.println("====3��====");
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
//		System.out.println("====4��====");
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
		System.out.println("====5��====");
		while(true) {
			System.out.print("�� ũ�� : ");
			a = sc.nextInt();
			System.out.print("�� ũ�� : ");
			b = sc.nextInt();
			if(a<1||a>10||b<1||b>10) {
				System.out.println("�ݵ�� 1~10������ ������ �Է��ؾ��մϴ�");
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
		System.out.println("====6��====");
		String[][] strArr = new String[][] {{"��","��","��","��","��"},{"��","��","��","��","��"},{"��","��","��","��","��"},{"��","��","��","��","��"},{"��","��","!","��","!!"}};
		for(int i=0; i<strArr.length;i++) {
			for(int j=0;j<strArr[i].length;j++) {
				System.out.print(strArr[j][i]+" ");
			}System.out.println();
		}
	}
	
//	public void practice7() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("====7��====");
//		System.out.print("���� ũ�� : ");
//		int a = sc.nextInt();
//		char[][] arr = new char[a][];
//		for(int i=0; i<a;i++) {
//			System.out.print(i+"���� �� ũ�� : ");
//			int first = sc.nextInt();
//			arr[i]=new char[first];
//		}
//	}
	
	public void practice8() {
		
		String[] student = {"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		String[] student1 = {"���ǰ�","������","�����","�����","���̹�","�ں���"};
		String[] student2 = {"�ۼ���","������","������","��õ��","��ǳǥ","ȫ����"};
		
		
	}
}
