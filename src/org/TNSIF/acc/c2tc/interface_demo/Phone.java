package org.tnsif.acc.c2tc.interface_demo;

public class Phone implements SmartDevice{
	private int on = 0;
	@Override
	public void turnOn() {
		if(this.on==1) {
			System.out.println("Phone is already on!");
			return;
		}
		this.on = 1;
		System.out.println("Phone is turned on!");
	}
	@Override
	public void turnOff() {
		if(this.on==0) {
			System.out.println("Phone is already off!");
			return;
		}
		this.on = 0;
		System.out.println("Phone is turned off!");
	}
	@Override
	public void getStatus() {
		if(this.on==1) {
			System.out.println("Phone status: ON");
		}else {
			System.out.println("Phone status: OFF");
		}
	}
}

