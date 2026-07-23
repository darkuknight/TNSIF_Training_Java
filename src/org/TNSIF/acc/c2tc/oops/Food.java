package org.TNSIF.acc.c2tc.oops;

public class Food {
	private String name;
	private double price = 100;
	private String category;
	Food(String name){
		this.name = name;
	}
	Food(String name,double price){
		this.name = name;
		this.price = price;
	}
	Food(String name,double price,String category){
		this.name = name;
		this.price = price;
		this.category = category;
	}
	private void display() {
		System.out.println("Food name: "+name);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
		System.out.println();
	}
	public static void main(String[] args) {
		Food f1 = new Food("dosa",100,"breakfast");
		f1.display();
		
		Food f2 = new Food("biriyani",299.99,"rice");
		f2.display();
	}
}
