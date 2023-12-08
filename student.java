package com.java.examples;

public class ArrayExp 
{

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50,60};
		System.out.println("Length of array a[] is "+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("i is "+a[i]);
		}
		String data = "I am learning 343 (*&";
		for(int i = 0;i<data.length();i++)
		{
			System.out.print(data.charAt(i));
			char ch = data.charAt(i);
			System.out.println(Character.isAlphabetic(ch));
		}
		String wd[] = data.split(" ");
		System.out.println("Number of words in the string are "+wd.length);
		
	}

}
