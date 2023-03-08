package WebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAttributeAccessibleNameTagNameGoogle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement google = driver.findElement(By.name("q"));
		System.out.println("text" +google.getText());
		System.out.println("type" +google.getAttribute("type"));
		System.out.println("accesible name" +google.getAccessibleName());
		System.out.println("tagname" +google.getTagName());
		
		WebElement location = driver.findElement(By.partialLinkText("Sign in"));
		Point p =location.getLocation();
		int x=p.getX();
		int y=p.getY();
		
		System.out.println(x+ " " +y);
		driver.quit();
		
		
	}

}
