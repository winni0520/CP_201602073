package pack;

import java.util.Scanner;

public class TestDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		Scanner sc = new Scanner (System.in);
		System.out.print("연도 입력: ");
		date.year = sc.nextInt();
		System.out.print("월 입력: ");
		date.month = sc.nextInt();
		System.out.print("일 입력: ");
		date.day = sc.nextInt();
		
		if (date.month == 10)
			date.wMonth = "October";
		else if( date.month == 1)
			date.wMonth = "January";
		else if( date.month == 2)
			date.wMonth = "February";
		else if ( date.month == 3)
			date.wMonth = "March";
		else if ( date.month == 4)
			date.wMonth = "April";
		else if ( date.month == 5)
			date.wMonth = "May";
		else if (date.month == 6)
			date.wMonth = "June";
		else if ( date.month == 7)
			date.wMonth = "July";
		else if ( date.month == 8)
			date.wMonth = "August";
		else if ( date.month == 9)
			date.wMonth = "September";
		else if ( date.month == 11)
			date.wMonth = "November";
		else if ( date.month == 12)
			date.wMonth = "December";
	date.printEastern();
	date.printWestern();

	}

}