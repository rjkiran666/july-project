  package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) {
		//chromedriver
		//edgedriver
		//firefoxdriver
		
		ChromeDriver driver=new ChromeDriver();// to open chrome driver
		driver.get("https://www.google.com"); // to launch application
		
	    String actualtitle=driver.getTitle();
	    String exptitle="Google";
	    if(actualtitle.equals(exptitle))
	    {
	    	System.out.println("pass");
	    }
	    else
	    {
	    	System.out.println("fail");
	    }
	    
	driver.quit();
	}

}
