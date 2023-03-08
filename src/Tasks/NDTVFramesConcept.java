package Tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NDTVFramesConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ndtv.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Reveal=driver.findElement(By.id("gavtab-11"));
		Reveal.click();
		driver.findElement(By.xpath("//span[text()=\"Reveal\"]")).click();
		
		
		
		
		
	}

}
