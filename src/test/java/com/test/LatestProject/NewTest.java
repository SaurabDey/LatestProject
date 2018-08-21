package com.test.LatestProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	public WebDriver driver;

	@Test
	public void f() {

		Assert.assertEquals(driver.getCurrentUrl(), "https://www.emirates.com/ae/english/");

		WebElement departureTextBox = driver.findElement(By.name("Departure airport"));
		departureTextBox.clear();
		String depart = "DXB";
		departureTextBox.sendKeys(depart);

		WebElement departureDrop = driver
				.findElement(By.xpath("//div[@class='dropdown']//li[@data-dropdown-id='" + depart + "']"));
		departureDrop.click();

		WebElement arrivalTextBox = driver.findElement(By.name("Arrival airport"));
		String arrival = "SIN";
		arrivalTextBox.clear();
		arrivalTextBox.sendKeys(arrival);

		WebElement arrivalDrop = driver
				.findElement(By.xpath("//div[@class='dropdown']//li[@data-dropdown-id='" + arrival + "']"));
		arrivalDrop.click();

		String startDate = datePicker(0);
		String endDate = datePicker(7);

		WebElement departDate = driver.findElement(By.xpath("//a[@aria-label='" + startDate + "']"));
		departDate.click();

		WebElement returnDate = driver.findElement(By.xpath("//a[@aria-label='" + endDate + "']"));
		returnDate.click();

		WebElement searchButton = driver.findElement(By.xpath("//button/span[text()='Search flights']"));
		searchButton.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		
		
		WebElement currency = driver.findElement(By.xpath("//strong[@class='price']"));
		System.out.println(currency.getText());
	}

	@BeforeTest
	public void beforeTest() {

		System.setProperty("webdriver.gecko.driver", "Resource/geckodriver.exe");
		driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.get("https://www.emirates.com/ae/english/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	public String datePicker(int days) {
		String pattern = "dd  MMM yy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, days);

		return sdf.format(cal.getTime()).toString();

	}

}
