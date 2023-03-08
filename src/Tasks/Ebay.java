package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchTF = driver.findElement(By.name("_nkw"));
		searchTF.sendKeys("smartwatches");
		Thread.sleep(1000);
		searchTF.clear();
		searchTF.sendKeys("iphone");
		searchTF.submit();
		Thread.sleep(1000);
		driver.quit();
		
	}

}
