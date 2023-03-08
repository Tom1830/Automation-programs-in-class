package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement Dressimage=driver.findElement(By.xpath("//img[@alt=\"Dresses\"]"));
		Rectangle r =Dressimage.getRect();
		System.out.println(r.getX());
		System.out.println(r.getY());
		System.out.println(r.getHeight());
		System.out.println(r.getWidth());
		driver.quit();
		
		

	}

}
