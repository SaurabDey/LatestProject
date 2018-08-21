package com.test.LatestProject;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;

public class Selenium {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "Resource/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		int password=12345;
		
		driver.findElement(By.id("pass")).sendKeys(String.valueOf(password));
		
			}

}
