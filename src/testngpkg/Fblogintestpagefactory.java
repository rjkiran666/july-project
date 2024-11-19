package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintestpagefactory {
	 WebDriver driver;
     
     @BeforeTest
     public void setup() 
     {
     driver=new ChromeDriver();
     driver.get("https://www.facebook.com");
     }
     @Test
     public void createpage()
     {
    	 Fbloginpagefactory ob = new Fbloginpagefactory(driver);
    	 ob.process();
     }
}
