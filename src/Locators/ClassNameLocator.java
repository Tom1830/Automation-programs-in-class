package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://m.facebook.com/");
		driver.findElement(By.className("_8qtn")).sendKeys("srisridharan");
		driver.findElement(By.className("_27z2")).sendKeys("123456");
		driver.findElement(By.className("_9cow")).click();

	}

}
