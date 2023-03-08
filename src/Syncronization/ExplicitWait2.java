package Syncronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWait2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()=\"Start\"]")).click();

		Wait<WebDriver> wait =new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(20))
				.ignoring(NoSuchElementException.class);
		
		WebElement header = wait.until(new Function<WebDriver,WebElement>(){
			public WebElement apply(WebDriver driver){
				WebElement e=driver.findElement(By.xpath("//h4[text()='Hello World']"));
				if(e.isDisplayed())
					return e;
				else
					return null;
			}
		});
		System.out.println(header.getText());
		driver.close();
			
		
	}

}
