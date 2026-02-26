package com.ait.abstraction;

abstract class Parent{
	
	int num=100;
	
	Parent(){
		System.out.println("Parent Class Constructor");
	}
	
	abstract void read();
	
	void eat() {
		System.out.println("Eat only Rice...");
	}
}

class Child1 extends Parent{
	
	@Override
	void read() {
		System.out.println("Reading Stories..");
	}
}

class Child2 extends Parent {
	@Override
	void read() {
		System.out.println("Reading Novels..");
	}
}
public class Application {
	
	public static void main(String args[]) {
		
		Child1 c1=new Child1();
		c1.num=200;
		System.out.println("Num is: "+c1.num);
        c1.read();
        c1.eat();
        
        Child2 c2=new Child2();
        System.out.println("Num is: "+c2.num);
        c2.read();
        c2.eat();
	}

}
