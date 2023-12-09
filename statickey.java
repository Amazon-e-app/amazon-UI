package com.java.examples;

public class staticExp1 
{

	static int a = 10;
	
	public static void main(String[] args) 
	{
	   System.out.println("I am from static method main(), Value of a is "+a);
	   displayDetails(); // this is a static method and can be accessed without object
	   staticExp1 obj1 = new staticExp1();
	   obj1.details();
	   obj1.displayDetails(); // // this is a static method and can be accessed through a object as well
	   System.out.println("Static variables can be accessed through objects aslo a = "+obj1.a);
	   System.out.println("Static variables can be accessed without object also a = "+a);
	}
	
	public static void displayDetails()
	{
		System.out.println("I am from static method displayDetails(), Value of a is "+a);
	}
	
	public void details()
	{
		System.out.println("I am from instance method details(), value of static variable a is "+a);
	}

}
