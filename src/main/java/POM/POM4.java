package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM4 
{ 
	WebDriver driver;
	@FindBy (xpath="//input[@class='whsOnd zHQkBf'][1]") WebElement password;
	@FindBy (xpath="//input[@name='PasswdAgain']") WebElement confirmpassword;
	@FindBy (xpath="//div[@class='VfPpkd-RLmnJb']") WebElement Next_passwordpage;
	
	public POM4(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void input_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void input_confirmpassword(String cnfpwd)
	{
		confirmpassword.sendKeys(cnfpwd);
	}

	
	public void click_ConfirmpasswordNext()
	{
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", Next_passwordpage);

	}

}
