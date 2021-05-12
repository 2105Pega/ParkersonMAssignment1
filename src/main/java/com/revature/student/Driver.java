package com.revature.student;
import com.revature.teacher.*;


public class Driver {
	
	public static void main(String[] args) {
		Teacher matt = new Teacher("Matty", 10000);
		Teacher Knighten = new Teacher("Knighten", 10);
		System.out.println(matt.toString());
		System.out.println(Knighten.toString());
		System.out.println("I go by matt and I am cool trainer LOLZ");
		
	}

}

