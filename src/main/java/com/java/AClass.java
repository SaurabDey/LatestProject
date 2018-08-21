package com.java;

public class AClass extends BClass 
{
	int a= 90;
	
	public int morning(int x)
	{
		System.out.println("morning");
		return a;
	}
	
	public static void evening()
	{
		System.out.println("evening");
	}
	
	public  void evening(int c)
	{
		System.out.println("evening");
	}
	
	public static void evening(int c, String x)
	{
		System.out.println("evening");
	}

}
