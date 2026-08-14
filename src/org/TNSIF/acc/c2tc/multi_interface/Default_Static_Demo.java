package org.tnsif.acc.c2tc.multi_interface;

interface Vehicle{
	void start();
	void stop();
	int maxSpeed = 120;
	default void repair() {
		System.out.println("Vehicle is repaired!!!");
	}
	static void maintainance() {
		System.out.println("Vehicle is under maintainance");
	}
}

class Car implements Vehicle{
	private String model;
	Car(String model){
		this.model = model;
	}
	@Override
	public void start() {
		System.out.println("Car " + model+ " is starting!!!");
	}

	@Override
	public void stop() {
		System.out.println("Car "+model+" is stopping!!!");
	}
	
}

class Bike implements Vehicle{
	private String model;
	Bike(String model){
		this.model = model;
	}
	@Override
	public void start() {
		System.out.println("Bike "+model+" is starting!!!");
	}
	@Override
	public void stop() {
		System.out.println("Bike "+model+" is stopping!!!");
	}
	
}

public class Default_Static_Demo {
	public static void main(String[] args) {
		Car __ = new Car("Audi");
		Bike ___ = new Bike("Hero");
		
		System.out.println("------Vehicles Start------");
		__.start();
		___.start();
		
		System.out.println("------Vehicle Stop------");
		__.stop();
		___.stop();
		
		System.out.println("------Vehicle repair (default method)------");
		__.repair();
		___.repair();
		
		System.out.println("------Vehicle maintainance (static method)------");
		Vehicle.maintainance();
		System.out.println("Mac Speed: "+Vehicle.maxSpeed);
	}
}
