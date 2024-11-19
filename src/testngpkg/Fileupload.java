package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {

	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
	}
	@Test
	public void upload()
	{
	   driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\uthaman cs\\Pictures\\download.jpg");
	   driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	   driver.findElement(By.xpath("//*[@id=\\\"submitbutton\\\"]")).getText();
	   String u=driver.getTitle();
	   String exp="Submit";
	   if(u.equalsIgnoreCase(exp))
	   {
		   System.out.println("correct");
	   }
	   else
	   {
		   System.out.println("fail");
		   
			   
		   }
	   }
	}
	
	

      