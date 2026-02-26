package com.ait.oops;


class First{
	int num1=100;
	void display() {
		System.out.println("First Class Display Method."+num1);
	}
}
class Second extends First{
	int num2 = 200;
	
	void show() {
		
		System.out.println("Second Class Show Method."+num2);
	}
}

class Third extends Second {
	int num3 = 300;

	void print() {
		System.out.println("Third Class Print Method." + num3);
	}
}

public class MainApplication {

	public static void main(String[] args) {
		
//		First f=new First();
//		f.display();
		
//		Second s=new Second();
//		s.display();
//		s.show();
		
		Third t = new Third();
		t.display();
		t.show();
		t.print();
	}

}
