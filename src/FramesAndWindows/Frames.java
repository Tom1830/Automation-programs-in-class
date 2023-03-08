package FramesAndWindows;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.snapdeal.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.id("pushDenied"));
			WebElement sigin = driver.findElement(By.className("accountUserName"));
			  Actions a=new Actions(driver);
			  a.moveToElement(sigin).perform();
			  driver.findElement(By.xpath("//a[text()=\"login\"]")).click();
			  
			  driver.switchTo().frame(0);
			  driver.findElement(By.id("userName")).sendKeys("123456789");
			  driver.findElement(By.className("sd-icon-delete-sign")).click();
			  
			  driver.switchTo().defaultContent();
			  driver.findElement(By.id("inputValEnter")).sendKeys("dress");
			  driver.findElement(By.className("searchTextSpan")).click();
			  driver.quit();
	}
}
			  
			  
			  
			  

	
