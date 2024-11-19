package testngpkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ebay {
	ChromeDriver driver;
	//private FluentWait<WebDriver> //wait;
	//@BeforeTest
	//public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
	}
     @Test
     public void ebay()
     {
    	 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	 //WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
    	 WebElement e=driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/a"));
    	 Actions act=new Actions(driver);
    	 act.moveToElement(e).perform();
    	 //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")));
    	 driver.findElement(By.xpath("//*[@id=\"vl-flyout-nav\"]/ul/li[3]/div[2]/div[1]/nav[1]/ul/li[1]/a")).click();
   
    			 
    
}}
  