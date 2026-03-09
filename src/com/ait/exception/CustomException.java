package com.ait.exception;

import java.util.*;

class InvalidNameException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidNameException(String msg) {
		super(msg);
	}
	
}

public class CustomException {
	
	static void validateName(String n) throws InvalidNameException {
		
		if(!n.matches("[A-Z ]+[a-z ]+")) {
			throw new InvalidNameException("The Entered Name is not Valid");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.println("Enter Your Name:");
			
			String name=sc.nextLine();
			
			validateName(name);
			
			System.out.println("Your Name is Valid:"+name);
		}
		catch(InvalidNameException i) {
			System.out.println("Issue is:"+i.getMessage());
		}
		

	}

}















