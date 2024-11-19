package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttonrediff {
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
			WebElement Radiobutton = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]"));
			boolean R= Radiobutton.isSelected();
			WebElement Radiobutton1 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
			boolean R1= Radiobutton1.isSelected();
			
				if (R1)
				{
					System.out.println("radiobutton is selected");
				}
				else
				{
					System.out.println("logo is not selected");
			}
}}
