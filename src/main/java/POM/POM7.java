package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM7 
{
	
	WebDriver driver;
	
	@FindBy (xpath="//div[@class='VfPpkd-RLmnJb']") WebElement Skip_recovery;


	
	public POM7(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void click_skiprecovery()
	
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Skip_recovery);
		//Skip_recovery.click();
	
	
	
	}
	
	

}
