package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reddifregistration {
               ChromeDriver driver;
               @Before
               public void setup()
               {
               driver=new ChromeDriver();
               driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
              driver.manage().window().maximize();
               }
               @Test
               public void rediffreg()
               {
            	   List<WebElement> li=driver.findElements(By.tagName("a"));
            	   if(li.size()==30)
            	   {
            		   System.out.println("test passed:total no of links is 30");
            	   }
            	   else
            		   System.out.println("test faild:total no of links="+li.size());
               }
               @Test
               public void Test2()
               {
            	   String src=driver.getPageSource();
            	   String expectedtitle="create a Rediffmail account";
            	   if(src.contains(expectedtitle))
            	   {
            		   System.out.println("pass");
            	   }
            	   else
            	   {
            		   System.out.println("fail");
            	   }
            	   
               }
               
}
