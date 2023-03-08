package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Logo = driver.findElement(By.className("atLogoImg"));
		 if(Logo.isDisplayed())
		 {
			 System.out.println("pass");
			 
		 }
		 else
		 {
			 System.out.println("fail");
		 }
	}

}
