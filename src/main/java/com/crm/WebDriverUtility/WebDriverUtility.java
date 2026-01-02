package com.crm.WebDriverUtility;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtility {
	     
	              public void moveToElement(WebDriver w,WebElement we) {
	            	      Actions a=new Actions(w);
	            	      a.moveToElement(we).perform();
	            	    
	              }
	                 
	                    
	              public void Click(WebDriver w,WebElement we) {
            	      Actions a=new Actions(w);
            	      a.click(we).perform();
	              }
	                   
	                 public static String getParentFrame(WebDriver w) {
	                	     String p=w.getWindowHandle();
	                	        return p;
	                	 
	                 }
	                 public void switchToParentFrame(WebDriver w) {
	                	 String p=w.getWindowHandle();
                	      w.switchTo().window(p);
                	 
                 }
	                 public Set<String> getChild_Plusparent_ids(WebDriver w) {
	                	 Set<String> p=w.getWindowHandles();
                	        return p;
                	 
                 }
	                 public void switchToChildFrame(WebDriver w,Set<String> k) {
	                	 for(String web:k) {
	                		      if(!web.equals(WebDriverUtility.getParentFrame(w))) {
	                		    	      w.switchTo().window(web);
	                		      }
	                	 }
                	       
                	 
                 }
	                   
	                  
	                       
	                     public void switchToFrame(WebDriver w,int ind) {
	                    	  w.switchTo().frame(ind);
	                     }
	                     public void switchToFrame(WebDriver w,WebElement we) {
	                    	  w.switchTo().frame(we);
	                     }
	                     public void switchToFrame(WebDriver w,String name ) {
	                    	  w.switchTo().frame(name);
	                     }
	                     public void goToParentFrame(WebDriver w ) {
	                    	  w.switchTo().parentFrame();
	                     }
	                     
	                     public void goToSuperParentFrame(WebDriver w ) {
	                    	  w.switchTo().defaultContent();
	                     }
	                        


}
