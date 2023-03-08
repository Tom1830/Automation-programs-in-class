package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath(" //button[text()=\" Add to Cart\"]")).click();
		
		//Alert al=driver.switchTo().alert();//instation
		//System.out.println(al.getText());
		//al.accept(); // here we perform ok task
		//Thread.sleep(1000);
		
        driver.findElement(By.xpath(" //button[text()=\" Add to Cart\"]")).click();
		
		Alert a2=driver.switchTo().alert();
		System.out.println(a2.getText());
		a2.dismiss();//here we perform cancel task
		
		Thread.sleep(2000);
		driver.quit();
	}

}
