package Popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//a[text()=\" GEARS \"]")).click();
		driver.findElement(By.xpath("//ul[@class=\"dropdown-menu gear_menu\"]/descendant::a[text()=\" SkillRary Essay\"]")).click();
		
		String parentID=driver.getWindowHandle();
		Set<String> ids=driver.getWindowHandles();
		
		for (String s : ids)
		{
			driver.switchTo().window(s);
			
		}
		driver.findElement(By.id("mytext")).sendKeys("sri");
		driver.findElement(By.xpath("//input[@value=\"Yes It's My Name\"]"));
		Thread.sleep(1000);
		driver.close();
	    driver.switchTo().window(parentID);
	    driver.quit();
		
	}

}
