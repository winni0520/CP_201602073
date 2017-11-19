package pack3;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numAlphabet;

		Scanner sc = new Scanner (System.in);
		System.out.print("문자를 입력하세요 : ");
		String alphabet = sc.nextLine();
		if(alphabet.equals("a"))
			numAlphabet = 1;
		else if(alphabet.equals("e"))
			numAlphabet = 1;
		else if(alphabet.equals("i"))
			numAlphabet = 1;
		else if(alphabet.equals("o"))
		numAlphabet = 1;
		else if(alphabet.equals("u"))
		numAlphabet = 1;
		else numAlphabet = 2;
		
switch(numAlphabet) {
case 1:
	System.out.println("모음입니다.");
	break;
case 2:
	System.out.println("자음입니다.");
	break;
		}
	sc.close();
	}

}
