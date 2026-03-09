package com.ait.exception;

import java.lang.reflect.InvocationTargetException;

public class ExceptionExample {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
		
		try {
			Class<?> cls=Class.forName("com.ait.oops.Saroj");
			Object obj=cls.getDeclaredConstructor().newInstance();
			cls.getMethod("checkBalance").invoke(obj);
		} catch (ClassNotFoundException e) {
			
			System.out.println("Issue:"+e.getMessage());
		}
		

	}

}




















