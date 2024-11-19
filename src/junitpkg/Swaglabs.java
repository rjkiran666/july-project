package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swaglabs {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com");
	}
     @Test
     public void Swaglabs() throws Exception
     {
    	 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
         driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
         driver.findElement(By.name("login-button")).click();
         driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
         driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("checkout")).click();
         Thread.sleep(3000);
         driver.findElement(By.id("first-name")).sendKeys("afghh");
         driver.findElement(By.id("last-name")).sendKeys("dfg");
         driver.findElement(By.id("postal-code")).sendKeys("13335");
         driver.findElement(By.id("continue")).click();
         driver.findElement(By.id("finish")).click();
         	
        
     }}
