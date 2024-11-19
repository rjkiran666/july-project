package testngpkg;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoitupload {
 ChromeDriver driver;
 @BeforeTest
 public void setup()
 {
	 driver = new ChromeDriver();
	 driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.manage().window().maximize();
	}
    @SuppressWarnings("deprecation")
	@Test
    public void robot() throws InterruptedException, IOException 
    {
 	   driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
 	   
 	   Runtime.getRuntime().exec("D:\\T2.exe");
 	   
 }
}

