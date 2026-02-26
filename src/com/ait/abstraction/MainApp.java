package com.ait.abstraction;

interface Parent1{
	int num=100;
	
	void eat();
	void read();
}
class Child3 implements Parent1{

	@Override
	public void eat() {
		System.out.println("Eating Rice...");
		
	}

	@Override
	public void read() {
		System.out.println("Reading Stories...");
		
	}
	
}

class Child4 implements Parent1 {

	@Override
	public void eat() {
		System.out.println("Eating Bread...");

	}

	@Override
	public void read() {
		System.out.println("Reading Novels...");

	}

}


public class MainApp {

	public static void main(String[] args) {
		
		Child3 c3 = new Child3();
//		c3.num=200;
		System.out.println("Num is: " + c3.num);
		c3.eat();
		c3.read();

		Child4 c4 = new Child4();
		System.out.println("Num is: " + c4.num);
		c4.eat();
		c4.read();

	}

}
