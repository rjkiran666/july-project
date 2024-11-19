package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesrc {
	static String baseurl="https://www.google.com";
	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get(baseurl);
		String src=driver.getPageSource();
		if(src.contains("images"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("not present");
		}
	}

}
