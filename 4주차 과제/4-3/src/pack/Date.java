package pack;

public class Date {
	
	int year;
	int month;
	int day;
	String wMonth;
	
	public void printEastern() {
		System.out.println("����� ��¥ ǥ��: " + year + "." + month + "." + day);}
	public void printWestern() {
		 System.out.println("�̱��� ��¥ ǥ��: " + wMonth + " " + day + ", " + year);}
	
}


