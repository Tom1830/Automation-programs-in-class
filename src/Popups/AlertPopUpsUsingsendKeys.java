package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpsUsingsendKeys {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		
		Alert a1=driver.switchTo().alert();
		System.out.println(a1.getText());
		a1.sendKeys("selenium");
		Thread.sleep(1000);
		a1.accept();
		Thread.sleep(1000);
		
		driver.quit();
		

	}

}
