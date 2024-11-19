package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediflogo {
    ChromeDriver driver;
	@Before
	public void setup()
	{
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
	}
	@Test
	public void redifflogs()
	{
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[2]/td"));
		boolean l=logo.isDisplayed();
		
			if (l)
			{
				System.out.println("logo is present");
			}
			else
			{
				System.out.println("logo is absent");
		}
		
		
	}
}
