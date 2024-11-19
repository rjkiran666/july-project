package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdown {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	@Test
	public void dropdown()
	{
	WebElement day= driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
	Select ob= new Select(day);
	ob.selectByValue("05");
	WebElement month= driver.findElement(By.xpath("//*[contains(@name,'DOB_Month')]"));
	Select oj= new Select(month);
	oj.selectByValue("03");
	WebElement year= driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	Select os= new Select(year);
	os.selectByValue("2022");
	}
	@Test
	public void textcheck() {
		String buttontext= driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).getAttribute("value");
		System.out.println("buttontext");
		if(buttontext.equals("Check availability"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	
}}
