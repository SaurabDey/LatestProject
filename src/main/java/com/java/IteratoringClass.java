package com.java;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;


import jdk.nashorn.internal.runtime.arrays.IteratorAction;

public class IteratoringClass {

	public static void main(String[] args) {

		/*
		 * List<String> dayNames = new Vector<>();
		 * 
		 * dayNames.add("Sunday"); dayNames.add("Monday");
		 * dayNames.add("Tuesday"); dayNames.add("Wednesday");
		 * dayNames.add("Thursday"); dayNames.add("Friday");
		 * dayNames.add("Saturday");
		 * 
		 * Enumeration<String> enu= ((Vector<String>) dayNames).elements();
		 * 
		 * while (enu.hasMoreElements()) { String sel = (String)
		 * enu.nextElement();
		 * 
		 * System.out.println(sel);
		 * 
		 * }
		 */

		/*List<String> dayNames = new ArrayList<>();

		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		System.out.println("-----------Before-------------");
		System.out.println(dayNames);
		
		Iterator<String> it = dayNames.iterator();

		while (it.hasNext()) {
			String sel = (String) it.next();
			
			if (sel.contains("Thursday")) {
				it.remove();
			
			}
			

		}
		System.out.println("-----------After-------------");
		System.out.println(dayNames);
		*/
		
		
		List<String> dayNames = new ArrayList<>();

		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		System.out.println(dayNames);
		ListIterator<String> it = dayNames.listIterator();
		
		while (it.hasNext()) {
			String sel = (String) it.next();
			System.out.println(sel);
			
			if (sel.contains("Thursday")) {
				it.remove();
				it.add("IndependanceDay");
			
			}
		}
		System.out.println(dayNames);
		
		while(it.hasPrevious())
		{
			String sel = (String) it.previous();
			System.out.println(sel);
		}
	}

}
