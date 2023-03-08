package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Dressimage=driver.findElement(By.xpath("//img[@alt=\"Dresses\"]"));
		Dimension d= Dressimage.getSize();
		int h=d.getHeight();
		int w=d.getWidth();
		System.out.println(h+ " " +w);
		driver.quit();
	}

}
