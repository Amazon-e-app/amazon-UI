package com.java.examples;

public class StaticExp2 
{
	
	long accountNumber;
	String customerName;
	static String bankName;
	
	public StaticExp2(long accNum, String custName, String bnkName)
	{
		accountNumber = accNum;
		customerName = custName;
		bankName = bnkName;
	}
	
	public static void main(String[] args)
	{
		StaticExp2 obj1 = new StaticExp2(2234232,"Raju","ICICI");
		StaticExp2 obj2 = new StaticExp2(2345123,"Ravi","ICICI");
		StaticExp2 obj3 = new StaticExp2(2343424,"Shyam","ICICI");
		obj1.displayDetails();
		obj2.displayDetails();
		obj3.displayDetails();
	}
	
	public void displayDetails()
	{
		System.out.println("******************************************");
		System.out.println("accountNumber="+accountNumber);
		System.out.println("customerName="+customerName);
		System.out.println("bankName="+bankName);
		System.out.println("******************************************");
	}
	
}
