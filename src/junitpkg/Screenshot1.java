package junitpkg;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://facebook.com");
		
	}
	@Test
	public void screenshot() throws IOException
	{
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("D://screenshot1.png"));
		
		WebElement button=driver.findElement(By.name("login"));
		File s1=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s1, new File("./screenshot/buttonscreenshot.png"));
		
		
	}

}
