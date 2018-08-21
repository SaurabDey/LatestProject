package com.test.LatestProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.annotations.AfterTest;

public class NewTesttestNG {
  @Test
  public void f() {
	  String startDate=datePicker(0);
		String endDate=datePicker(7);
		
		System.out.println(startDate);
		System.out.println(endDate);
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  
  public String datePicker(int days) {
		String pattern = "dd  MMM yy";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR, days);

		return sdf.format(cal.getTime()).toString();

	}
}
