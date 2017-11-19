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
System.out.println("요일을 구할 해당 연/월/일 을 입력하시오.");
System.out.print("연도: ");
year = sc.nextInt ();
System.out.print("월: ");
month = sc.nextInt();
System.out.print("일: ");
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
	System.out.println("월요일입니다.");
else if (last % 7 == 2)
	System.out.println("화요일입니다.");
else if (last % 7 == 3)
	System.out.println("수요일입니다.");
else if (last % 7 == 4)
	System.out.println("목요일입니다.");
else if (last % 7 == 5)
	System.out.println("금요일입니다.");
else if (last % 7 == 6)
	System.out.println("토요일입니다.");
else if (last % 7 == 0)
	System.out.println("일요일입니다.");
sc.close();
}
}
