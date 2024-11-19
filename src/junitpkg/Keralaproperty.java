package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty {

	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
	}
			@Test
			public void login()
			{
			driver.findElement(By.id("ulogin")).sendKeys("akhisurya");
		    driver.findElement(By.name("upass")).sendKeys("12345");
		    driver.findElement(By.id("sub_logbtn")).click();
	
	
}}
