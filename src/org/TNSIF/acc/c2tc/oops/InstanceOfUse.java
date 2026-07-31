package org.tnsif.acc.c2tc.oops;

class Pay1{
	void makePayment() {
		System.out.println("Processing Payment");
	}
}
class Card1 extends Pay1{
	void swipeCard() {
		System.out.println("Swiping Card");
	}
}
class PayPal extends Pay1{
	void login() {
		System.out.println("Logging into PayPal");
	}
}

public class InstanceOfUse {
	public static void main(String[] args) {
		Pay1 p = new Pay1();
		p = new PayPal();
		if(p instanceof Card1) {
			Card1 c = (Card1) p;
			c.swipeCard();
		}else if(p instanceof PayPal) {
			PayPal pp = (PayPal) p;
			pp.login();
		}
	}
}
