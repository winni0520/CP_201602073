package test;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		Scanner sc = new Scanner (System.in);
		System.out.print("년도를 입력하세요 : ");
		num1 = sc.nextInt ();
		
	double result;
if ((num1 % 4 ==0) && (num1 % 100 != 0)|| (num1 % 400 ==0))
	System.out.println(num1 + "은 윤년입니다.");
else
	System.out.println(num1 + "은 윤년이 아닙니다.");
sc.close();
	}

}

