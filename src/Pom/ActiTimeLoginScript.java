package Pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActiTimeLoginScript 
{
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	
	ActiTimeLoginPage login = new ActiTimeLoginPage(driver);
	
	if(login.getlogo().isDisplayed())
	{
		System.out.println("logo is displayed");
	}
	else
	{
		System.out.println("logo is not displayed");
	}
	
	login.setusername("admin");
	login.setpassword("manager");
	login.ClickLoinButton();
	
	
	WebDriverWait wait = new WebDriverWait (driver,Duration.ofSeconds(10));
	boolean status = wait.until(ExpectedConditions.titleContains("Time-Track"));
	
	if(status)
	{
		System.out.println("login test passed");
		
	}
	else
	{
		System.out.println("login test failed");
	}
	driver.quit();
  

   }
}

	
	
	
  

	

