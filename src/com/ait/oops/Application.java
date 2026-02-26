package com.ait.oops;

import java.util.Scanner;

class BankAccount{
	int balance;
	
	void checkBalance() {
		System.out.println("Current Balance :" + balance);
	}
	
	void deposit(int amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println(amount + " is deposited to Account and Updated Balance :" + balance);
		} else {
			System.out.println(amount + " is invalid Kindly enter valid amount.");
		}
	}
	
	void withdraw(int amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println(amount + " is withdrawn and Updated balance :" + balance);
		} else {
			System.out.println("You are unable to withdraw due less balance.");
		}
	}
	
}

class SavingAccount extends BankAccount{
	
	void addInterest() {
		balance += balance * 0.10;
		System.out.println("Interest added to Saving Account. Updated Balance :" + balance);
	}
}

class CuurentAccount extends BankAccount {

	void withdrawOverdraft(int amount) {
		if (balance + 5000 >= amount) {
			balance -= amount;
			System.out.println(amount + " is withdrawn from Current Account with Overdraft. Updated balance :" + balance);
		} else {
			System.out.println("You are unable to withdraw due less balance and overdraft limit.");
		}
	}
}

public class Application {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SavingAccount savingAccount = new SavingAccount();
		CuurentAccount currentAccount = new CuurentAccount();
		
		while(true) {
			System.out.println("====Banking Menu====");
			System.out.println("1. Saving Account.");
			System.out.println("2. Current Account.");
			System.out.println("3. Exit.");
			System.out.println("Kindly choose your option.");
			int option = sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("====Saving Account Services====");
				System.out.println("1. Checking Balance.");
				System.out.println("2. Deposit.");
				System.out.println("3. Withdraw.");
				System.out.println("4. Add Interest.");
				System.out.println("Kindly choose your option.");
				option = sc.nextInt();
				switch (option) {
				case 1:
					savingAccount.checkBalance();
					break;
				case 2:
					System.out.println("Enter the amount to deposit.");
					int amount = sc.nextInt();
					savingAccount.deposit(amount);
					break;
				case 3:
					System.out.println("Enter the amount to withdraw.");
					amount = sc.nextInt();
					savingAccount.withdraw(amount);
					break;
				case 4:
					savingAccount.addInterest();
					break;
				}
				break;
			case 2:
				System.out.println("====Current Account Services====");
				System.out.println("1. Checking Balance.");
				System.out.println("2. Deposit.");
				System.out.println("3. Withdraw with Overdraft.");
				System.out.println("Kindly choose your option.");
				option = sc.nextInt();
				switch (option) {
				case 1:
					currentAccount.checkBalance();
					break;
				case 2:
					System.out.println("Enter the amount to deposit.");
					int amount = sc.nextInt();
					currentAccount.deposit(amount);
					break;
				case 3:
					System.out.println("Enter the amount to withdraw.");
					amount = sc.nextInt();
					currentAccount.withdrawOverdraft(amount);
					break;
				}
				break;
			case 3:
				System.out.println("Thank you for Using.");
				sc.close();
				return;
			}
		}
	}

}























