package com.ait.loops;

import java.util.Scanner;
public class LoopsExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter maximum fibonacci number you want: ");
		int number = scanner.nextInt();
		int first = 0, second = 1;
		System.out.println("Fibonacci Series: ");
		
		while (first <= number) {
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
		

	}

}
