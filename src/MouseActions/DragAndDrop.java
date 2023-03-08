package MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement source = driver.findElement(By.id("box1"));
		Thread.sleep(2000);
		WebElement dest = driver.findElement(By.id("dropContent2"));
		
		Actions a = new Actions (driver);
		a.dragAndDrop(source, dest).perform();
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
