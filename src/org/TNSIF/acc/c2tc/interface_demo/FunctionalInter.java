package org.tnsif.acc.c2tc.interface_demo;

@FunctionalInterface
interface NotificationService{
	void notifyUser(String message);
}

class Email implements NotificationService{
	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Email: "+message);
	}
}

class Sms implements NotificationService{
	@Override
	
	public void notifyUser(String message) {
		System.out.println("Sending SMS: "+message);
	}
}

class Whatsapp implements NotificationService{
	@Override
	public void notifyUser(String message) {
		System.out.println("Sending Whatsapp: "+message);		
	}
}

public class FunctionalInter {
	public static void main(String[] args) {
		NotificationService mail = new Email();
		mail.notifyUser("Hello from the other side!");
		NotificationService sms = new Sms();
		sms.notifyUser("Hello from this side!");
		NotificationService wa = new Whatsapp();
		wa.notifyUser("Hello form the other other side!");
	}
}
