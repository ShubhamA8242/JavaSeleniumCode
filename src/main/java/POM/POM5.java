package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM5 
{
	
	
	@FindBy (xpath="//input[@id='phoneNumberId']") WebElement phoneno;
	@FindBy (xpath="//span[@class='VfPpkd-vQzf8d']") WebElement NextPhoneno;
	
	WebDriver driver;
	
	public POM5(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void input_phoneno(String mob)
	{
		phoneno.sendKeys(mob);

	}
	
	public void click_NextPhoneNo()
	{

		((JavascriptExecutor)driver).executeScript("arguments[0].click();", NextPhoneno);
	}

	
	
}
