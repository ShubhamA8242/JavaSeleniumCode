package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
	
WebDriver driver;
@FindBy (xpath="//input[@class='whsOnd zHQkBf'][1]") WebElement Firstname;

@FindBy (xpath="//input[@aria-label='Last name (optional)']") WebElement Lastname;
//@FindBy (xpath="//input[@class='whsOnd zHQkBf'][2]") WebElement Lastname;
@FindBy (xpath="//div[@class='VfPpkd-RLmnJb']") WebElement Next;

public POM1(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}



//Gmail

public void input_firstname(String FirstName)
{
	Firstname.sendKeys(FirstName);
}

public void input_lastname(String LastName)
{
	Lastname.sendKeys(LastName);
}

public void click_next()
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", Next);
	//Next.click();
}




}
