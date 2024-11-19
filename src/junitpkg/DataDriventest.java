package junitpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DataDriventest {

	WebDriver driver;
	private Object i;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	@Test
	public void data() throws IOException
	{
		FileInputStream ob= new FileInputStream("C:\\Users\\uthaman cs\\Downloads\\Untitled spreadsheet.xlsx");
	    XSSFWorkbook wb= new XSSFWorkbook(ob);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    int r=sh.getLastRowNum();
	    for(int i=1;i<=r;i++);
	    {
	    	String email = sh.getRow(r).getCell(0).getStringCellValue();
	    	String pswd= sh.getRow(r).getCell(0).getStringCellValue();
	    	
	    	driver
	    }
	    		
	    
	
	
	}
}
