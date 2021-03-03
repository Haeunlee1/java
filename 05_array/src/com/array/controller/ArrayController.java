package com.array.controller;
import java.util.Scanner;
import java.util.Random;
public class ArrayController {

	public void basicArray() {
		// �迭�� ������ �ڷ����� ���� �������� �����ϴ� ��
		// �迭�� ������ ������ �����, ��� ���ȣ�� �ٿ������
		// �迭�� �����Ѵٰ� �ؼ� �ٷ� ����� ���� ���� �Ҵ���� �������
		//�迭�� �Ҵ� -> new ��� �����ڸ� ���� ��
		// �ڷ���[] ������ = new �ڷ���[������ ������ ����];
		
		//�迭����
		int[] nums;
		nums = new int[5];
		int[] nums2 = new int[3];
		
		//�迭 ��������� �����ϱ�
		//�ε��� ��ȣ�� ����
		//�迭��[�ε�����ȣ];
		//nums[0];//nums�迭�� 0��°(ù��°) ��
		System.out.println("nums[1] : "+nums[1]);
		//�迭�� �Ҵ��� ���� ��������� ����� �Ǹ� default ������ �ʱ�ȭ��.
		//default�� int->0 / char->' ' / double->0.0 / String->null
		
		//�迭 ��������� �� �����ϱ�
		nums[0]=100;
		System.out.println(nums[0]);
		
		//index �ִ밪�� �Ѿ ���ٽ�
		//System.out.println(nums[5]);
		
		
		//�迭�� �� ������ ������ �غ���
		String[] names = new String[3];
		names[0]="������";
		names[1]="������";
		names[2]="�Ǽ���";
		
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		
		//for������ �迭 ����ϱ�
		for(int i=0;i<3;i++) {
			System.out.println(names[i]);
		}
		
		//���Կ� for�� �����ϱ�
		for(int i=0;i<names.length;i++) {
			names[i]="������ �����~";
			System.out.println(names[i]);
		}
		
		//�迭�� ������ �������(����) �ڷ����� ������
		int[] ages = new int[5];
		ages[0] = 100;
		
		//��������� 3���� String�迭�� ����� �Է¹��� ���� �����ϰ� ���
		String[] str = new String[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<str.length;i++) {
			System.out.print("���ڿ��� �Է��ϼ���");
			str[i] = sc.nextLine();
		}
		for(int i=0; i<3;i++) {
			System.out.println(str[i]);
		}
		
		System.out.println(str);
		System.out.println(names);
		
		String[] studentName = new String[5];
		studentName[0]="������";
		studentName[1]="������";
		studentName[2]="������";
		studentName[3]="�̿��";
		studentName[4]="�̿���";
		
		//�л� �̸� �� �������� �ִ��� Ȯ��
		boolean check = false;
		for(int i=0; i<studentName.length;i++) {
			if(studentName[i].equals("������")) {
				check = true;
			}
		}System.out.println(check?"�־�":"����");		//���׿����� ������ boolean������ �ؾ��ϴϱ� check���� ����� ��������
		
		//�Է¹��� �̸��� �ִ��� ã�� ��������
		//���� �Ѱ�
		System.out.print("�̸� �Է�");
		String name = sc.next();
		for(int i=0;i<studentName.length;i++) {
			if(studentName[i].equals(name)) {
				System.out.println(i+"��°��"+name+" �ִ�");
			}
		}
		
		//���� �ϽŰ�
		check = false;
		for(int i=0; i<studentName.length;i++) {
			if(studentName[i].equals(name)) {
				check=true;
			}
		}System.out.println(name+"�� "+(check?"�־�":"����"));
		
		//�迭 ������ ���ÿ� �ʱ�ȭ�ϱ�(���� �ٷ� �����Ѵ�)
		
		double[] height2 = {180.5,166,157.3,180.0};		//������ ���ÿ� �ʱ�ȭ�ϱ� 1��
		for(int i=0;i<height2.length;i++) {
			System.out.println(height2[i]);
		}
		
		double[] height = new double[10];
		height = new double[] {10.2,20,32}; //=> �����ϰ� �� �Ŀ� ���� �������� new ������Ÿ��[] �� �Ŀ� �� �־��ֱ�
	}
	
	
	//�迭 ������� Ȱ���ϱ�
	public void changeData() {
		//�迭�� ����� �����͵鰣�� ��ġ���� 
		//�迭 ���� �����ϱ�
		int[] num = {1,3,4,5,10};
		//2�� �ε����� 4�� 4���ε��� 10���� �ٲٰ�ʹ�
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		System.out.println();
		int temp = num[2]; //���Ǻ����� ���� �ű氪�� �����س��� ��? ������ �Ѱ����� ���� ���� �� �����ϱ� �Ʒ�ó�� �����ϸ� 2,4�� ���� ���� �����
		num[2]=num[4];
		num[4]=temp;
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}System.out.println();
		
