package Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.amazon.com/");
         driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("laptops");
         driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
         Thread.sleep(2000);
         driver.close();
      
  
	}

}
