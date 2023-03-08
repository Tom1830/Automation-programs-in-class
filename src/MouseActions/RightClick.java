package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.google.com/");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         
         WebElement SearchTF = driver.findElement(By.name("q"));
         
          Actions a = new Actions(driver);
         a.contextClick(SearchTF).perform();
         Thread.sleep(2000);
         driver.quit();
}

}
	