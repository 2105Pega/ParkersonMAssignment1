package com.revature.Driver;

import com.revature.beans.*;



public class Driver {

	public static void main(String[] args) {
		Student Matthew = new Student("Matthew", 22);
		Student Parkerson = new Student("Parkerson", 22);
		System.out.println(Matthew.toString());
		System.out.println(Parkerson.toString());
		System.out.println("I think our trainer matt is intellectual LOLZ");
		Teacher matt = new Teacher("Matty", 10000);
		Teacher Knighten = new Teacher("Knighten", 10);
		System.out.println(matt.toString());
		System.out.println(Knighten.toString());
		System.out.println("I go by matt and I am cool trainer LOLZ");
		

	}

}
