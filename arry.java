package com.java.examples;

public class ConstExamples2 
{	
	int empID;
	String empName;
	float empSalary;

	public ConstExamples2(int id, String nm, float sal)
	{
        empID = id;
        empName = nm;
        empSalary = sal;
	}
	
	
	public static void main(String[] args) 
	{
		ConstExamples2 obj1 = new ConstExamples2(14,"Srinu",150000);
		obj1.displayDetails();
		obj1.giveHike();
		ConstExamples2 obj2 = new ConstExamples2(11,"Pranav",50000);
		obj2.displayDetails();
		obj2.giveHike();
	}
	
	
    public void displayDetails()
    {
    	System.out.println("**********************I am from method displayDetails*******************");
    	System.out.println("Value of empID is "+empID);
    	System.out.println("Value of empName is "+empName);
    	System.out.println("Value of empSalary is "+empSalary);
    }
    
    public void giveHike()
    {
    	System.out.println("*********************I am from method giveHike**************************");
    	System.out.println("EmpID is "+empID);
    	System.out.println("EmpName is "+empName);
    }
	
}
