package com.objparam.run;

import com.objparam.controller.ObjectParam;
import com.objparam.model.vo.Lunch;

public class Run {

	public static void main(String[] args) {

		ObjectParam op = new ObjectParam();
		int a = 10;
		String str ="���";
		
		op.basicParam(a, str);
		System.out.println(a+" : "+str);
		
		// 100 : ȣȣȣ ��µ�
		//main�� basicParam�� ��������� ��������
		//main ���� => basicParam���� => basic����������� a++, str+=�� ��/ �ٵ� return���� ������ basicParam ���� �� �Ҹ��(syso�� main������ ���������� ��µ� �ȵǰ� �Ҹ�)
		//�⺻�ڷ��� ������ ���� �Ұ�
		//main�� ���� a�� basic���� a�� �ٸ� ���̶�°� ��������
		//�޼ҵ� �������� �� basic�� �Ű������δ� ������ basic �������� ���� ���� �� return�� ������ main���� �鳯 �����غ��� main���� �ʱ�ȭ�� ���� ����
		//�⺻�ڷ��� �����Ϸ��� return �޼ҵ�� �����ϰ� �� ���� main ������ �־ ����ϱ� => a=op.basicParam(a,str);
		
		//�迭�� ���
		int[] numbers = {1,2,3,4};
		op.arrParam(numbers);
		System.out.println(numbers);
		for(int i=0; i<numbers.length;i++){
			System.out.print(numbers[i]+" ");
		}System.out.println();
		//100 200 3 4 ���
		//��? �迭�� arrParam�� �Ű������� arr�� �ּҰ��� �� => �迭�� �ּҸ� �����ϴϱ� ���� �����ǰ� (arrParam�޼ҵ��� �������) ��µ�
		
		//��ü�� ���
//		Lunch l = new Lunch();
//		l.setCapacity(1);
//		l.setName("¥����");
//		l.setPrice(5000);
//		l.setType("�ѽ�");
//		System.out.println(l.getType()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
//		//�ѽ� ¥���� 5000 1 ���
//		op.objParam(l);
//		System.out.println(l.getType()+" "+l.getName()+" "+l.getPrice()+" "+l.getCapacity());
		// �ѽ� �ܹ��� 8000 1 ���
		// �迭�� ���� ��ġ�� ���� �ּҸ� �����ϰ� �Ǵ� �޼ҵ� �ȿ��� ���� �ٲٸ� main���� ������ ��
		
		//�ּҰ��� �˸� ��� Ŭ����, ��� �޼ҵ忡���� ���� ����!
		//*1��
		Lunch lunch = new Lunch();
		lunch.setMenu("������");
		lunch.setPrice(5000);
		lunch.setPlace("���õ��");
		System.out.print(lunch.getMenu()+" "+lunch.getPrice()+" "+lunch.getPlace()+"\n");

		//*2��
		op.food(lunch);
		System.out.print(lunch.getMenu()+" "+lunch.getPrice()+" "+lunch.getPlace()+"\n");

		//*3��
		lunch.setCheck("üũ�׽�Ʈ");
		lunch.checkTest();
		
		//*4��
		new Lunch().setCheck("�̰ǹ���?");
		new Lunch().checkTest();
		
		
		
		
		op.setCheck("���԰�");
		op.checkTest();
		//���԰�10 ���
		new ObjectParam().setCheck("�̰�"); //new�� ���ο� ��ü�� ���� ���̴� setCheck�� ���� �־ �ؿ� checkTest���� ������
		new ObjectParam().checkTest();
		//null10 ���
		
		
		
		
		
		
		
		
		
	}

}
