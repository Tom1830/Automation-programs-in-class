package JavaScripExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysAndClickUsingJSE {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.location=arguments[0]","https://www.amazon.com/");
		System.out.println(js.executeScript("return document.title"));
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(1000);
		
		WebElement searchTF = driver.findElement(By.id("twotabsearchtextbox"));
		js.executeScript("arguments[0].value=arguments[1]",searchTF,"smart watches");
		
		WebElement SearchButton =driver.findElement(By.id("nav-search-submit-button"));
		js.executeScript("arguments[0].click()",SearchButton);
		Thread.sleep(1000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
