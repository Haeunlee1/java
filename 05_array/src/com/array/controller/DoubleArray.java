package com.array.controller;

import java.util.Random;
public class DoubleArray {
	
	public void basicDoubleArray() {
		
		//2託据壕伸 郊偽毒 莫縦税 煽舌社研 倶敗
		//楳 び 伸 ぱ
		int[][] arr=new int[3][3];
		//けけけ  00 01 02
		//けけけ  10 11 12
		//けけけ  20 21 22
		
		arr[0][0]=100;
		arr[0][1]=200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for庚聖 戚遂背辞 2託据壕伸 坦軒馬奄
//		arr[0][0];
//		arr[0][1];
//		arr[0][2];
//		arr[1][0];
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		//2託杉 壕伸拭 葵 隔奄
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
			for(int j=0;j<arr[i].length;j++) {		//arr.length=>湛腰属[]葵績 (2託据壕伸慎雌左奄) / 砧腰属[]葵聖 床形檎 arr[i].length稽 潤醤敗!
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
