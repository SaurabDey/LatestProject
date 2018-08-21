package com.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortingClass {
	
	public static void main(String[] args) 
	{
		Set<Integer> nameSet = new TreeSet<>(new MyCompare());  //LinkedHashSet<>();//HashSet<>();
		
		
		nameSet.add(90);
		nameSet.add(10);
		nameSet.add(55);
		nameSet.add(3);
		nameSet.add(100);
		nameSet.add(77);
		nameSet.add(20);
		

		System.out.println(nameSet.size());
		System.out.println(nameSet);
		
		
		/*By default compareTo (77, 90) is been used to sort in ascending order via Comparable Interface
				s1 == s2 :0
				s1 > s2   :positive value
				s1 < s2   :negative value
		*/
		
		// To change the order we use Compare method of Comparator interface via a customised class
		
	}

}
