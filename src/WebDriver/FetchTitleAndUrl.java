package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FetchTitleAndUrl 
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title=driver.getTitle();
	String url=driver.getCurrentUrl();
	
	System.out.println(title+"\n"+url);
			
}
}
