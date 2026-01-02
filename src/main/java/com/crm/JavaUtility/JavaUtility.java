package com.crm.JavaUtility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.testng.annotations.Test;

public class JavaUtility {

	@Test
	public int Random() {
		Random r = new Random();
		int randomNumber = r.nextInt(1000);
		return randomNumber;
	}

	@Test
	public String calender() {

		Date d = new Date();
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

		String actDate = s.format(d);
		return actDate;

	}
	        

}
