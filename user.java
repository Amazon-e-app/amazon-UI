package com.java.pkg;

public class ExceptionExample1 
{

	public void myArrays() throws ArrayIndexOutOfBoundsException, ArithmeticException  
	{
		int a[] = {10,20,30,40,50,60};
		System.out.println("a[4]="+a[4]);
		System.out.println("a[7]="+a[7]);
	}
	
	
}

