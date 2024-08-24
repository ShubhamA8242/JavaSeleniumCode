package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class POM2 
{
@FindBy (xpath="//select[@class='gNnnTd']") WebElement month;
@FindBy (xpath="//input[@id='day']") WebElement Day;
@FindBy (xpath="//input[@id='year']") WebElement Year;
@FindBy (xpath="//select[@id='gender']") WebElement gender;


@FindBy (xpath="//div[@class='VfPpkd-RLmnJb']") WebElement next;


Select s;
WebDriver driver;

public POM2(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public void select_month()
{
	 s=new Select(month); 
	
	s.selectByValue("2");
}

public void input_day()
{
	Day.sendKeys("2");
}

public void input_year()
{
	Year.sendKeys("1996");
}


public void select_gender()
{
	s=new Select(gender);
	s.selectByValue("2");
	
}

public void click_next()
{
	((JavascriptExecutor)driver).executeScript("arguments[0].click();", next);

}

}
