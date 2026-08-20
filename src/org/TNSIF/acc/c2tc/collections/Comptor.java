package org.tnsif.acc.c2tc.collections;

import java.util.*;

class Person{
	public String name;
	public Integer age;
	Person(String name, int age){
		super();
		this.name = name;
		this.age = age;
	}
}

class NameComp implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.name.compareTo(o2.name);
	}
}

class AgeComp implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age.compareTo(o2.age);
	}
}

public class Comptor {
	public static void main(String[] args) {
		ArrayList<Person> ppl = new ArrayList<>();
		ppl.add(new Person("Monish",21));
		ppl.add(new Person("Preran",20));
		
		ppl.sort(new AgeComp());
		
		for(Person p:ppl) {
			System.out.println(p.name+" "+p.age);
		}
	}
}
