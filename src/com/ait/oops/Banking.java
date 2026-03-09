package com.ait.oops;

import java.util.Scanner;

public class Banking {
	
	int balance=4000;
	
	public void checkBalance() {
		System.out.println("Current Balance :"+balance);
	}
	void deposit(int amount) {
		
		if(amount>0) {
			balance+=amount;
			System.out.println(amount+" is deposited to Account and Updated Balance :"+balance);
		}
		else {
			System.out.println(amount+" is invalid Kindly enter valid amount.");
		}
	}
	void withdraw(int amount) {
		if(balance>=amount) {
			balance-=amount;
			System.out.println(amount+" is withdrawn and Updated balance :"+balance);
		}
		else {
			System.out.println("You are unable to withdraw due less balance.");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		Banking b=new Banking();
		
		while(true) {
			System.out.println("====Banking Menu====");
			System.out.println("1. Banking.");
			System.out.println("2. Help.");
			System.out.println("3. Exit.");
			System.out.println("Kinldy choose your option.");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("====Banking Services====");
				System.out.println("1. Checking Balance.");
				System.out.println("2. Deposit.");
				System.out.println("3. Withdraw.");
				System.out.println("Kinldy choose your option.");
				option =sc.nextInt();
				switch(option) {
				case 1:
					b.checkBalance();
					break;
				case 2:
					System.out.println("Enter the amount to deposit.");
					int amount=sc.nextInt();
					b.deposit(amount);
					break;
				case 3:
					System.out.println("Enter the amount to withdraw.");
					amount=sc.nextInt();
					b.withdraw(amount);
					break;
				}
				break;
			case 2:
				System.out.println("Toll Free No: 1800 1234 1234.");
				System.out.println("https://www.sbi.co.in");
				break;
			case 3:
				System.out.println("Thanks for Using Banking Services");
//				sc.close();
				return;
			}
			sc.close();
		}	

	}
}

















