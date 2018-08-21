package com.java;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MyCollection {
	public MyCollection()
	{
		super();
	}
	

	public static void main(String[] args) {

		String name1 = "Chandu";
		String name2 = "Vishal";
		String name3 = "Azhar";
		String name4 = "Tushar";
		String name5 = "Rohit";
		String name6 = "Saurab";

		/*
		 * String[] nameY={"Amol","Chandu", "Vishal"};
		 * System.out.println(nameY.length);
		 */

		// String[][] nameX= new String[8][2];
		// nameX[0][0]="Amol";
		// nameX[0][1]="Chandu";
		//
		// nameX[1][0]="Vishal";
		// nameX[1][1]="Azhar";
		//
		// System.out.println(nameX.length);
		//
		// for (int i = 0; i <2; i++)
		// {
		// for (int j = 0; j < 2; j++)
		// {
		// System.out.print(nameX[i][j]);
		// System.out.print(" ");
		// }
		// System.out.println("");
		//
		// }

		String name = "Amol";
		System.out.println(name.length());

		String[] nameX = new String[8];
		nameX[0] = "Amol";
		nameX[1] = "Chandu";
		nameX[2] = "Vishal";
		nameX[3] = "Azhar";
		nameX[4] = "Tushar";
		nameX[5] = "Rohit";
		nameX[6] = "Saurab";
		nameX[7] = "Dev";

		System.out.println(nameX.length);

		for (int i = 0; i < nameX.length; i++) {

			System.out.println(nameX[i]);
		}
		for (String arr : nameX) {
			
			System.out.println(arr);
		}

		System.out.println("=============List==================");
		List<String> nameList = new LinkedList<>();// ArrayList<>();
		nameList.add("Amol");//--0
		nameList.add("Chandu");//--1
		nameList.add("Vishal");
		nameList.add("Azhar");
		nameList.add("Tushar");
		nameList.add("Rohit");
		nameList.add("Saurab");
		nameList.add("Dev");
		nameList.add("Amol");
		nameList.add("Chandu");//--10
		nameList.add("Vishal");
		nameList.add("Azhar");
		nameList.add("Tushar");
		nameList.add("Rohit");
		nameList.add("Saurab");
		nameList.add("Dev");//--17

		System.out.println(nameList.size());

		for (int i = 0; i <nameList.size(); i++) {

			System.out.println(nameList.get(i));
		}
		
		
		
		System.out.println(nameList.contains("Akshay"));
		
		
		System.out.println(nameList.size());

		for (int i = 0; i < nameList.size(); i++) {

			System.out.println(nameList.get(i));
		}
		
		System.out.println(nameList);
		
		System.out.println("============Set===================");

		Set<String> nameSet = new HashSet<>();//TreeSet<>();//LinkedHashSet<>();//HashSet<>();
		nameSet.add("Amol");
		nameSet.add("Chandu");
		nameSet.add("Vishal");
		nameSet.add("Azhar");
		nameSet.add("Tushar");
		nameSet.add("Rohit");
		nameSet.add("Saurab");
		nameSet.add("Dev");
		nameSet.add("Amol");
		nameSet.add("Chandu");
		nameSet.add("Vishal");
		nameSet.add("Azhar");
		nameSet.add("Tushar");
		nameSet.add("Rohit");
		nameSet.add("Saurab");
		nameSet.add("Dev");

		System.out.println(nameSet.size());
		
		nameSet.add("Mumbai");

		for (String x : nameSet) {
			System.out.println(x);

		}
		System.out.println(nameSet);
		System.out.println("============Map===================");

		   //Key   //Value
		Map<String, String> nameMap= new LinkedHashMap<>();//TreeMap<>();//HashMap<>();
		
		nameMap.put("Amol", "90");
		nameMap.put("Chandu", "80");
		nameMap.put("Vishal", "20");
		nameMap.put("Azhar", "10");
		nameMap.put("Tushar", "60");
		nameMap.put("Rohit", "50");
		nameMap.put("Saurab", "30");
		nameMap.put("Dev", "20");
		
		System.out.println(nameMap);
		
		nameMap.put("Tushar", "200");
		nameMap.put("Paresh", "30");
		
		System.out.println(nameMap);
		                     //Amol,Chandu,Vishal,Azhar, tushar
		for (String nm : nameMap.keySet()) {
			
			System.out.print("Key : "+nm);
			System.out.print(" ");
			System.out.println("Value : "+nameMap.get(nm));
			System.out.println("");
		}
		
		System.out.println(nameMap.containsKey("Azhar"));
		System.out.println(nameMap.containsKey("India"));
	}
	

}
