package WindowHandles;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.WebDriverUtility.WebDriverUtility;

public class WindowHandle {
	
	     @Test
	     public void moveToChild() {
	    	       
	    	   WebDriver w=new ChromeDriver();
	    	     w.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    	      w.get("https://omayo.blogspot.com/");
	    	          WebDriverUtility wt=new WebDriverUtility();
	    	           String parent=  wt.getParentFrame(w);
	    	              w.findElement(By.xpath("//a[@id='link1']")).click();
	    	                Set<String> set=wt.getChild_Plusparent_ids(w);
	    	                wt.switchToChildFrame(w, set);
	    	                wt.switchToParentFrame(w,parent);
	    	                
	    	                
	    	                
	    	             
	    	 
	    	 
	     }

}
