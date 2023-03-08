package Tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheWebPageEbay
{
public static void main(String[] args) 
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.ebay.com/");
	String title=driver.getTitle();
	if(title.contains("eBay"))
		System.out.println("test pass");
	else
	System.out.println("test fail");
	
}
}
