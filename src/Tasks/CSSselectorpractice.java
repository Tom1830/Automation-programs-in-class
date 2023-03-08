package Tasks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselectorpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.cssSelector("input.gh-tb")).sendKeys("kajal");
		driver.findElement(By.cssSelector("input.btn")).click();
		Thread.sleep(2000);
		driver.close();

	}

}
