package com.ait.oops;

import java.util.*;

class Payment{
	void pay(int amount) {
		System.out.println(amount+" Payment paid through Cash mode.");
	}
	void pay(String cardNo, int amount) {
        System.out.println(amount+" Payment paid through Card No :"+cardNo);
	}
	void pay(String upiId,int amount, String pin) {
		System.out.println(amount+" Payment paid through UPI Id :"+upiId);
	}

	void pay(int amount, String wallet) {
		System.out.println(amount + " Payment paid through Wallet :" + wallet);
	}
}

public class PaymentServices {

	public static void main(String[] args) {
		Payment p=new Payment();
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println("====Payment Services Menu====");
			System.out.println("1. Pay through Cash.");
			System.out.println("2. Pay through Card.");
			System.out.println("3. Pay through UPI.");
			System.out.println("4. Pay through Wallet.");
			System.out.println("5. Exit.");
			System.out.println("Kindly choose your option.");
			int option=sc.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter the amount to pay.");
				int amount = sc.nextInt();
				p.pay(amount);
				break;
			case 2:
				System.out.println("Enter the Card No.");
				String cardNo = sc.next();
				System.out.println("Enter the amount to pay.");
				amount = sc.nextInt();
				p.pay(cardNo, amount);
				break;
			case 3:
				System.out.println("Enter the UPI Id.");
				String upiId = sc.next();
				System.out.println("Enter the amount to pay.");
				amount = sc.nextInt();
				System.out.println("Enter the UPI Pin.");
				String pin = sc.next();
				p.pay(upiId, amount, pin);
				break;
			case 4:
				System.out.println("Enter the Wallet Name.");
				String wallet = sc.next();
				System.out.println("Enter the amount to pay.");
				amount = sc.nextInt();
				p.pay(amount, wallet);
				break;
			case 5:
				System.out.println("Thanks for Using Payment Services");
				sc.close();
				return;
			}
		}

	}

}
