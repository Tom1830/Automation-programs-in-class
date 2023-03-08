package CrossBrowserParallelExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;



public class BaseClass 
{
	protected WebDriver driver;
	@Parameters("Browser")
	@BeforeMethod
public void Methodsetup(String browser)
{
	if(browser.equals("Chrome"))
		driver = new ChromeDriver();
    else if(browser.equals("Edge"))
    	driver=new EdgeDriver();
    else
    	System.out.println("invalid");
	
	
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}
	
	@AfterMethod
	public void methodteardown()
	{
		driver.quit();
	}
}
