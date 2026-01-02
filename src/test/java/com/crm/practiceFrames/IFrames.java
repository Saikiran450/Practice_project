package com.crm.practiceFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.WebDriverUtility.WebDriverUtility;

public class IFrames {
	
	     @Test
	   public void iframe() {
	    	 WebDriver w=new ChromeDriver();
	    	  w.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    	 w.get("https://demoapps.qspiders.com/ui/frames/multiple?sublist=2");
	    	WebElement we= w.findElement(By.xpath("//iframe[@class='w-full h-96']"));
	    	      WebDriverUtility wt=new WebDriverUtility();
	    	      wt.switchToFrame(w, we);
	    	     w.findElement(By.id("email")).click();
	    	     
	    	     
	    	    
	    	 
	     }
	     
	     
	       

}
