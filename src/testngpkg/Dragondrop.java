package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragondrop {
   ChromeDriver driver;
   @BeforeTest
   public void setup()
   {
	   driver=new ChromeDriver();
	   driver.get("https://demo.guru99.com/test/drag_drop.html");
	   
   }
   @Test
   public void guru()
   {
	   WebElement g=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	   WebElement b=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	   Actions act=new Actions(driver);
	   act.dragAndDrop(g,b ).perform();
	   WebElement f=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	   WebElement d=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	   Actions bct=new Actions(driver);
	   bct.dragAndDrop(f,d).perform();
	   WebElement r=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	   WebElement s=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
	   Actions cct=new Actions(driver);
	   cct.dragAndDrop(r,s).perform();
	   WebElement x=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	   WebElement y=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
	   Actions dct=new Actions(driver);
	   dct.dragAndDrop(x,y).perform();
	   WebElement logo = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
		boolean l=logo.isDisplayed();
		
			if (l)
			{
				System.out.println("text is present");
			}
			else                                                                                                                                         
			{
				System.out.println("text is absent");
   }
}
}