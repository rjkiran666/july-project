package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlexpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void cricket() 
	{
		
	WebElement searchfield=driver.findElement(By.name("q"));
	searchfield.sendKeys("cricket",Keys.ENTER);
	driver.findElement(By.name("btnk")).click();
	}
	  

}
