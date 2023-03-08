package Dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FetchDropDown
{
        public static void main(String[] args) throws InterruptedException
		{
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement dropdown=driver.findElement(By.id("searchDropdownBox"));
			Select s= new Select(dropdown);
			List<WebElement>dropdownList = s.getOptions();
			for(WebElement element:dropdownList) {
				System.out.println(element.getText());
				
			}
			driver.quit();
		
		}

	}

