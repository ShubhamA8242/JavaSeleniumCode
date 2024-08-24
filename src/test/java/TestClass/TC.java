package TestClass;

import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
//import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.POM1;
import POM.POM2;
import POM.POM3;
import POM.POM4;
import POM.POM5;
import POM.POM6;
import POM.POM7;
import POM.POM8;
import POM.POM9;
import POM.POM91;
import net.bytebuddy.utility.RandomString;

public class TC 
{
	
	

	
WebDriver driver;
POM1 p1;
POM2 p2;
POM3 p3;
POM4 p4;
POM5 p5;
POM6 p6;
POM7 p7;
POM8 p8;
POM9 p9;
POM91 p91;


int tcid=4321;
	
public String getdata(String propname) throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\GMail\\src\\test\\resources\\data.properties");
	
	Properties prop=new Properties();

	prop.load(fis);
	
	String info=prop.getProperty(propname);
	
	return info;
}
@BeforeClass
public void openapp()
{
 driver=new ChromeDriver();

	
	  p1=new POM1(driver);
	  p2=new POM2(driver);
	  p3=new POM3(driver);
	  p4=new POM4(driver);
	  p5=new POM5(driver);
	  p6=new POM6(driver);
	  p7=new POM7(driver);
	  p8=new POM8(driver);
	  p9=new POM9(driver);
	 p91=new POM91(driver);
}

@BeforeMethod
public void openbrowser() throws InterruptedException
{
	driver.get("https://accounts.google.com/signup");

	//driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();	
	
	
	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	

}

@Test
public void info1() throws InterruptedException, IOException
{


	
	p1.input_firstname(getdata("FirstName"));
	p1.input_lastname(getdata("LastName"));
	p1.click_next();
	
	Thread.sleep(2000);
	
	p2.select_month();
	p2.input_day();
	p2.input_year();
	p2.select_gender();
	p2.click_next();
	
Thread.sleep(2000);


p3.input_username(getdata("UN"));
p3.click_UNnext();

Thread.sleep(2000);

p4.input_password(getdata("pwd"));
p4.input_confirmpassword(getdata("cnfpwd"));
p4.click_ConfirmpasswordNext();
	
Thread.sleep(2000);

p5.input_phoneno(getdata("mob"));
p5.click_NextPhoneNo();
Thread.sleep(2000);


p6.input_verificationcode();
p6.click_NextVerificationcode();

Thread.sleep(2000);
 
p7.click_skiprecovery();

Thread.sleep(2000);
 
p8.click_Next_reviewAcc();

Thread.sleep(2000);
 
p9.click_IAgree();

Thread.sleep(2000);

String acttext=p91.verifygettext();

//acttext.contains("Welcome");

assertTrue(acttext.contains("Welcome"));
	
}

@AfterMethod
public void sdgf() throws IOException
{
	File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	String s=RandomString.make(2);
	
	File dest=new File("C:\\Users\\HP\\Desktop\\New folder\\"+tcid+"-"+s+".png");
		
	FileHandler.copy(source, dest);
		
}

@AfterClass
public void teardown()
{
driver.quit();
}

}
