package com.test.LatestProject;

public final class Tes {

	private int i;
	public Tes(int i)
	{
		this.i=i;
	}
	
	public Tes method(int i)
	{
		if (this.i==i) {
			
			return this;
			
		}
		else
		{
			return (new Tes(i));
		}
	}
}
