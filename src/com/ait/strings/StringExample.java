package com.ait.strings;

public class StringExample {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("Hello");
		
		System.out.println(sb1);
		System.out.println("Memory address of stringBuffer: " + System.identityHashCode(sb1));
		sb1.append(" World");
	    sb1.delete(0,1);
	    String str = sb1.toString();
	    System.out.println(str.toUpperCase());
	}

}



















