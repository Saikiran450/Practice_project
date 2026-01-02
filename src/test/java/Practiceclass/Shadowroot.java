package Practiceclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Shadowroot {
	    @Test
	    public void getShadow() throws InterruptedException {
	    	
	    	  WebDriver w=new ChromeDriver();
	    	  w.manage().window().maximize();
	    	     w.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    	   
	    	      w.get("https://shop.polymer-project.org/");
//	    	    w.findElement(By.className("iron-selected"));
//	    	      Thread.sleep(6000);
	    	      
                  
	    	      WebElement shopApp =
		    	          w.findElement(By.tagName("shop-app"));
	    	        SearchContext shoapApps=  shopApp.getShadowRoot();
	    	      
//	    	   // Step 1: Open first shadow root (iron-pages)
//	    	      WebElement ironPages =
//	    	          shoapApps.findElement(By.cssSelector("iron-pages[role='main']"));
//
//	    	      SearchContext ironPagesShadow =
//	    	          ironPages.getShadowRoot();
              

	    	      // Step 2: Open second shadow root (shop-home)
	    	      WebElement shopHome =
	    	          shoapApps.findElement(By.cssSelector("shop-home[name='home']"));

	    	      SearchContext shopHomeShadow =
	    	          shopHome.getShadowRoot();


	    	      // Step 3: Access element inside shop-home shadow root
	    	      WebElement element =
	    	          shopHomeShadow.findElement(By.cssSelector("a[aria-label='Ladies Outerwear Shop Now']"));

	    	      element.click();

	    	
	    }

}
