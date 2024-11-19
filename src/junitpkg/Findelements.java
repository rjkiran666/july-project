package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelements {
	public class facebook {
	    ChromeDriver driver;
	    @Before
	    public void setup() {
	    	driver= new ChromeDriver();
	    	driver.get("https://facebook.com");
	    	driver.manage().window().maximize();
	    }
	    @Test
	    public void findelements()
	    {
	    	List<WebElement> li=driver.findElements(By.tagName("a"));
	    	System.out.println("total no of links="+li.size());
	    	for
	    	(WebElement ele:li)
	    	{
	    	     String link=ele.getDomAttribute("href");
	    		 String linktext =ele.getText();
	    		 System.out.println(link+"-----"+linktext);
	    	}
	    }
}}
