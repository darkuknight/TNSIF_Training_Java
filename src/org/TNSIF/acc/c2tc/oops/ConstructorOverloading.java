package org.tnsif.acc.c2tc.oops;

class Bottle{
	private String name;
	private int price;
	Bottle(){
		this.name = "cola";
 		this.price = 50;
	}
	Bottle(String name){
		this.name = name;
		this.price = 50;
	}
	Bottle(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

public class ConstructorOverloading {
	public static void main(String[] args) {
		Bottle coke = new Bottle();
		Bottle pepsi = new Bottle("pepsi");
		Bottle water = new Bottle("water",20);
		System.out.println(coke.getName()+" : "+coke.getPrice());
		System.out.println(pepsi.getName()+" : "+pepsi.getPrice());
		System.out.println(water.getName()+" : "+water.getPrice());
	}
}
