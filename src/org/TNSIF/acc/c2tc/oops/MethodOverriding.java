package org.tnsif.acc.c2tc.oops;

// Parent Class
class Payment{
	double price;
	Payment(double price){
		this.price = price;
	}
	void makePayment() {
		System.out.println("Processing payment...");
	}
	double calcDiscount(double disc) {
		return this.price*(disc/100);
	}
	void applyDiscount(double disc) {
		this.price = this.price - this.calcDiscount(disc);
	}
}
//Child Class
class Upi extends Payment {
	Upi(double price){
		super(price);
	}
	@Override
	void makePayment() {
		super.makePayment();
		System.out.println("Payment: "+super.price);
		System.out.println("Making payment using UPI");
	}
}
class Card extends Payment{
	Card(double price){
		super(price);
	}
	@Override
	void makePayment() {
		super.makePayment();
		System.out.println("Payment: "+super.price);
		System.out.println("Making payment using Card");
	}
}
class Wallet extends Payment{
	Wallet(double price){
		super(price);
	}
	@Override
	void makePayment() {
		super.makePayment();
		System.out.println("Payment: "+super.price);
		System.out.println("Making payment using Wallet");
	}
}

//test to access grandparents
class A {
	int i = 0;
}
class B extends A{
	int i = 1;
	A getParent() {
		A parent = new A();
		return parent;
	}
}
class C extends B{
	int i = 2;
	int j = super.i;
	int k = super.getParent().i;
}

public class MethodOverriding {
	public static void main(String[] args) {
		Payment pay;

		pay = new Upi(100);
		pay.applyDiscount(10);
		pay.makePayment();
		
		pay = new Card(200);
		pay.applyDiscount(20);
		pay.makePayment();
		
		pay = new Wallet(300);
		pay.applyDiscount(30);
		pay.makePayment();
	}
}
