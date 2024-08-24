package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 
{
	WebDriver driver;
@FindBy (xpath="//input[@class='whsOnd zHQkBf']") WebElement username;
@FindBy (xpath="//span[@class='VfPpkd-vQzf8d'][1]") WebElement UNnextbutton;

public POM3(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void input_username(String UN)
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", username);
	username.sendKeys(UN);
}
public void click_UNnext()
{
	UNnextbutton.click();
}
}
