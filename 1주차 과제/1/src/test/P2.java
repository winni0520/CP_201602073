package test;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc = new Scanner (System.in);
		System.out.print("�⵵�� �Է��ϼ��� : ");
		num1 = sc.nextInt ();
		
	double result;
if ((num1 % 4 ==0) && (num1 % 100 != 0)|| (num1 % 400 ==0))
	System.out.println(num1 + "�� �����Դϴ�.");
else
	System.out.println(num1 + "�� ������ �ƴմϴ�.");
sc.close();
	}

}

