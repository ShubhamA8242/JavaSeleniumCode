package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM8 
{
	WebDriver driver;
	@FindBy (xpath="//span[@class='VfPpkd-vQzf8d']") WebElement NextReviewAcc;


	
	public POM8(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void click_Next_reviewAcc()
	
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", NextReviewAcc);
		//NextReviewAcc.click();
	
	
	
	}
	
	
}
