package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement CourseTab = driver.findElement(By.id("course"));
		Thread.sleep(2000);
		Actions mousehover=new Actions(driver);
		mousehover.moveToElement(CourseTab).perform();
		driver.findElement(By.xpath("//span[@class=\"wrappers\"]//a[text()=\"Selenium Training\"]")).click();
		
		WebElement Add = driver.findElement(By.id("add"));
		Thread.sleep(1000);
		Actions doubleclick = new Actions(driver);
		doubleclick.doubleClick(Add).perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
