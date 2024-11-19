package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loginurl {
         ChromeDriver driver;
         @BeforeTest
        	 public void setup () {
        		 driver = new ChromeDriver();
        		 driver.get("https://keralaproperty.in/member/login/");
         }
         @Test
         public void login() throws InterruptedException
         {
        	 driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("uthamakiranam@gmail.com");
        	 driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("@kiran123");
        	 driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
        	 Thread.sleep(3000);
        	 String act=driver.getCurrentUrl();
        	 String exp="https://keralaproperty.in/member/myhome/";
        	 System.out.println(act);
        	 if(act.equalsIgnoreCase(exp))
        	 {
        		 System.out.println("pass");
        		 
        	 }
        	 else
        		 {
        			 System.out.println("fail");
        		 }
        	 
        	 
        	 
         }}

