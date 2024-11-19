package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Website {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("file:///C:/Users/uthaman%20cs/Desktop/website.html");
		driver.manage().window().maximize();
		}
        @Test
        public void website()
        {
        	driver.findElement(By.xpath("/html/body/input[1]")).click();
        	Alert a=driver.switchTo().alert();
        	String text=a.getText();
        	System.out.println("alert text="+text);
        	a.accept();
        	//a.dimiss//to cancel alert
        	driver.findElement(By.name("firstname")).sendKeys("duttu");
        	driver.findElement(By.name("lastname")).sendKeys("pj");
        }
}
