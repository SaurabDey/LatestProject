package com.java;

public class Calculation 
{
	
	
	public void add()
	{
		System.out.println("Normal Method");
	}
	
	public int add(int x)
	{
		System.out.println("Int Method");
		
		return x+40;
	}
	
	public long add(long x)
	{
		System.out.println("Long Method");
		
		return x +70;
	}
	
	public void add(int x , int y)
	{
		System.out.println("2 Int Method");
	}
}
