package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
     ChromeDriver driver;
     @Before
     public void setup()
     {
    	 driver= new ChromeDriver();
    	 driver.get("https://www.facebook.com");
     }
     
     @Test
     public void fblogin()
     {
    	 driver.findElement(By.xpath("//input[@name='email']")).sendKeys("akhil69@gmail.com");
    	 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("we@132464");
    	 driver.findElement(By.name("login")).click();
     }
}
