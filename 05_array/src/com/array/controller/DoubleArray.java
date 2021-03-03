package com.array.controller;

import java.util.Random;
public class DoubleArray {
	
	public void basicDoubleArray() {
		
		//2차원배열 바독판 형식의 저장소를 뜻함
		//행 ㅣ 열 ㅡ
		int[][] arr=new int[3][3];
		//ㅁㅁㅁ  00 01 02
		//ㅁㅁㅁ  10 11 12
		//ㅁㅁㅁ  20 21 22
		
		arr[0][0]=100;
		arr[0][1]=200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for문을 이용해서 2차원배열 처리하기
//		arr[0][0];
//		arr[0][1];
//		arr[0][2];
//		arr[1][0];
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		//2차월 배열에 값 넣기
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr[i][j]=new Random().nextInt(8)+1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		System.out.println();
		arr= new int[3][5];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {		//arr.length=>첫번째[]값임 (2차원배열영상보기) / 두번째[]값을 쓰려면 arr[i].length로 써야함!
				arr[i][j]=new Random().nextInt(8)+1;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		
		
	}
	
	
	
}
