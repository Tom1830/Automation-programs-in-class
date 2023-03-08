package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttributeAccessibleNameTagName {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Loginbutton = driver.findElement(By.name("login"));
		System.out.println("text" +Loginbutton.getText());
		System.out.println("get attribute" +Loginbutton.getAttribute("type"));
		System.out.println("assible name" +Loginbutton.getAccessibleName());
		System.out.println("tag name" +Loginbutton.getTagName());
		driver.quit();
		
	}

	
	
}
