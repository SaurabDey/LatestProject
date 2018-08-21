package com.methods.copy;

public class Child extends Parent{

	public  int x= 70;
	
	public Child()
	{
		System.out.println("Child");
	}
	
	public void morning()
	{
		System.out.println(" ClassA morining");
		
		super.x=700;
	}
	

}
