package com.array.controller;

import java.util.Random;
public class DoubleArray {
	
	public void basicDoubleArray() {
		
		//2�����迭 �ٵ��� ������ ����Ҹ� ����
		//�� �� �� ��
		int[][] arr=new int[3][3];
		//������  00 01 02
		//������  10 11 12
		//������  20 21 22
		
		arr[0][0]=100;
		arr[0][1]=200;
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		
		//for���� �̿��ؼ� 2�����迭 ó���ϱ�
//		arr[0][0];
//		arr[0][1];
//		arr[0][2];
//		arr[1][0];
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]+" ");
			}System.out.println();
		}
		//2���� �迭�� �� �ֱ�
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
			for(int j=0;j<arr[i].length;j++) {		//arr.length=>ù��°[]���� (2�����迭���󺸱�) / �ι�°[]���� ������ arr[i].length�� �����!
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
