package com.ait.oops;

class Notification{
	
	void send(String msg) {
		System.out.println("Notification sent with SMS :" + msg);	
	}
}

class EmailNotification extends Notification {

	@Override
	void send(String msg) {
		System.out.println("Notification sent with Email :" + msg);
	}
}

class WhatsappNotification extends Notification {

	@Override
	void send(String msg) {
		System.out.println("Notification sent with Whatsapp :" + msg);
	}
}

public class NotificationService {

	public static void main(String[] args) {
		Notification n;
		
		n = new Notification();
		n.send("Hello Everyone.");

		n= new EmailNotification();
		n.send("Hello Everyone.");
		
		n = new WhatsappNotification();
		n.send("Hello Everyone.");
	}

}

















