package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input#email")).sendKeys("srisridharan253@gmail.com");
		driver.findElement(By.cssSelector("input._9npi")).sendKeys("12345678");
		driver.findElement(By.cssSelector("button._4jy1")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("button._42ft")).click();
		driver.close();
		
		

	}

}