		//�迭�� ������ ���������� �����ϱ�
		for(int i=0;i<num.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.println(j+" "+num[i]+" : "+num[j]+" ");
				//������������
				if(num[i]<num[j]) {		
					//�����ϱ�
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
		// 1,3,10,5,4 �� => i=0�϶� j=0, ��ġ�� 0<0 false �Ѿ
		// i=1, j=0, 0<1 true, num[1]=3&num[0]=1 => if�� false �Ѿ ���� �Ѿ�ٰ�
		
		// �ձ׸� �׷����� or �ٽ�!!! �� �����ϱ� 
		
	}
	public void test() {
		//int 10��¥�� �迭�� �����ϰ� ������ ���� �־��
		//4,5,9,10,22,4,53,12,16,88 �� �����ϰ�
		//�� �ȿ��� ¦��, Ȧ���� ���� ����ϱ�
		
		int[] nums = {4,5,9,10,22,4,53,12,16,88};
		int count =0;
		for(int i=0; i<nums.length;i++) {
			if(nums[i]%2==0) {
				count++;
				System.out.print(nums[i]);
			}
		}
		System.out.println("¦�� ���� : "+count);
		System.out.println("Ȧ�� ���� : "+(nums.length-count));
		
		
	}
	
	//���� ���ڰ� ���
	public void randomTest() {
		//MathŬ�������� �����ϴ� random()����� �̿��Ѵ�
		System.out.println(Math.random()); //�޼ҵ尡 ����� �� ���� �������� ��� => �Ҽ������� ����
		//random�� ������ �����Ϸ���?
		//Math.random()*10;   *10 =>0~9���� / 
		System.out.println((int)(Math.random()*10)); //(int)Math.random()*10 << �����ϱ� Math.random()*10�� ��ü ��ȣ�� ���������
		System.out.println((int)(Math.random()*5)+1); //*5���� �ϸ� 0~4������, +1�ϸ� 1~5����
		//1~45���� �ζǹ�ȣ ����غ���
		System.out.println((int)(Math.random()*44)+1);
		//6�� �ڸ��� �� ��ȣ�� �� -> �ߺ����� �������
		
		//�迭 int 6��¥�� �迭�� ����� �� �ε����� �������� �־�� ��, 1~28����
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
		
		//�ߺ��� �����ϱ� => �� �غ���
		
		
		
		//���������
		//Random��ü�� �̿��ϴ� ���
		//Random������ nextInt() ����� �̿���
		System.out.println();
		System.out.println(new Random().nextInt());
		//nextInt(������) -> 0~9 nextInt(10);
		System.out.println(new Random().nextInt(10)+1);
		
		
	}
	
	//�迭����
	public void copyArray() {
		
		//�ΰ��� ���
		//1. ���� ���� -> �迭���� �ּҰ��� ����
		String[] hobby = {"����Ʈ��","�౸","����","û��"};
		String[] hobby2 = hobby; //�������� => �ּҰ� ���� => �ε��� ���� �ٲ� �� ���� =>�����Ǵ� ��!! (��Ȱ�ڵ� '����'����)
		System.out.println(hobby2);
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		hobby2[0]="�������";
		System.out.println(hobby[0]);
		System.out.println(hobby2[0]);
		
		
		//2. ���� ���� -> �迭�� ����� ��������
		String[] hobby3= new String[hobby.length]; 	//�ƿ� hobby3��� �� �迭�� ���� 
		for(int i=0;i<hobby.length;i++) {
			hobby3[i]=hobby[i];						//���� ���� like����
		}
		for(int i=0; i<hobby.length;i++) {
			System.out.println("hobby"+hobby[i]);
		}
		for(int i=0; i<hobby3.length;i++) {
			System.out.println("hobby3"+hobby3[i]);
		}
		
		hobby[0]="����";								// �ּҰ� ���簡 �ƴ� hobby3�� ���縦 �Ѱű� ������ hobby ������ �ٲٴ��� hobby3�� ���� �ٲ����ʴ´�.
		for(int i=0; i<hobby.length;i++) {
			System.out.println("hobby"+hobby[i]);
		}
		for(int i=0; i<hobby3.length;i++) {
			System.out.println("hobby3"+hobby3[i]);
		}
		
		//�迭 ī���ϴ� �޼ҵ�(���ع迭,�����ε��� ,�����ҹ迭,�����ε���,����)
		String[] hobby4=new String[5];					//new�� ���� ������ ���� ������ ��������� ����ٴ� �� 
		System.arraycopy(hobby, 0, hobby4, 0, 3);		//�迭hobby 0���ε����� ���������� hobby4�迭�� 0��°���� 3���� �����ϰڴ�
		
		for(int i=0;i<hobby4.length;i++) {				//����(0),�౸(1),����(2) => �� 3���� hobby4�� 0�� �ε������� ���ʴ�� �־��� ���� ���� 3,4�ε����� null�� ��µ�
			System.out.println(hobby4[i]);
		}
		hobby4[2]="��";
		System.out.println();
	}
	
	
	
	
	
	
}
