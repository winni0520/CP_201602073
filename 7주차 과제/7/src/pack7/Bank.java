package pack7;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		Scanner input = new Scanner (System.in);
		System.out.println("���� 1 ���� �Է�");
		System.out.print("���¹�ȣ: ");
		account.accountNumber = input.next();
		System.out.print("������: ");
		account.owner = input.next();
		System.out.print("�ʱ� �ܾ�: ");
		account.balance = input.nextInt();
		
		System.out.println("���� 2 ���� �Է�");
		System.out.print("���¹�ȣ: ");
		account.accountNumber2 = input.next();
		System.out.print("������: ");
		account.owner2 = input.next();
		System.out.print("�ʱ� �ܾ�: ");
		account.balance2 = input.nextInt();
		
		System.out.print("���� 1���� ���� 2�� �۱��� �ݾ� : ");
		int send = input.nextInt();
		System.out.println("============================");
		if (send > account.balance)
			System.out.println("�ܾ� �������� ���� ��ü�� �����߽��ϴ�.");
		else {
			System.out.println("���� 1");
			System.out.println("���� ��ȣ: " + account.accountNumber);
			System.out.println("������: " + account.owner);
			account.withdraw(send);
			System.out.println(account);
			
			System.out.println("���� 2");
			System.out.println("���� ��ȣ: " + account.accountNumber2);
			System.out.println("������: " + account.owner2);
			account.deposit(send);
			account.printDeposit();
		}
	}

}
