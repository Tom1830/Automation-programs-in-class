package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement location= driver.findElement(By.partialLinkText("Create new account"));
		Point p = location.getLocation();
		int x =p.getX();
		int y=p.getY();
		System.out.println(x+"/n"+y);
		driver.quit();
		

	}

}
