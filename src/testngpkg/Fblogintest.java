package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fblogintest {
      WebDriver driver;
      
      @BeforeTest
      public void setup() throws InterruptedException
      {
      driver=new ChromeDriver();
      driver.get("https://www.facebook.com");
      }
    	  @Test
    	  public void testlogin() {
    		  
    	  
    	Fbloginpage ob = new Fbloginpage(driver);
    	
    	ob.setvalues("suttu@gmail.com","13@W67");
    	  ob.login();
      }
}
