package pack4;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		try {
		System.out.print("문자를 입력하시오: ");
		String word = sc.nextLine();
		byte[] bytes = word.getBytes("US-ASCII");
		System.out.println("아스키 코드는 " );
		System.out.println(Arrays.toString(bytes));
ByteBuffer buffer = ByteBuffer.wrap(bytes);
int result = buffer.getShort();

System.out.print("문자 변환: ");
		
			}
		catch (java.io.UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
	}
}


