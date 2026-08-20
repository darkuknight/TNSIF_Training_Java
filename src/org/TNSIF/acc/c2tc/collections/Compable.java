package org.tnsif.acc.c2tc.collections;

import java.util.ArrayList;
import java.util.Collections;

class Person5 implements Comparable<Person5>{
	String name;
	int age;
	
	@Override
	public int compareTo(Person5 o) {
	
		return this.name.compareTo(o.name);
	}
	
	public Person5(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

     void display(){
    	 System.out.println("Name :"+name + " , Age :"+age);
     }
}

public class Compable {

	public static void main(String[] args) {
		ArrayList<Person5> people =new ArrayList<>();
		
		people.add(new Person5("John",27));
		people.add(new Person5 ("Anil",30));
		people.add(new Person5 ("Baskar",17));
		
		System.out.println("Sort by Name");
		
		Collections.sort(people);
		
		for(Person5 person:people)
		{
			person.display();
		}
		
	}

}