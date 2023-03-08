package ScreenShotAs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOnWebPage {

	public static void main(String[] args) throws IOException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	TakesScreenshot webpage=(TakesScreenshot)driver;
	File src = webpage.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Elementscreenshots/s1.png");
	FileUtils.copyFile(src, dest);
	
	
	driver.quit();
	

	}

}
