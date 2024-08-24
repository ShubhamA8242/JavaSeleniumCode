package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM9 
{
	WebDriver driver;
	@FindBy (xpath="//span[text()='I agree']") WebElement IAgree;


	
	public POM9(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

public void click_IAgree()
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", IAgree);
	//IAgree.click();
}
	
}
