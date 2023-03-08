package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username_TF=driver.findElement(By.id("email"));
		username_TF.sendKeys("srisridharan253@gmail.com");
		WebElement password_TF=driver.findElement(By.id("pass"));
		password_TF.sendKeys("12345678");
		driver.close();

	}

}
