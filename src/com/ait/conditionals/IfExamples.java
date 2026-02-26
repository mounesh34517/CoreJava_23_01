package com.ait.conditionals;


import java.util.Scanner;

public class IfExamples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Number: ");
		int num=scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("Its Sunday.");
			break;
		case 2:
				System.out.println("Its Monday.");
				break;
		case 3:
				System.out.println("Its Tuesday.");
				break;
		case 4:
				System.out.println("Its Wednesday.");
				break;
		case 5:
			System.out.println("Its Thursday.");
			break;
		case 6:
			System.out.println("Its Friday.");
			break;
		case 7:
			System.out.println("Its Saturday.");
			break;
		default:
			System.out.println("Invalid number entered. Please enter a number between 1 and 7.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
//		if(amount>=10000) {
//			System.out.println("You are eligible for 50% discount.");
//			double disc_amount=amount/2;
//			System.out.println("Total amount to be paid after discount: " + (amount-disc_amount));
//		}
//		else if(amount>=5000) {
//            System.out.println("You are eligible for 20% discount.");
//            double disc_amount=amount*20/100;
//            System.out.println("Total amount to be paid after discount: " + (amount-disc_amount));
//        }
//		else if(amount>=1000) {
//			System.out.println("You are eligible for 10% discount.");
//			double disc_amount=amount*10/100;
//			System.out.println("Total amount to be paid after discount: " + (amount-disc_amount));
//		}
//		else {
//			System.out.println("You are not eligible for any discount.");
//			System.out.println("Total amount to be paid: " + amount);
//		}
		
		
		
		
		
		
//		if(age>0) {
//			if (age >= 60) {
//				System.out.println("You are eligible for Pension.");	
//			}
//			else {
//				System.out.println("You are not eligible for Pension.");
//			}	
//		}
//		else {
//			System.out.println("Invalid age entered.");
//		}
//		
//		
//		
		
		System.out.println("Thank you!");
		scanner.close();
	}

}











