package pack2;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year;
int month;
int day;
int uYear;
int pYear;
int amonth;
int fmonth;
int last;
int xyear;
int zyear;

Scanner sc = new Scanner (System.in);
System.out.println("������ ���� �ش� ��/��/�� �� �Է��Ͻÿ�.");
System.out.print("����: ");
year = sc.nextInt ();
System.out.print("��: ");
month = sc.nextInt();
System.out.print("��: ");
day = sc.nextInt();


double result;
if((year % 4 ==0) && (year % 100 != 0)|| (year % 400 ==0))
	xyear = 1;
	else xyear = 0;
if ((month-1)>=2)
	zyear = xyear;
	else zyear = xyear-1;

uYear = ((year-1)/4 - (year-1)/100 + (year-1)/400);
pYear = (year - 1 - uYear );
if( month<=1)
	amonth=0;
else amonth = ((month - 1) / 2 ) + 1;
if(month==1)
	fmonth=0;
else fmonth = (((month - 1 - amonth) * 30) + (amonth *31) + zyear - 2);
	last = (uYear * 366) + (pYear * 365) + fmonth + day ;
	
if (last % 7 == 1)
	System.out.println("�������Դϴ�.");
else if (last % 7 == 2)
	System.out.println("ȭ�����Դϴ�.");
else if (last % 7 == 3)
	System.out.println("�������Դϴ�.");
else if (last % 7 == 4)
	System.out.println("������Դϴ�.");
else if (last % 7 == 5)
	System.out.println("�ݿ����Դϴ�.");
else if (last % 7 == 6)
	System.out.println("������Դϴ�.");
else if (last % 7 == 0)
	System.out.println("�Ͽ����Դϴ�.");
sc.close();
}
}
