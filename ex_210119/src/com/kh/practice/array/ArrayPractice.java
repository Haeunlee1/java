package com.kh.practice.array;
import java.util.Scanner;
import java.util.Random;

public class ArrayPractice {
	Scanner sc = new Scanner(System.in);
	public void practice1() {
		System.out.println("===1~10����===");
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			number[i]=i+1;
			System.out.println(number[i]);
			
		}
	}
	
	public void practice2() {
		System.out.println("===10~1����===");
		int[] number = new int[10];
		for(int i=0;i<number.length;i++) {
			for(int j=number.length;j>0;j--) {
				number[i]=j;
				System.out.println(number[i]);
			}
		}
	}
	
	public void practice3() {
		System.out.println("===�Է¹��� ���� �迭 ���� �� 1���� ���===");
		System.out.print("���� ���� : ");
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
		System.out.println("===�� ����ϱ�===");
		String[] fruits = new String[5];
		fruits[0]="���";
		fruits[1]="��";
		fruits[2]="����";
		fruits[3]="������";
		fruits[4]="����";
		
		System.out.println(fruits[1]);
		
		
	}
	public void practice5() {
		System.out.println("===���ڿ��� ���� ���ڰ��� ã��===");
		System.out.print("���ڿ� : ");
		String word = sc.next();
		System.out.print("���� : ");
		char c = sc.next().charAt(0);
		char[] k = new char[word.length()];
		int count=0;
		for(int i=0;i<word.length();i++) {
			k[i]=word.charAt(i);		//word�� ���ڿ��� ���� ����
		}
		System.out.print(word+"�� "+c+"�� �����ϴ� ��ġ(�ε���) : ");
		for(int i=0;i<k.length;i++) {
			if(k[i]==c) {
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		System.out.print(c+" ���� : "+count);
		
	}
		
		

	public void practice6() {
		String[] days = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		System.out.println("===�������===");
		System.out.print("0~6���� ���� �Է� : ");
		int num = sc.nextInt();
		if(num>=0&&num<7)	{	
			System.out.println(days[num]);
		}else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		}
	}
	public void practice7() {
		System.out.println("===�迭����===");
		System.out.print("���� : ");
		int num = sc.nextInt();
		int[] numbers;
		numbers = new int[num];
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			System.out.print("�迭 "+i+"��° �ε����� ���� �� : ");
			numbers[i]=sc.nextInt();	
		}
		for(int i=0; i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
			sum+=numbers[i];
		}
		System.out.println();
		System.out.println("�� �� : "+sum);
			
	}
//	public void practice8() {
//		System.out.println("===����,��������===");
//		while(true) {
//			System.out.print("���� : ");
//			int num = sc.nextInt();
//			if(num%2==0||num<3) {
//				System.out.println("�ٽ��Է��ϼ���");
//			}
//		}for(int i=1; i<;i++)
//	
//		
//	}
	
	
	public void practice9() {
		boolean check=false;
		String[] menu = {"���","�Ķ��̵�","�Ĵ�","�Ѹ�Ŭ","����޺�"};
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String chicken = sc.next();
		for(int i=0;i<menu.length;i++) {
			if(menu[i].equals(chicken)) {
				check=true;
			}
		}System.out.println(chicken+"�� "+(check?"��� ����":"���� �޴� �Դϴ�."));
		
		
	}
	
//	public void practice10() {
//		String[] num;
//		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
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
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
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
		
		System.out.print("���ڿ� : ");
		String str = sc.next();
		char[] a = new char[str.length()];
		int count =0;
		for(int i=0;i<str.length();i++) {
			a[i]=str.charAt(i);			//���ڿ� str�� ���ڸ� a�迭�� �ֱ�
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
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		String[] numArr = new String[num];
		for(int i=0; i<numArr.length;i++) {
			System.out.print(i+"��° ���ڿ� : ");
			String a = sc.next();
			numArr[i]=a;
		}
		System.out.print("�߰��� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
		char answer = sc.next().charAt(0);
		if(answer=='N'||answer=='n') {
			for(int i=0;i<)
		}
		System.out.print("�߰� �Է� �� ���� : ");
		int add = sc.nextInt();
		for(int i=num+1; i<add;i++) {
			System.out.print(i+"��° ���ڿ� : ");
			String a = sc.next();
			numArr[i]=a;
		}
		System.out.print("�߰��� �Է��Ͻðڽ��ϱ�?(Y/N) : ");
		char answer2 = sc.next().charAt(0);
		System.out.print("�߰� �Է� �� ���� : ");
		int add2 = sc.nextInt();
	}
}
