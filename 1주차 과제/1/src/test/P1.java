package test;

import java.util.Scanner;

public class P1 {

    public static void main(String[] args)
    {
	int num1;
	Scanner sc = new Scanner (System.in);
	System.out.print("변환할 초 입력: ");
	num1 = sc.nextInt ();
	
	double result;
			System.out.print(num1 + "초는 " + (num1/3600) +"시간 ");
			System.out.print((num1%3600)/60 +"분 ");
			System.out.print((num1%3600)%60 + "초 입니다");
	sc.close();
    }
}
