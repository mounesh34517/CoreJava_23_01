package com.ait.oops;

class Person{
	
	int pid;
	String pname;
	String address;
	static int views;
	
	void display() {
		int num=100;
		System.out.println(pname+"-"+address+" Number:"+num);
		
	}
}

public class OopsExample {

	public static void main(String[] args) {
		Person p1=new Person();
		
		p1.pname="Ram Charan";
		p1.address="Kadapa";
		Person.views=100;
		p1.display();
		System.out.println("Views"+Person.views);
		
		Person p2=new Person();
//		p2.views=2;
		System.out.println("Views"+Person.views);
		p2.display();

	}

}

















