package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchPageSourceOfGoogle 
{

	public static void main(String[] args)
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		String pageSource=driver.getPageSource();
		if(pageSource.contains("Google"))
		      System.out.println("Test pass");
		else
			System.out.println("Test Fail");
		

	}

}
