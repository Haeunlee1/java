package com.vari.basic;
//���� ����!
public class BasicVariable {

	public static void main(String[] args) {
		//���������ϱ� -> ������� Ȯ���ϱ�
		boolean i;
		// ������ ���� ��Ī�� ������ ���� �Ծ�
		// 1. ��ҹ��� ������ �ǰ� ���� ������ ���� (������ ù���ڴ� �ҹ��ڷ�)
		char fwfrfe;
		//2. ����� ���Ұ�
		//3. ������ ù ���ڴ� ���ںҰ�
		// 4. Ư�����ڴ� _ �� $ �� ��밡��
		int b_sum;
		double s$num;
		String memberName;
		int arrayName;
		
		double j = 3.21;
		int mathRecode = 40;
		int mathScore = 5;
	    mathRecode = mathScore;
	    mathRecode = 100;
		System.out.println(mathRecode);
		System.out.println(mathScore);
		
		double height = 165;
		float weight;
		weight = 100;
		
		long longNum = 100;
		
		int age = 1, age1=2,age2=3;
		
		String nickName ="����ġ";
		System.out.println(nickName);
		
		String nickName1 = new String("����ġ");
		System.out.println(nickName1);
		
		String msg="������"+"�ݿ���";
		System.out.println(msg);
		
		System.out.println(nickName+msg);
		
		System.out.println("����"+5);
		
		System.out.println(height+weight+nickName);   
		System.out.println(""+height+weight+nickName);  // ����/����/���� �̷��� ���ε��� ��µǱ� ���Ѵٸ� �׿� ��ĭ ""�� �־��ָ� �ȴ� or �߰��� "" �־��ش� (���ڿͼ��ڻ��̿� ���ڿ��� �־��ش�)  
		System.out.println((height+weight)+nickName);   
		
		
		//��� = ������ �ʴ� ��, �빮�ڷ� �����
		final String ADMIN = "master";
		System.out.println(ADMIN);
		
		int a=0,b=1;
		
		
	}
}
