																																																																														package testngpkg;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {

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
	public void data() throws IOException, InterruptedException
	{
		FileInputStream ob= new FileInputStream("C:\\Users\\uthaman cs\\Downloads\\Untitled spreadsheet.xlsx");
	    XSSFWorkbook wb= new XSSFWorkbook(ob);
	    XSSFSheet sh = wb.getSheet("Sheet1");
	    int r=sh.getLastRowNum();
	    for(int i=1;i<=r;i++)
	    {           
	    	String email = sh.getRow(i).getCell(0).getStringCellValue();
	    	String pswd= sh.getRow(i).getCell(1).getStringCellValue();
	    	
	    	driver.findElement(By.xpath("//*[@id=\"ulogin\"]")).sendKeys("username");
       	 driver.findElement(By.xpath("//*[@id=\"upass\"]")).sendKeys("password");
       	 driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]")).click();
	    	driver.navigate().refresh();
}}}
