package com.java.examples;

public class Numbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("I am from main block of code");
		Numbers1 xyz = new Numbers1();
		Numbers1 abc = new Numbers1();
		Numbers1 mlo = new Numbers1();
		Numbers1 n = new Numbers1();
		/*n.goodnight();
		xyz.hai();
		xyz.hello();
		abc.hai();
		abc.hello();
		abc.goodnight();
		xyz.goodnight();
		mlo.goodnight();
		mlo.goodnight();
		mlo.goodnight();
		mlo.goodnight();*/
		for(int i=1;i<=11;i=i+10) 
		{
			mlo.goodnight();
		}
		int x = 0;
		for(int i=1;i<=1800;i=i+30)
		{
		    x = x +1;
			System.out.println("take emi "+x);
		}
		
	}
	
	public void hello()
	{
	  System.out.println("I am from hello block of code");	
	}
	
	public void hai()
	{
		System.out.println("I am from hai block of code");
	}
	
	public void goodnight()
	{
		System.out.println("Good Night everyone");
	}

}

