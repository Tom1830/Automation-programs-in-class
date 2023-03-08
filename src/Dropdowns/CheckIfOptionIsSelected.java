package Dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckIfOptionIsSelected {

	public static void main (String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s = new Select(dropdown);
		s.selectByIndex(5);
		
		if(s.getFirstSelectedOption().getText().contains("Books"))
		      System.out.println("Selected");
		else
			System.out.println("Not selected");
	       driver.quit();
	}
}
		
		
		
		
		
		

	


