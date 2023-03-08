package Popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//div[contains(text(),'Upload Resume')]")).click();
		driver.findElement(By.name("file")).sendKeys("C:\\Users\\srisr\\Downloads\\THILAK.S.pdf");
		
		Thread.sleep(1000);
		driver.quit();
		}

}
