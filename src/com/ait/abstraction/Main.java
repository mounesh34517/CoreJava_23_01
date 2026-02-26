package com.ait.abstraction;

interface Notification{
	void send();
}

interface Payment{
	
	void send();
}
class Email implements Notification,Payment {

	@Override
	public void send() {
		System.out.println("Sending Email Notification...");

	}

	

}

class SMS implements Notification {

	@Override
	public void send() {
		System.out.println("Sending SMS Notification...");

	}

}

class WhatsApp implements Notification {

	@Override
	public void send() {
		System.out.println("Sending WhatsApp Notification...");

	}

}

public class Main {

	public static void main(String[] args) {
		Notification notification;
		
		
		notification = new Email();
		notification.send();
		notification=new SMS();
		notification.send();
		notification=new WhatsApp();
		notification.send();

	}

}
