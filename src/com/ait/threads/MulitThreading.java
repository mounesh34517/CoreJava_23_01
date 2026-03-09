package com.ait.threads;

class First extends Thread{
	
	@Override
	public void run() {
		System.out.println("I am from First Class and State:"+Thread.currentThread().getState());
		
		
		
	}
	
}

class Second extends Thread{
	
	@Override
	public void run() {
		System.out.println("I am from Second Class and State:"+Thread.currentThread().getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

class Third extends Thread{
	
	@Override
	public void run() {
		System.out.println("I am from Third Class and State:"+Thread.currentThread().getState());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class MulitThreading {

	public static void main(String[] args) throws InterruptedException {
		
		First f=new First();
		Second s=new Second();
		Third t=new Third();
		f.setName("First");
		s.setName("Second");
		t.setName("Third");
		
//		System.out.println(f.getName()+" :First Thread State:"+f.getState());
		
		t.start();
		t.join();
		s.start();
		s.join();
		f.start();
		
//		System.out.println(f.getName()+" :First Thread State:"+f.getState());
	}

}
