package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select s = new Select(dropdown);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		List<WebElement> selectedoptions = s.getAllSelectedOptions();
		for (WebElement  webelement : selectedoptions) {
			System.out.println(webelement.getText());
		}
           driver.quit();
	}

}
