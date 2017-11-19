package pack;

public class Date {
	
	int year;
	int month;
	int day;
	String wMonth;
	
	public void printEastern() {
		System.out.println("동양식 날짜 표현: " + year + "." + month + "." + day);}
	public void printWestern() {
		 System.out.println("미국식 날짜 표현: " + wMonth + " " + day + ", " + year);}
	
}


