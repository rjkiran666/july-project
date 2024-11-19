package testngpkg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Trivago {
    WebDriver driver;
    @BeforeTest
    public void setup()
    {
    	driver= new ChromeDriver();
   driver.get("https://www.trivago.com.tr/");
    }
    @Test
    public void datepicker()
    {
    	
    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[1]/fieldset/button[1]/span/span[2]/span[2]")).click();
     
     datepickermethod("December 2024","23");
        datepickermethod1("December 2024","31");
    }
	private void datepickermethod1(String expmonth, String expdate) {
		while(true) {
			String month= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
			System.out.println("month ="+month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
			}
		}
		
			List<WebElement> date= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[29]/time"));
		 for(WebElement d:date)
		 {
			 
			 String datetext=d.getText();
			 if(datetext.equals(expdate))
			 {
				 d.click();
				 break;
			 }}
					
				 
		
	}
	private void datepickermethod(String expmonth1, String expdate1) {
		while(true) {
		String month1= driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();
		System.out.println("month1 ="+month1);
		if(month1.equals(expmonth1))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
		}
	}
	
		List<WebElement> date1= driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/div[2]/section/div[2]/div/div[4]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button[37]/time"));
	 for(WebElement d1:date1)
	 {
		 
		 String datetext1=d1.getText();
		 if(datetext1.equals(expdate1))
		 {
			 d1.click();
			 break;
		 }
	 
		 
		 {
			 
		 }
		 
		 
		 {
			 
		 }
}}}
