package com.mainmethod;

public class thisAndSuperClassA extends ClassC{

	public thisAndSuperClassA()
	{
		this(90);
		//super(60); Any on can be used not both
		
	}

	public thisAndSuperClassA(int x)
	{
		System.out.println("Constructor of A"+ x);
	}

	public int a=80;
	
	public void morning()
	{

		System.out.println(super.c);
		super.methodC();
		
		System.out.println(this.a);
		this.methodC();		
		
//		super.evening();
//		this.evening();
		

		
	}

	public void methodC()
	{
		System.out.println("Method C override");
		
		
	}

}
