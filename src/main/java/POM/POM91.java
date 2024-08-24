package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM91 
{
	
	@FindBy (xpath="//h1[@class='XY0ASe']") WebElement Welcometext;


	
	public POM91(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

public String verifygettext()
{
String welcometext	=Welcometext.getText();

return welcometext;
}
	
}
