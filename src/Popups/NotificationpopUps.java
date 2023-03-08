package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationpopUps {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://pib.gov.in/indexd.aspx");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(1000);
		driver.quit();
	}

}
