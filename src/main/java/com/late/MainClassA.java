package com.late;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mainmethod.ClassC;



public class MainClassA{

	
	public static void main(String[] args) {
		
		com.mainmethod.thisAndSuperClassA ref= new com.mainmethod.thisAndSuperClassA();
		ref.morning();
		ref.methodC();
		System.out.println(ref.c);
		

		
	}
}
