package pack7;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account = new BankAccount();
		Scanner input = new Scanner (System.in);
		System.out.println("계좌 1 정보 입력");
		System.out.print("계좌번호: ");
		account.accountNumber = input.next();
		System.out.print("예금주: ");
		account.owner = input.next();
		System.out.print("초기 잔액: ");
		account.balance = input.nextInt();
		
		System.out.println("계좌 2 정보 입력");
		System.out.print("계좌번호: ");
		account.accountNumber2 = input.next();
		System.out.print("예금주: ");
		account.owner2 = input.next();
		System.out.print("초기 잔액: ");
		account.balance2 = input.nextInt();
		
		System.out.print("계좌 1에서 계좌 2로 송금할 금액 : ");
		int send = input.nextInt();
		System.out.println("============================");
		if (send > account.balance)
			System.out.println("잔액 부족으로 계좌 이체가 실패했습니다.");
		else {
			System.out.println("계좌 1");
			System.out.println("계좌 번호: " + account.accountNumber);
			System.out.println("예금주: " + account.owner);
			account.withdraw(send);
			System.out.println(account);
			
			System.out.println("계좌 2");
			System.out.println("계좌 번호: " + account.accountNumber2);
			System.out.println("예금주: " + account.owner2);
			account.deposit(send);
			account.printDeposit();
		}
	}

}
