package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM6 {
	
	@FindBy (xpath="//input[@class='whsOnd zHQkBf']") WebElement verificationcode;
	@FindBy (xpath="//div[@class='VfPpkd-RLmnJb'][1]") WebElement NextVerificationcode;

	WebDriver driver;

	public POM6(WebDriver driver)
	
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void input_verificationcode() throws InterruptedException
	{
		Thread.sleep(60000);
	
	
	
	}
	
	public void click_NextVerificationcode()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", NextVerificationcode);
		//NextVerificationcode.click();
	}

	
	

}
