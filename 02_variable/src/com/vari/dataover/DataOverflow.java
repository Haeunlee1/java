package com.vari.dataover;

public class DataOverflow {

	public static void main(String[] args) {
		//������ �����÷ο��ϱ�
		byte bnum = 125;
		// bnum++' �� bnum������ ���� +1 ��Ű�� ������
		System.out.println(++bnum);
		System.out.println(++bnum);
		System.out.println(++bnum);		// byte �� -128~+127������ �ٵ� 127���Ŀ� ������ �ߴ°� �ƴ϶� �ٽ� ��ó�� -128�� �Ѿ���� (ǥ�������� �������� ��� �ݺ���)
		System.out.println(++bnum);     // ������ �� ������ �ڷ��� ������Ÿ���� ū ������ �������ֱ� 
		
	
		
	}
}
