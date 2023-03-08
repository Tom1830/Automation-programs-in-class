package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathbycontains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[contains(text(),\"Forgot\")]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),\"Return\")]")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
