package com.ait.oops;

class Sample{
	protected int x=100;
	
	void display() {
		System.out.println("Sample Class Display Method." + x);
	}
}

class Sample2 extends Sample {
	int y = 200;

	void show() {
		System.out.println("Sample2 Class Show Method." + x);
	}
}

public class AccessModifiers {
	
	public int number=1000;

	public static void main(String[] args) {
		Sample s=new Sample();
		System.out.println(s.x);

	}

}
