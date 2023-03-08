package Popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUsingAutoIt {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.className("uploadResume")).click();
		Runtime.getRuntime().exec("C:\\Users\\srisr\\Downloads\\sql resume sri.pdf");
		

	}

}
