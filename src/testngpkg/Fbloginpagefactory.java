package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpagefactory {
    WebDriver driver;
    @FindBy( xpath = "//*[@id=\"reg_pages_msg\"]/a")
     WebElement createfb;
     @FindBy(xpath = "//*[@id=\"blueBarDOMInspector\"]/div/div[2]/div/div/span/a")
    WebElement singupfb;

 public Fbloginpagefactory(WebDriver driver)
 {
	 this.driver= driver;
	 PageFactory.initElements(driver, this);
 }
  public void process()
  {
	  createfb.click();
	  String src= driver.getPageSource();
	  if(src.contains("about"))
	  {
		  System.out.println("it contains");
	  }
	  else 
	  {
		  System.out.println("it doesnt contains");
	  }
	  singupfb.click();
 }}