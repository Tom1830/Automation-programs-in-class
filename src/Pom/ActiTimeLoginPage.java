package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimeLoginPage {
        
	    //Declation
		@FindBy(className ="atLogoImg")
		private WebElement  logo;
		
		@FindBy(id = "username")
		private WebElement usernameTF;
		
		@FindBy (name = "pwd")
		private WebElement passwordTF;
		
		@FindBy(id="loginButton")
		private WebElement loginbutton;
		
		//intialization
		public ActiTimeLoginPage(WebDriver driver)
		{
			PageFactory.initElements(driver,this);
			
		}
		
		//utilization
		public WebElement getlogo()
		{
			return logo;
		}
		public void setusername(String name)
		{
			usernameTF.sendKeys(name);
		}
		public void setpassword (String password)
		{
			passwordTF.sendKeys(password);
		}
		public void ClickLoinButton()
		{
			loginbutton.click();
		}

	}


