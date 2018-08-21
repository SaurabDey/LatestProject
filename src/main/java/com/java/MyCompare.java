package com.java;

import java.util.Comparator;

public class MyCompare implements Comparator<Integer>{

                             //3          90
	public int compare(Integer o1, Integer o2) 
	{
//		if (o1>o2) 
//		{
//			return -1;
//		}
//		else if(o1<o2)
//		{
//			return +1;
//		}
//		else
//		{
//			return 0;
//		}
		
	//	return o1.compareTo(o2);//------- Ascending
		return o2.compareTo(o1);//------- Desending 
		
		//90 3
	}

}
