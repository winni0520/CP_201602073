package test;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args)
    {
	int num1;
	Scanner sc = new Scanner (System.in);
	System.out.print("��ȯ�� �� �Է�: ");
	num1 = sc.nextInt ();
	
	double result;
			System.out.print(num1 + "�ʴ� " + (num1/3600) +"�ð� ");
			System.out.print((num1%3600)/60 +"�� ");
			System.out.print((num1%3600)%60 + "�� �Դϴ�");
	sc.close();
    }
}
