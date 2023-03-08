package WebElement;
import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GetScreenShotMethod
	{
       public static void main(String[]args) throws IOException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement Dressimage=driver.findElement(By.xpath("//img[@alt=\"Dresses\"]"));
			File src = Dressimage.getScreenshotAs(OutputType.FILE);
			File dest=new File("./Elementscreenshots/element1.png");
			FileUtils.copyFile(src,dest);			
		}

	}
	


