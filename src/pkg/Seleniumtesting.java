package pkg;

import org.openqa.selenium.chrome.ChromeDriver;
  
public class Seleniumtesting {
	static String baseurl="https://www.instagram.com";

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String actualtitle="Instagram";
		String exptitle="Instagram";
		String src=driver.getPageSource();
		 if(actualtitle.equals(exptitle))
		    {
		    	System.out.println("pass");
		    }
		    else
		    {
		    	System.out.println("fail");
		    }

	
            if(src.contains("Instagram"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("not present");
	}

	}}
