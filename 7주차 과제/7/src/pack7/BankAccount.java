package pack7;

public class BankAccount {

	String accountNumber;
	String accountNumber2;
	String owner;
	String owner2;
	int balance;
	int balance2;
	
	void deposit(int amount) {
		balance2 = balance2 + amount;
	}
	void withdraw(int amount) {
		balance = balance - amount;
	}
	public String toString() {
		return "ภÜพื: " + balance;
		
	}
	public void printDeposit() {
		System.out.println("ภÜพื: " + balance2);
	}
}
