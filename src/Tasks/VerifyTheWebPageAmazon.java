package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheWebPageAmazon 
{
public static void main(String[] args) 
{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	String title=driver.getTitle();
	if(title.contains("Amazon"))
	{
		System.out.println("test pass");
	}
	else
	{
	System.out.println("test fail");
	}
}
}
