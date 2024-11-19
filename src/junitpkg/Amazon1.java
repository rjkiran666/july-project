package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon1 {
           ChromeDriver driver;
           @Before
           public void setup() {
        	   driver= new ChromeDriver();
        	   driver.get("https://www.amazon.in");
           }
        	   @Test
        	   public void amazone() {
        		   driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("mobiles");
        		   driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
                   driver.findElement(By.xpath("//div[@id='nav-xshop']/a[6]")).click();
                   driver.findElement(By.xpath("//div[@id='nav-cart-count-container']/span")).click();
                   driver.findElement(By.xpath("//div[@class='nav-line-1-container']/span")).click();
        	   
        	   }
           
}
