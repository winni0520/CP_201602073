package pack4;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�: ");
		String word = sc.nextLine();
		word = word.toLowerCase();
		int count = 0;
		int vowel = 0;
		int consonant = 0;
		 for (String retval: word.split(" ")){
			for ( int i = 0; i <retval.length(); i++)
			{
				char ch = retval.charAt(i);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowel++;
				else
					consonant++;
			}
				}
		
		System.out.println("������ ����: " + vowel );
		System.out.println("������ ����: " + consonant );
         vowel=0;
         consonant=0;

			}
		}
	