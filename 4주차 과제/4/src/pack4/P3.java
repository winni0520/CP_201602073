package pack4;

import java.util.Scanner;

public class P3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner (System.in);
System.out.print("���ڸ� �Է��Ͻÿ�: ");
String word = sc.nextLine();
for(int i = 0; i <= word.length(); i++) {
char character = word.charAt(i);
int ascii = (int) character;
if(ascii <= 90)
	ascii = ascii + 32;
else ascii = ascii - 32;
System.out.print((char)ascii);}
System.out.println("��ȯ�� ����: ");

}

}
