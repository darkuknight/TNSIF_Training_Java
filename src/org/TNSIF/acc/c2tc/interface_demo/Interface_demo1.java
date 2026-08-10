package org.tnsif.acc.c2tc.interface_demo;

public class Interface_demo1 {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.turnOn();
		p.getStatus();
		p.turnOff();
		p.getStatus();
	}
}
